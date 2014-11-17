
package ex4;

/**
 * @author kosta
 * Document    : AniAMain created on : 2014. 9. 15, ¿ÀÈÄ 1:53:40
 */
public class AniAMain {
    public static void main(String[] args) {
        
        Animal[] ani = new Animal[3];
        ani[0]= new Bird();
        ani[1]= new Dog();
        ani[2]= new Cat();
        for(Animal e : ani){
            e.cry();
        
        }
        
        
    }
}
