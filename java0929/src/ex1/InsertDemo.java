package ex1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta Document : InsertDemo created on : 2014. 9. 29, 오후 2:14:43
 */
public class InsertDemo {

    String id = null;
    String pw = null;
    String name = null;
    String birth = null;
    String email = null;
    int num;
    Connection con = null;//자바쩜sql
    PreparedStatement pstm = null;
    ResultSet rs = null;
    StringBuffer sql = new StringBuffer();


    public InsertDemo() {

        try {
            //1 jdbc로 부터 Driver 로딩
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 로딩 성공");

            //2 connection 획득
            //<host>:<port>/<service_name>, or a SQL*net name-value pair,
            // or a TNSEntryName.
            //tnsnames.ora에 (SERVICE_NAME = pdborcl)
            String url = "jdbc:oracle:thin:@localhost:1521/pdborcl"; 
            //jdbc:oracle:thin: ->protocol @localhost->오라클서버의호스트
            String user = "mypeople";
            String pass = "new09";
            con = DriverManager.getConnection(url, user, pass);

        } catch (SQLException ex) {
            Logger.getLogger(InsertDemo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InsertDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setcontent(String id, String pw, String name, String birth, String email) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.birth = birth;
        this.email = email;
        try {
            //3.SQL문 작성!
            

            //num -> number_seq.nextVal - 시퀀스테이블의 번호 증가
            // did,dpwd,dname,birth,email - > 5개
            //ddate - > sysdate 자동으로 현재날짜
            //insert 작업시 변수값이 바인딩 될 것 까지 포함해서 값을 지정할 수있따.
            

            sql.append("insert into member values(");
            sql.append("member_seq.nextVal,?,?,?,?,?,sysdate)");

//4.PreparedStatement 객체를 사용해서 쿼리를 전송
            
            pstm = con.prepareStatement(sql.toString());
            //5.전송된 쿼리에게 값을 바인딩사용해서 전송
            pstm.setString(1, id);
            pstm.setString(2, pw);
            pstm.setString(3, name);
            pstm.setString(4, birth);
            pstm.setString(5, email);
            pstm.executeUpdate(); // insert,delete,update일 경우 사용

            System.out.println("connention 획득" + con);
            
   
         
        } catch (SQLException ex) {
            System.out.println("오라클 에러 : ");
            ex.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(InsertDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    public void inmsg(){
          try {
         
            StringBuffer sql = new StringBuffer();
            sql.append("select num,dname,did,email,birth,ddate,from member");
            sql.append(" order by 1 desc"); //내림차순 desc 1- num // 오름차순 asc(세현옵이 물음)
            //쿼리 전송
            pstm = con.prepareStatement(sql.toString());
            //cursor를 돌려받기 위한 메서드를 호출
            rs = pstm.executeQuery();
            //돌려받은 커서를 사용해서 데이터를 출력
            //rs.next()는 커서가 있을 경우 true
            while(rs.next()){//커서를 이동시키면서 다음꺼 있을때까정
                //rs.getXX("컬럼번호||컬럼명")
                num =  rs.getInt("num");
                id =   rs.getString("did");
                System.out.println("이름 : " + rs.getString("dname"));
                System.out.println("이메일 : " + rs.getString("demail"));
                System.out.println("가입일 : " + rs.getString("ddate"));
                
                System.out.println("--------------------------");
                
                
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try {
                if(rs != null)rs.close(); //rs가 안쓰고 있으면 null이야 , 이때 가비지 컬렉션이 처리해
                                          //rs가 쓰면 닫아.ㅅ
                if(pstm != null)pstm.close();
                if(con != null)con.close();
            } catch (SQLException ex) {
                
            }
        }
    }
    
    public int checkid(){
        try {
            sql.append("select*from member where bid ");
            pstm = con.prepareStatement(sql.toString());
            rs= pstm.executeQuery();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
    
    
    
}
