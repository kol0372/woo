package conn;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * @author kosta Document : ConnUtil created on : 2014. 10. 31, ���� 3:13:54
 */
public class ConnUtil {
    //Connection pool���� Connection�� ȹ���ؿ��� ��ü
    private static DataSource ds;
    static {
        try {
            //context.xml�� ������ JNDI�� �о� ���� ���� ��ü 
            InitialContext ctx = new InitialContext();
            //ctx�� Context�� ��η� Resource�� ȹ��("java:comp/env/...")
            ds = (DataSource) ctx.lookup("java:comp/env/jdbc/myora");
        } catch (NamingException ex) {
            ex.printStackTrace();
        }
    }
//����� Resource

    public static Connection getconn() throws SQLException {
        return ds.getConnection();
    }
}
