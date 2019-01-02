package day0102;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class tempPrj extends JFrame implements ActionListener,ItemListener {
   
   private JPanel topPanel, teamPanel;
   private JLabel jrSelectTeam;
   private JRadioButton jrTeam1,jrTeam2,jrTeam3,jrTeam4;
   private ButtonGroup gpTeam;
   private JButton jbConnect;
   private String selectTeam; 
   public tempPrj() {
      super("ä�ù� ����");
      topPanel = new JPanel();
      teamPanel = new JPanel();
      jrSelectTeam = new JLabel("ä�ù� ����");   
      jrTeam1 = new JRadioButton("1��");
      jrTeam2 = new JRadioButton("2��");
      jrTeam3 = new JRadioButton("3��");
      jrTeam4 = new JRadioButton("4��");
      jbConnect = new JButton("����");
      gpTeam = new ButtonGroup();
      
      topPanel.add(jrSelectTeam);
   
      gpTeam.add(jrTeam1);
      gpTeam.add(jrTeam2);
      gpTeam.add(jrTeam3);
      gpTeam.add(jrTeam4);
      
      teamPanel.add(jrTeam1);
      teamPanel.add(jrTeam2);
      teamPanel.add(jrTeam3);
      teamPanel.add(jrTeam4);
      
      jrSelectTeam.setBounds(65,20,100,30);
      add(jrSelectTeam);
      teamPanel.setBounds(30,60,50,130);
      add(teamPanel);
      jbConnect.setBounds(65,200,60,50);
      add(jbConnect);
      
      jrTeam1.addItemListener(this);
      jrTeam2.addItemListener(this);
      jrTeam3.addItemListener(this);
      jrTeam4.addItemListener(this);
      jbConnect.addActionListener(this);
      
      setLayout(null);   
      setBounds(100,100,200,300);
      setResizable(false);
      setVisible(true);
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   @Override
   public void itemStateChanged(ItemEvent ie) {
      if(ie.getSource()==jrTeam1) {
         selectTeam = "1��";
      }else if(ie.getSource()==jrTeam2){
         selectTeam = "2��";
      }else if(ie.getSource()==jrTeam3){
         selectTeam = "3��";
      }else if(ie.getSource()==jrTeam4){
         selectTeam = "4��";
      }
   }
   
   @Override
   public void actionPerformed(ActionEvent ae) {
      System.out.println(selectTeam);      
   }
   
   public static void main(String[] args) {
      tempPrj tp = new tempPrj();
   }
}