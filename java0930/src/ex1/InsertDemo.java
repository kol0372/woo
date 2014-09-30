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
 * @author kosta Document : InsertDemo Created on : 김현철 2014. 9. 29, 오후 2:14:44
 */
public class InsertDemo {

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pstm = null;
        try {
            // 1. ojdbc로 부터 Driver 로딩
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 로딩 성공!");
            // 2. Connection획득
            
            String url ="jdbc:oracle:thin:@localhost:1521/pdborcl";
            String user ="myman2";
            String pass ="new09";
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection획득!"+con);
            // 3. SQL문 작성!
            StringBuffer sql = new StringBuffer();
            // num -> member_seq_nextVal - 시퀀스테이블의 번호 증가
            // rid,rpwd,rname,BIRTH,EMAIL -> 5개
            // RDATE -> sysdata 자동으로 현재날짜
            sql.append("insert into member values(");
            sql.append("member_seq.nextVal,?,?,?,?,?,sysdate)");
            
            // 4. PreparedStatement 객체를 사용해서 쿼리를 전송
            pstm = con.prepareStatement(sql.toString());
            // 5. 바인딩 사용해서 전송된 쿼리에게 값을 전송
            pstm.setString(1, "xman1");
            pstm.setString(2, "xman01");
            pstm.setString(3, "김길동1");
            pstm.setString(4, "20000908");
            pstm.setString(5, "aa2@a.com");
            pstm.executeUpdate(); // insert,delete,update일 경우 사용!
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("드라이버 로딩 실패!");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("오라클 에러:");
            ex.printStackTrace();
        }

    }
}
