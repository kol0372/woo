
package ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta
 * Document    : InsertDemo created on : 2014. 9. 29, 오후 2:14:43
 */
public class InsertDemo {
    public static void main(String[] args) throws SQLException {
        Connection con = null;//자바쩜sql
        PreparedStatement pstm;
        try {
            //1 ojdbc로 부터 Driver 로딩
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 로딩 성공");
            
            //2 connection 획득
            //<host>:<port>/<service_name>, or a SQL*net name-value pair,
            // or a TNSEntryName.
            //tnsnames.ora에 (SERVICE_NAME = pdborcl)
            
            String url = "jdbc:oracle:thin:@localhost:1521/pdborcl"; //jdbc:oracle:thin: ->protocol @localhost->오라클서버의호스트
            String user = "mypeople";
            String pass = "new09";
            con = DriverManager.getConnection(url, user, pass);
            
            //3.SQL문 작성!
            StringBuffer sql = new StringBuffer();
            sql.append("insert into member values(");
            //num -> number_seq.nextVal - 시퀀스테이블의 번호 증가
            // did,dpwd,dname,birth,email - > 5개
            //ddate - > sysdate 자동으로 현재날짜
            //insert 작업시 변수값이 바인딩 될 것 까지 포함해서 값을 지정할 수있따.
            
            sql.append("member_seq.nextVal,?,?,?,?,?,sysdate)");
            
            //4.PreparedStatement 객체를 사용해서 쿼리를 전송
            pstm = con.prepareStatement(sql.toString());
            //5.전송된 쿼리에게 값을 바인딩사용해서 전송
            pstm.setString(1, "xman");
            pstm.setString(2, "xman00");
            pstm.setString(3, "김길동");
            pstm.setString(4, "20090319");
            pstm.setString(5, "click@naver.com");
            pstm.executeUpdate(); // insert,delete,update일 경우 사용
            
            
            System.out.println("connention 획득" + con);
        } catch (ClassNotFoundException ex) {
            System.out.println("드라이버 로딩 실패");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("오라클 에러 : ");
            ex.printStackTrace();
        }finally{
            con.close();
        }
    }

}
