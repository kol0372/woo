package ex1;
//���ܰ��� �޾Ƽ� ó���� �����̽�
public class After_ThrowAdvice {
	public void commThrow(Exception ew){
		System.out.println("���� ó�� �޼��� :"+ew.getMessage());
		System.exit(0);
	}
}
