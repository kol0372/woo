
package ex2.vo;

/**
 * @author kosta
 * Document    : MemberVO created on : 2014. 9. 11, ���� 12:15:21
 */
//pojo : ������ ������ ������ ��ü�� ���� value object
public class MemberVO {
    
    //***�޼���� ȣǮ�� MemberVO�� ������ �� setter�� ���� ��������
    //���ڰ����� ȣ���ؾ� �Ѵ�. ***
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
