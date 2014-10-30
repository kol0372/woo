
package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author kosta
 * Document    : ConnUtil created on : 2014. 10. 30, ���� 4:02:49
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
        String user = "mypeople";
        String pass = "new09";
        return DriverManager.getConnection(url, user, pass);
    }
}

