package day1226;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class SimpleChatClient extends JFrame implements ActionListener {

	private JTextArea jta;
	private JTextField jtf;

	private Socket client;
	private DataInputStream readStream; //������ �����͸� �б����� ��Ʈ��
	private DataOutputStream writeStream;//������ �����͸� ������ ���� ��Ʈ��

	public SimpleChatClient() {
		super(";;;;;;;;;;ä��Ŭ���̾�Ʈ;;;;;;;;;;;;;;;;;;;;;;");

		jta = new JTextArea();
		jta.setBorder(new TitledBorder("��ȭ����"));
		jta.setEditable(false);
		jta.setLineWrap(true);
		jta.setWrapStyleWord(true);

		JScrollPane jsp = new JScrollPane(jta);

		jtf = new JTextField();
		jtf.setBorder(new TitledBorder("��ȭ�Է�"));

		add("Center", jta);
		add("South", jtf);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}// windowClosing
		});


		setBounds(100, 100, 300, 400);
		setVisible(true);
		jtf.requestFocus();// Ŀ���� jtf�� ��ġ��Ų��.
		
		try {
			connectToServer();
			readMsg();
		} catch (IOException e) {
			e.printStackTrace();
		}//end catch

		jtf.addActionListener(this);
	}// SimpleChatServer

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			sendMsg();
		}catch(Exception ie){ 
			ie.printStackTrace();
		}//end catch
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
		// 2.
		client = new Socket("127.0.0.1", 65535);
		// 4. ��Ʈ�� ����
		readStream = new DataInputStream(client.getInputStream());
		writeStream = new DataOutputStream(client.getOutputStream());
	}// connectToServer

	/**
	 * �������� �������� �޼����� ���� ������ �о� ���δ�.
	 */
	public void readMsg() throws IOException {
		while (true) {
			String revMsg = "";
			revMsg = readStream.readUTF();
			// ��ȭâ�� �о� ���� �޼����� ���
			jta.append("[server �޼���] :" + revMsg + "\n");

		} // end while
	}

	/**
		 * �ۼ��� �޼����� ������ ������ ��
		 */
		public void sendMsg() throws IOException {
			//�ۼ��� �޼����� �����ͼ�
			String sendMsg =jtf.getText().trim();
			//��Ʈ���� ����ϰ�
			writeStream.writeUTF(sendMsg);
			//��Ʈ���� ������ �������� ����
			writeStream.flush();
			//�ۼ��� �޼����� ä��â�� ����Ѵ�.
			jta.append("[ client �޼���]" + sendMsg +"\n");
			//T.F�� ������ �����Ѵ�.
			jtf.setText("");
		}// sendMsg

	public static void main(String[] args) {
		new SimpleChatClient();
//		SimpleChatClient scc = new SimpleChatClient();
//		try {
//			scc.connectToServer();
//			scc.readMsg();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}//end catch
	}// main

}// class
