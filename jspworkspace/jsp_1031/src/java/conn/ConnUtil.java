package conn;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 * @author kosta Document : ConnUtil created on : 2014. 10. 31, 오후 3:13:54
 */
public class ConnUtil {
    //Connection pool에서 Connection을 획득해오는 객체
    private static DataSource ds;
    static {
        try {
            //context.xml의 설정을 JNDI로 읽어 내기 위한 객체 
            InitialContext ctx = new InitialContext();
            //ctx가 Context의 경로로 Resource를 획득("java:comp/env/...")
            ds = (DataSource) ctx.lookup("java:comp/env/jdbc/myora");
        } catch (NamingException ex) {
            ex.printStackTrace();
        }
    }
//취득한 Resource

    public static Connection getconn() throws SQLException {
        return ds.getConnection();
    }
}
