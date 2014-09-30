package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kosta Document : InsertBoard Created on : ����ö 2014. 9. 29, ���� 3:47:33
 */
public class InsertBoard {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstm = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("����̹� �ε� ����!");

            String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
            String user = "kosta86";
            String pass = "new14";
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connectionȹ��!" + con);

            StringBuffer sql = new StringBuffer();
            sql.append("insert into board values(");
            sql.append("board_seq.nextVal,?,?,?,sysdate)");

            pstm = con.prepareStatement(sql.toString());
            
            Scanner sc = new Scanner(System.in);          
            System.out.print("SUB : ");
            String sub = sc.nextLine();            
            System.out.print("Writer : ");
            String writer = sc.nextLine();           
            System.out.print("content : ");
            String content = sc.nextLine();
            
            pstm.setString(1, sub);
            pstm.setString(2, writer);
            pstm.setString(3, content);
            pstm.executeUpdate();

        } catch (ClassNotFoundException ex) {
            System.out.println("����̹� �ε� ����!");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("����Ŭ ����:");
            ex.printStackTrace();
        }
    }
}
