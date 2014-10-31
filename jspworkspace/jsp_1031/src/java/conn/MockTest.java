
package conn;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author kosta
 * Document    : MockTest created on : 2014. 10. 31, ¿ÀÈÄ 3:25:36
 */
public class MockTest {
    
    public static void main(String[] args) {
        try {
            Connection conn = ConnUtil.getconn();
            System.out.println("test:" + conn);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
