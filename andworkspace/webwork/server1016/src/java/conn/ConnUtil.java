package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta Document : ConnUtil created on : 2014. 10. 15, 오후 4:01:12
 */
public class ConnUtil {

    //잊지말자.. : 스태틱 초기화 - 메인메서드보다 먼저
    //JVM이 실행해준다.
    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }

    public static Connection getConn() throws SQLException {
        String url = "jdbc:oracle:thin:@localhost:1521/pdborcl";
        String user = "Bjo";
        String pass = "fighting";
        return DriverManager.getConnection(url, user, pass);
    }
}
