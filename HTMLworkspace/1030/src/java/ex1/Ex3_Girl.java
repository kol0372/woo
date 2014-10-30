package ex1;

/**
 * @author kosta Document : Ex3_Girl created on : 2014. 10. 30, 오후 1:37:14
 */
//이게 서버얌... exam_star랑 연결
public class Ex3_Girl {

    public String[] getGirlGroup(String code) {
        if (code.equals("1")) {
            String[] girl = {"유라", "혜리", "소진", "미라"};
            return girl;
        } else {
            String[] girl = {"보람", "지연", "효민", "은정", "큐리", "소연"};
            return girl;
        }
    }
}
