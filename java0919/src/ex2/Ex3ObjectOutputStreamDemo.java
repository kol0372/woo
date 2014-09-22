
package ex2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author kosta
 * Document    : Ex3ObjectOutputStreamDemo created on : 2014. 9. 19, 오전 11:25:06
 */
public class Ex3ObjectOutputStreamDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        String path = "c:\\kosta86\\test.txt";
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        MemberVo v = new MemberVo();
        v.setName("김길동");
        v.setAddr("서울");
        v.setAge(20);
        v.setTimes(System.currentTimeMillis());
        v.setFlag(true);
        
        oos.writeObject(v);
        
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        MemberVo v1 =(MemberVo) ois.readObject();
        System.out.println("Name" + v1.getName());
        System.out.println("Age" + v1.getAge());
        System.out.println("Addr" + v1.getAddr());
        System.out.println("Flag" + v1.isFlag());
        System.out.println("소요시간" + (System.currentTimeMillis()-v.getTimes()));
        
        
    }
}
