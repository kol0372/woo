
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
 * Document    : SelectDemo created on : 2014. 9. 29, 오후 5:15:25
 */
public class SelectDemo {
    public static void main(String[] args) {
        Connection con  = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            //자료를 검출
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521/pdborcl"; 
            String user = "mypeople";
            String pass = "new09";
            con = DriverManager.getConnection(url, user, pass);
            //select  * from table : *은 칼럼을 조회하는 기능 있어서 비추
            StringBuffer sql = new StringBuffer();
            sql.append("select num,dname,did,email,birth,ddate,from member");
            sql.append(" order by 1 desc"); //내림차순 desc 1- num // 오름차순 asc(세현옵이 물음)
            //쿼리 전송
            pstmt = con.prepareStatement(sql.toString());
            //cursor를 돌려받기 위한 메서드를 호출
            rs = pstmt.executeQuery();
            //돌려받은 커서를 사용해서 데이터를 출력
            //rs.next()는 커서가 있을 경우 true
            while(rs.next()){
                //rs.getXX("컬럼번호||컬럼명")
                System.out.println("번호 : " + rs.getInt("num"));
                System.out.println("아이디 : " + rs.getString("did"));
                System.out.println("이름 : " + rs.getString("dname"));
                System.out.println("이메일 : " + rs.getString("demail"));
                System.out.println("가입일 : " + rs.getString("ddate"));
                
                System.out.println("--------------------------");
                
                
                
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try {
                if(rs != null)rs.close(); //rs가 안쓰고 있으면 null이야 , 이때 가비지 컬렉션이 처리해
                                          //rs가 쓰면 닫아.ㅅ
                if(pstmt != null)pstmt.close();
                if(con != null)con.close();
            } catch (SQLException ex) {
                
            }
        }
        
    }

}
