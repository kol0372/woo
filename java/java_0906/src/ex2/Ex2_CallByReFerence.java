
package ex2;

/**
 * @author kosta
 * Document    : Ex2_CallByReFerence created on : 2014. 9. 11, 오전 11:23:59
 */
public class Ex2_CallByReFerence {
   //연습문제 : 현재 클래스는 변화에 유연하지 못한 클래스로 설계가 되어있다.
   //info한 메서드에게 자원을 추가해서 사용하기 위해서 
    //매서드의 인자값도 늘여야하고, 멤버필드 및 setter/getter도 늘려야 한다.
    //private boolean agree를 추가해서 사용해보면 알것임.
    //pojo, callbyreference를 적절히 사용하면 해결됨.
   private int num;
   private String name, age, gender, tel;
  
   
    //한사람의 정보를 출력 - 나이, 성별, 번호, 이름, 전번
    public void info(int num, String name, String age, String gender, String tel){
        // *******this : 현재객체의 주소값- 지역변수와 멤버필드가 이름이 같으면 
        // 지역변수에 우선순위가 있다.*******
        //이럴때 구별하기 위해서 이름을 달리 주거나, this란 키워드를
        //붙여주면 붙인쪽이 객체의 주소, 멤버자원(this.num)의 형대로 기억된다.
        this.num = num;
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.tel = tel;
//        System.out.println("입력하신 정보 : ");
//        System.out.println("번호" + num);
//        System.out.println("이름" + name);
//        System.out.println("나이" + age);
//        System.out.println("성별" + gender);
//        System.out.println("전화번호" + tel);
        
    }

    //매서드 영역에서 alt +insert 키
    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getTel() {
        return tel;
    }
    
}
