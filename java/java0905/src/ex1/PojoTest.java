
package ex1;

/**
 * @author kosta
 * Document    : PojoTest created on : 2014. 9. 5, 오전 11:47:51
 */

//Pojo
//상속등 어디에도 귀속되지 않는 클래스
//기본생성자로 생성되는 클래스
//멤버필드는 은닉화 되고, 접근은 setter/getter로 캡슐화 시킨 클래스
public class PojoTest {
    //변수는 소문자로써
    private int num;
    private String name;
    private boolean flag;
    //setter/getter할때는 단축키쓰자.
    //booleanaks getter가 is**형식이다.
    public boolean isFlag(){
        return flag;
    }
    public void setFlag(boolean flag){
        this.flag = flag;
    }
    public int Num(){
        
    }

}


