package ex1;

public class DaoImple implements Dao{

	@Override
	public void fifth() {
		String[] ar = {"��浿","������","������","�۹���","�ڰ���"};
		for(int i=0; i<=ar.length; i++){
			System.out.println("�����Ͻ� ����! :"+ar[i]);
		}
	}
}
