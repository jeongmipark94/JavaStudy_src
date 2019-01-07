package day0107;

import java.awt.GridLayout;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TableSelect extends JFrame{
   
   private JLabel jlbTS;
   private JComboBox<String> jcbTS;
   private JButton jbtTS;

   public TableSelect () {
      jlbTS=new JLabel("���̺� ����");
      jcbTS=new JComboBox<String>();
      jbtTS=new JButton("����");
      
      setLayout(new GridLayout(3, 1));
      JPanel panel=new JPanel();
      panel.add(jlbTS);
      panel.add(jcbTS);
      panel.add(jbtTS);
      
      add("North",panel);
      
      TableSelectEvt tse=new TableSelectEvt(this);
      try {
         tse.Table("fsf");//�޼ҵ����
      } catch (SQLException e) {
         e.printStackTrace();
      }

      setBounds(100, 100, 500, 300);
      setVisible(true);
      
   }
   
   public JLabel getJlbTS() {
      return jlbTS;
   }

   public JComboBox<String> getJcbTS() {
      return jcbTS;
   }

   public JButton getJbtTS() {
      return jbtTS;
   }

   public static void main(String[] args) {
      new TableSelect();
   }
}