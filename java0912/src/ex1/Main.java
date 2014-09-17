
package ex1;

/**
 * @author kosta
 * Document    : Main created on : 2014. 9. 12, 오전 10:17:06
 */
public class Main {
    public static void main(String[] args) {
        //자식클래스를 참조로한 객체 생성
        D_carPhone ref = new D_carPhone("갤노트3" , "500000", 1000, "20px");
        System.out.println("모델명 : " + ref.model);//부모
        System.out.println("가격 : " + ref.getNumber());//부모
        System.out.println("화음 : " + ref.getChord());//부모에 등록
        System.out.println("픽셀 : " + ref.getPixel());//자식
        MP3Phone red = new MP3Phone("아아", "333", 123, 124);
        System.out.println("모델명 : " + red.model);
        System.out.println("가격 : " + red.getNumber());
        System.out.println("화음 : " + red.getChord());
        System.out.println("사이즈 : "+red.getSize());
    }

}
