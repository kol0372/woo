
package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta
 * Document    : SelectDemo created on : 2014. 9. 29, ���� 5:15:25
 */
public class SelectDemo {
    public static void main(String[] args) {
        Connection con  = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            //�ڷḦ ����
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521/pdborcl"; 
            String user = "mypeople";
            String pass = "new09";
            con = DriverManager.getConnection(url, user, pass);
            //select  * from table : *�� Į���� ��ȸ�ϴ� ��� �־ ����
            StringBuffer sql = new StringBuffer();
            sql.append("select num,dname,did,email,birth,ddate,from member");
            sql.append(" order by 1 desc"); //�������� desc 1- num // �������� asc(�������� ����)
            //���� ����
            pstmt = con.prepareStatement(sql.toString());
            //cursor�� �����ޱ� ���� �޼��带 ȣ��
            rs = pstmt.executeQuery();
            //�������� Ŀ���� ����ؼ� �����͸� ���
            //rs.next()�� Ŀ���� ���� ��� true
            while(rs.next()){
                //rs.getXX("�÷���ȣ||�÷���")
                System.out.println("��ȣ : " + rs.getInt("num"));
                System.out.println("���̵� : " + rs.getString("did"));
                System.out.println("�̸� : " + rs.getString("dname"));
                System.out.println("�̸��� : " + rs.getString("demail"));
                System.out.println("������ : " + rs.getString("ddate"));
                
                System.out.println("--------------------------");
                
                
                
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try {
                if(rs != null)rs.close(); //rs�� �Ⱦ��� ������ null�̾� , �̶� ������ �÷����� ó����
                                          //rs�� ���� �ݾ�.��
                if(pstmt != null)pstmt.close();
                if(con != null)con.close();
            } catch (SQLException ex) {
                
            }
        }
        
    }

}
