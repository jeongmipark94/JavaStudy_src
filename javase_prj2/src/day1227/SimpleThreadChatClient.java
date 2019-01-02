package day1227;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * Thread�� ����Ͽ� ���ѷ����� �ڵ带 ���ÿ� �����Ų��. ȭ�� �����ΰ� �޼����� ������ �ڵ�� ���ÿ� �����Ų��.
 * 
 * @author owner
 */
@SuppressWarnings("serial")
public class SimpleThreadChatClient extends JFrame implements ActionListener, Runnable {

	private JTextArea jta;
	private JTextField jtf;
	private JScrollPane jsp;

	private Socket client;
	private DataInputStream readStream; // ������ �����͸� �б����� ��Ʈ��
	private DataOutputStream writeStream;// ������ �����͸� ������ ���� ��Ʈ��
	
	private String serverNick; //������ ��ȭ�� 
	private String clientNick ; //Ŭ���̾�Ʈ�� ��ȭ�� 

	public SimpleThreadChatClient() {
		super(";;;;;;;;;;ä��Ŭ���̾�Ʈ;;;;;;;;;;;;;;;;;;;;;;");

		jta = new JTextArea();
		jta.setBorder(new TitledBorder("��ȭ����"));
		jta.setEditable(false);
		jta.setLineWrap(true);
		jta.setWrapStyleWord(true);

		jsp = new JScrollPane(jta);

		jtf = new JTextField();
		jtf.setBorder(new TitledBorder("��ȭ�Է�"));

		add("Center", jsp);
		add("South", jtf);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				dispose();
			}// windowClosing
			@Override
			public void windowClosed(WindowEvent we) {
				try {
					close();
					System.exit(0);
				} catch (IOException ie) {
					ie.printStackTrace();
				}//end catch
			}
		});

		setBounds(100, 100, 300, 400);
		setVisible(true);
		jtf.requestFocus();// Ŀ���� jtf�� ��ġ��Ų��.

//		try {
//			connectToServer();
//			//Thread�� ���� Ŭ������ has a����� ����
//			Thread t = new Thread(this);
//			//Thread ����
//			t.start();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} // end catch

		jtf.addActionListener(this);
	}// SimpleChatServer

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			sendMsg();
		} catch (Exception ie) {
			ie.printStackTrace();
		} // end catch
	}// actionPerformed

	public void close() throws IOException {
		try {
			if (readStream != null) {
				readStream.close();
			} // end if
			if (writeStream != null) {
				writeStream.close();
			} // end if
		} finally {
			if (client != null) {
				client.close();
			} // end if

		} // end finally
	}// close

	/**
	 * 2.������ �����Ͽ� ������ �����ϰ� ��ȭ�� �аų� ������ ���� 4.��Ʈ���� ������ ��´�.
	 * 
	 * @throws IOException
	 */
	public void connectToServer() throws IOException {
		clientNick = JOptionPane.showInputDialog("��ȭ�� �Է�");
		// 2.
		client = new Socket("211.63.89.149", 65535);
//		client = new Socket("211.63.89.149", 35000);

		// 4. ��Ʈ�� ����
		readStream = new DataInputStream(client.getInputStream());
		writeStream = new DataOutputStream(client.getOutputStream());
		
		//������ ��ȭ�� ����
		writeStream.writeUTF(clientNick);
		jta.setText("��ȭ�濡 \\"+clientNick+"\"���� �����ϼ̽��ϴ�.\n");
		//������ ��ȭ���� ����
		serverNick = readStream.readUTF();
	}// connectToServer

	/**
	 * �������� �������� �޼����� ���� ������ �о� ���δ�.
	 */
	@Override
	public void run() {
		String revMsg = "";
		if (readStream != null) {
			while (true) {
				try {
					revMsg = readStream.readUTF();
					// ��ȭâ�� �о� ���� �޼����� ���
					jta.append("[ "+ serverNick+"]" + revMsg + "\n");
					jsp.getVerticalScrollBar().setValue(jsp.getVerticalScrollBar().getMaximum());
				} catch (Exception ie) {
					JOptionPane.showMessageDialog(this, serverNick +"�Բ�����ȭ��밡 ����Ͽ����ϴ�");
					ie.printStackTrace();
					break;
				} // end catch
			} // end while
		}
	}

	/**
	 * �ۼ��� �޼����� ������ ������ ��
	 */
	public void sendMsg() throws IOException {
		// �ۼ��� �޼����� �����ͼ�
		String sendMsg = jtf.getText().trim();
		// ��Ʈ���� ����ϰ�
		writeStream.writeUTF(sendMsg);
		// ��Ʈ���� ������ �������� ����
		writeStream.flush();
		// �ۼ��� �޼����� ä��â�� ����Ѵ�.
		jta.append("[ "+ clientNick+"]" + sendMsg + "\n");
		// T.F�� ������ �����Ѵ�.
		jtf.setText("");
		jsp.getVerticalScrollBar().setValue(jsp.getVerticalScrollBar().getMaximum());
	}// sendMsg

	public static void main(String[] args) {
//		new SimpleThreadChatClient();
		SimpleThreadChatClient stcc = new SimpleThreadChatClient();
		try {
			stcc.connectToServer();
			// �޼����� ���ÿ� �о���ϱ� ������ Thread�� ó��
			Thread t = new Thread(stcc);
			t.start();
		} catch (IOException e) {
			e.printStackTrace();
		} // end catch
	}// main

}// class
