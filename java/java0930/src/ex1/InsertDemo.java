package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.runtime.regexp.joni.Option;

/**
 *
 * @author kosta Document : InsertDemo Created on : ����ö 2014. 9. 29, ���� 2:14:44
 */
public class InsertDemo {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstm = null;
        try {
            // 1. ojdbc�� ���� Driver �ε�
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("����̹� �ε� ����!");
            // 2. Connectionȹ��
            
            String url ="jdbc:oracle:thin:@localhost:1521/pdborcl";
            String user ="myman2";
            String pass ="new09";
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connectionȹ��!"+con);
            // 3. SQL�� �ۼ�!
            StringBuffer sql = new StringBuffer();
            // num -> member_seq_nextVal - ���������̺��� ��ȣ ����
            // rid,rpwd,rname,BIRTH,EMAIL -> 5��
            // RDATE -> sysdata �ڵ����� ���糯¥
            sql.append("insert into member values(");
            sql.append("member_seq.nextVal,?,?,?,?,?,sysdate)");
            
            // 4. PreparedStatement ��ü�� ����ؼ� ������ ����
            pstm = con.prepareStatement(sql.toString());
            // 5. ���ε� ����ؼ� ���۵� �������� ���� ����
            pstm.setString(1, "xman1");
            pstm.setString(2, "xman01");
            pstm.setString(3, "��浿1");
            pstm.setString(4, "20000908");
            pstm.setString(5, "aa2@a.com");
            pstm.executeUpdate(); // insert,delete,update�� ��� ���!
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("����̹� �ε� ����!");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("����Ŭ ����:");
            ex.printStackTrace();
        }

    }
}
