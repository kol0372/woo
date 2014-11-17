
package ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta
 * Document    : SelectDemo created on : 2014. 9. 29, 오후 7:33:56
 */
public class SelectDemo {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracl:thin:@localhost:1521/pdborcl";
            String user = "kosta86";
            String pass = "new14";
            con = DriverManager.getConnection(url, user, pass);
            
            StringBuffer sql = new StringBuffer();
            sql.append("select woono, wooid, woopw, wooname, wooemail, woobirth, woodate from woo");
            sql.append(" order by 1 desc");
            
            pstmt = con.prepareStatement(sql.toString());
            
            rs=pstmt.executeQuery();
            
            while(rs.next()){
                System.out.println("번호 : " + rs.getInt("woono"));
                System.out.println("아이디 : " +rs.getString("wooid"));
                System.out.println("이름 : " + rs.getString("wooname"));
                System.out.println("이메일 : " + rs.getString("wooemail"));
                System.out.println("생일 : " + rs.getString("woobirth"));
                System.out.println("가입자 : " + rs.getString("woodate"));
                System.out.println("------------------------------------");
            }
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        } catch (SQLException ex) {
          ex.printStackTrace();
        }finally{
           try {
                 if(rs != null)rs.close();
                 if(pstmt != null)pstmt.close();
                 if(con != null)con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
    }
}
