package ex4;

public class DaoImp implements Dao {

	@Override
	public void first() {
		for (int i = 0; i <= 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("������ ���� ���Ƚ��ϴ�.");
	}

	@Override
	public String second() {
		StringBuffer s = new StringBuffer();
		s.append("---------------------").append("\n");
		s.append("��浿").append("\n");
		s.append("---------------------").append("\n");
		return s.toString();
	}

}
