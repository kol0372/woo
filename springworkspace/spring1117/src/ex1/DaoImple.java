package ex1;

public class DaoImple implements Dao {

	@Override
	public void fifth() {
		String[] ar = { "��츮", "�缼��", "����ö", "������", "����", "������" };
		
		for(int i =0; i <= ar.length; i++){
			System.out.println("�����Ͻ� ����:" + ar[i]);
		}

	}
}