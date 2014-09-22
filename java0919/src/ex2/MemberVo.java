
package ex2;

import java.io.Serializable;

/**
 * @author kosta
 * Document    : MemberVo created on : 2014. 9. 19, ¿ÀÀü 11:22:45
 */
public class MemberVo implements Serializable{
transient private String name;
private String addr;
private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }





    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public long getTimes() {
        return times;
    }

    public void setTimes(long times) {
        this.times = times;
    }
private boolean flag;
private long times;


}
