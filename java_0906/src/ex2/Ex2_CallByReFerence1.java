package ex2;

import ex2.vo.MemberVO;

/**
 * @author kosta Document : Ex2_CallByReFerence created on : 2014. 9. 11, ����
 * 11:23:59
 */
public class Ex2_CallByReFerence1 {
    //�������� : ���� Ŭ������ ��ȭ�� �������� ���� Ŭ������ ���谡 �Ǿ��ִ�.
    //info�� �޼��忡�� �ڿ��� �߰��ؼ� ����ϱ� ���ؼ� 
    //�ż����� ���ڰ��� �ÿ����ϰ�, ����ʵ� �� setter/getter�� �÷��� �Ѵ�.
    //private boolean agree�� �߰��ؼ� ����غ��� �˰���.
    //pojo, callbyreference�� ������ ����ϸ� �ذ��.

    //�ѻ���� ������ ��� - ����, ����, ��ȣ, �̸�, ����
    private MemberVO vo;

    public void info(MemberVO vo) {
        //���� ������ �ʿ��ϴٸ� 
        if (vo.getTel().contains("02")) {
            System.out.println("�������̴�.");
        }
        this.vo = vo;
    }

    public MemberVO getVo() {
        return vo;
    }

}
