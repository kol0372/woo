
package ex2;

/**
 * @author kosta
 * Document    : Ex2_CallByReFerence created on : 2014. 9. 11, ���� 11:23:59
 */
public class Ex2_CallByReFerence {
   //�������� : ���� Ŭ������ ��ȭ�� �������� ���� Ŭ������ ���谡 �Ǿ��ִ�.
   //info�� �޼��忡�� �ڿ��� �߰��ؼ� ����ϱ� ���ؼ� 
    //�ż����� ���ڰ��� �ÿ����ϰ�, ����ʵ� �� setter/getter�� �÷��� �Ѵ�.
    //private boolean agree�� �߰��ؼ� ����غ��� �˰���.
    //pojo, callbyreference�� ������ ����ϸ� �ذ��.
   private int num;
   private String name, age, gender, tel;
  
   
    //�ѻ���� ������ ��� - ����, ����, ��ȣ, �̸�, ����
    public void info(int num, String name, String age, String gender, String tel){
        // *******this : ���簴ü�� �ּҰ�- ���������� ����ʵ尡 �̸��� ������ 
        // ���������� �켱������ �ִ�.*******
        //�̷��� �����ϱ� ���ؼ� �̸��� �޸� �ְų�, this�� Ű���带
        //�ٿ��ָ� �������� ��ü�� �ּ�, ����ڿ�(this.num)�� ����� ���ȴ�.
        this.num = num;
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.tel = tel;
//        System.out.println("�Է��Ͻ� ���� : ");
//        System.out.println("��ȣ" + num);
//        System.out.println("�̸�" + name);
//        System.out.println("����" + age);
//        System.out.println("����" + gender);
//        System.out.println("��ȭ��ȣ" + tel);
        
    }

    //�ż��� �������� alt +insert Ű
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
