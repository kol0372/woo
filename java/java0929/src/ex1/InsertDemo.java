package ex1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta Document : InsertDemo created on : 2014. 9. 29, ���� 2:14:43
 */
public class InsertDemo {

    String id = null;
    String pw = null;
    String name = null;
    String birth = null;
    String email = null;
    int num;
    Connection con = null;//�ڹ���sql
    PreparedStatement pstm = null;
    ResultSet rs = null;
    StringBuffer sql = new StringBuffer();


    public InsertDemo() {

        try {
            //1 jdbc�� ���� Driver �ε�
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("����̹� �ε� ����");

            //2 connection ȹ��
            //<host>:<port>/<service_name>, or a SQL*net name-value pair,
            // or a TNSEntryName.
            //tnsnames.ora�� (SERVICE_NAME = pdborcl)
            String url = "jdbc:oracle:thin:@localhost:1521/pdborcl"; 
            //jdbc:oracle:thin: ->protocol @localhost->����Ŭ������ȣ��Ʈ
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
            //3.SQL�� �ۼ�!
            

            //num -> number_seq.nextVal - ���������̺��� ��ȣ ����
            // did,dpwd,dname,birth,email - > 5��
            //ddate - > sysdate �ڵ����� ���糯¥
            //insert �۾��� �������� ���ε� �� �� ���� �����ؼ� ���� ������ ���ֵ�.
            

            sql.append("insert into member values(");
            sql.append("member_seq.nextVal,?,?,?,?,?,sysdate)");

//4.PreparedStatement ��ü�� ����ؼ� ������ ����
            
            pstm = con.prepareStatement(sql.toString());
            //5.���۵� �������� ���� ���ε�����ؼ� ����
            pstm.setString(1, id);
            pstm.setString(2, pw);
            pstm.setString(3, name);
            pstm.setString(4, birth);
            pstm.setString(5, email);
            pstm.executeUpdate(); // insert,delete,update�� ��� ���

            System.out.println("connention ȹ��" + con);
            
   
         
        } catch (SQLException ex) {
            System.out.println("����Ŭ ���� : ");
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
            sql.append(" order by 1 desc"); //�������� desc 1- num // �������� asc(�������� ����)
            //���� ����
            pstm = con.prepareStatement(sql.toString());
            //cursor�� �����ޱ� ���� �޼��带 ȣ��
            rs = pstm.executeQuery();
            //�������� Ŀ���� ����ؼ� �����͸� ���
            //rs.next()�� Ŀ���� ���� ��� true
            while(rs.next()){//Ŀ���� �̵���Ű�鼭 ������ ����������
                //rs.getXX("�÷���ȣ||�÷���")
                num =  rs.getInt("num");
                id =   rs.getString("did");
                System.out.println("�̸� : " + rs.getString("dname"));
                System.out.println("�̸��� : " + rs.getString("demail"));
                System.out.println("������ : " + rs.getString("ddate"));
                
                System.out.println("--------------------------");
                
                
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            try {
                if(rs != null)rs.close(); //rs�� �Ⱦ��� ������ null�̾� , �̶� ������ �÷����� ó����
                                          //rs�� ���� �ݾ�.��
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
