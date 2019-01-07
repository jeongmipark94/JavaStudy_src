package day0107;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;

public class TableSelectEvt extends WindowAdapter {

   private TableSelect ts;

   public TableSelectEvt(TableSelect ts) {
      this.ts = ts;
//      try {
//         this.Table("t");
//      } catch (SQLException e) {
//         e.printStackTrace();
//      }

   }

   @Override
   public void windowClosing(WindowEvent e) {
      ts.dispose();
   }

   public String Table(String id) throws SQLException {
      String tname = "";
      // 1. ����̹��ε�
      try {
         Class.forName("oracle.jdbc.OracleDriver");
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      }
      Connection con = null;
      Statement stmt = null;
      ResultSet rs = null;
      // 2. Connection ���
      String url = "jdbc:oracle:thin:@localhost:1521:orcl";
      String dbo_id = "scott";
      String dbo_pass = "tiger";
      con = DriverManager.getConnection(url, dbo_id, dbo_pass);// ??

      try {
         // 3. ������ ������ü ���
         stmt = con.createStatement();
         // 4. ������ ���� �� ��� ���
         StringBuilder selectTname = new StringBuilder();
         selectTname.append(" select tname ").append(" from tab ");

         rs = stmt.executeQuery(selectTname.toString());

         List<String> list = new ArrayList<String>();
         while (rs.next()) {
            ts.getJcbTS().addItem(rs.getString("TNAME"));
         }
      } finally {
         // 5. ���� ����
         if (rs != null) {
            rs.close();
         }
         if (stmt != null) {
            stmt.close();
         }
         if (con != null) {
            con.close();
         }
      }
         return tname;
   }

}