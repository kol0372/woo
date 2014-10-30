package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta Document : ConnUtil created on : 2014. 10. 15, ���� 4:01:12
 */
public class ConnUtil {

    //��������.. : ����ƽ �ʱ�ȭ - ���θ޼��庸�� ����
    //JVM�� �������ش�.
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
