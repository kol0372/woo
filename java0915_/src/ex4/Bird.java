
package ex4;

/**
 * @author kosta
 * Document    : Bird created on : 2014. 9. 15, ¿ÀÈÄ 1:48:11
 */
public class Bird extends Animal2 implements Animal{

    @Override
    public void cry() {
        System.out.println("?Â°°Â¤¹°Â¤¹¤¡");
    }

    @Override
    public String col() {
        return "³ë¶õ";
    }

}
