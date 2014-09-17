
package ex2.vo;

/**
 * @author kosta
 * Document    : MemberVO created on : 2014. 9. 11, 오후 12:15:21
 */
//pojo : 순수한 값만을 가지는 객체를 생성 value object
public class MemberVO {
    
    //***메서드로 호풀시 MemberVO를 생성한 후 setter로 값을 저장한후
    //인자값으로 호출해야 한다. ***
    private int num;
   private String name, age, gender, tel;
   private boolean agree;

    //setter, getter
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public boolean isAgree() {
        return agree;
    }

    public void setAgree(boolean agree) {
        this.agree = agree;
    }
   
}
