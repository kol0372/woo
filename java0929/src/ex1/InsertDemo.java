
package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta
 * Document    : InsertDemo created on : 2014. 9. 29, ���� 2:14:43
 */
public class InsertDemo {
    public static void main(String[] args) throws SQLException {
        Connection con = null;//�ڹ���sql
        PreparedStatement pstm;
        try {
            //1 ojdbc�� ���� Driver �ε�
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("����̹� �ε� ����");
            
            //2 connection ȹ��
            //<host>:<port>/<service_name>, or a SQL*net name-value pair,
            // or a TNSEntryName.
            //tnsnames.ora�� (SERVICE_NAME = pdborcl)
            
            String url = "jdbc:oracle:thin:@localhost:1521/pdborcl"; //jdbc:oracle:thin: ->protocol @localhost->����Ŭ������ȣ��Ʈ
            String user = "mypeople";
            String pass = "new09";
            con = DriverManager.getConnection(url, user, pass);
            
            //3.SQL�� �ۼ�!
            StringBuffer sql = new StringBuffer();
            sql.append("insert into member values(");
            //num -> number_seq.nextVal - ���������̺��� ��ȣ ����
            // did,dpwd,dname,birth,email - > 5��
            //ddate - > sysdate �ڵ����� ���糯¥
            //insert �۾��� �������� ���ε� �� �� ���� �����ؼ� ���� ������ ���ֵ�.
            
            sql.append("member_seq.nextVal,?,?,?,?,?,sysdate)");
            
            //4.PreparedStatement ��ü�� ����ؼ� ������ ����
            pstm = con.prepareStatement(sql.toString());
            //5.���۵� �������� ���� ���ε�����ؼ� ����
            pstm.setString(1, "xman");
            pstm.setString(2, "xman00");
            pstm.setString(3, "��浿");
            pstm.setString(4, "20090319");
            pstm.setString(5, "click@naver.com");
            pstm.executeUpdate(); // insert,delete,update�� ��� ���
            
            
            System.out.println("connention ȹ��" + con);
        } catch (ClassNotFoundException ex) {
            System.out.println("����̹� �ε� ����");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("����Ŭ ���� : ");
            ex.printStackTrace();
        }finally{
            con.close();
        }
    }

}
