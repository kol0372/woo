
package ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta
 * Document    : InsertDemo created on : 2014. 9. 29, 오후 6:43:26
 */
public class InsertDemo {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstm = null;
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 로딩 성공");
            
            String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
            String user = "kosta86";
            String pass = "new14";
            con = DriverManager.getConnection(url, user, pass);
            
            StringBuffer sql = new StringBuffer();
            sql.append("insert into woo values(woo_seq.nextVal,?,?,?,?,?,sysdate)");
            
            pstm = con.prepareStatement(sql.toString());
            
            pstm.setString(1, "kol037");
            pstm.setString(2, "1234");
            pstm.setString(3, "우리2");
            pstm.setString(4, "19900930");
            pstm.setString(5, "kol0372@naver.com");
            pstm.executeUpdate();
            
            
            System.out.println("connection 획득" + con);
        } catch (ClassNotFoundException ex) {
            System.out.println("드라이버 로딩 실패");
            ex.printStackTrace();
        } catch (SQLException ex) {
           System.out.println("오라클 에러 : ");
            ex.printStackTrace();
        }finally{
            try {
                if(pstm != null)pstm.close();
                if(con != null)con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
    }

}
