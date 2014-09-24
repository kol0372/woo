
package exam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author kosta
 * Document    : NewClass created on : 2014. 9. 24, ¿ÀÈÄ 2:22:29
 */
public class NewClass {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path="C:\\kosta86\\javaStudy\\workspace\\java0924\\src\\exam\\test.properties";
        FileInputStream fis = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(fis);
        System.out.println(prop.get("±è"));
    }

}
