
package ex4;

/**
 * @author kosta
 * Document    : Bird created on : 2014. 9. 15, ���� 1:48:11
 */
public class Bird extends Animal2 implements Animal{

    @Override
    public void cry() {
        System.out.println("?°�¤��¤���");
    }

    @Override
    public String col() {
        return "���";
    }

}
