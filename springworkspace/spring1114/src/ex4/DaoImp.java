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
		System.out.println("연결이 끝나 버렸습니다.");
	}

	@Override
	public String second() {
		StringBuffer s = new StringBuffer();
		s.append("---------------------").append("\n");
		s.append("김길동").append("\n");
		s.append("---------------------").append("\n");
		return s.toString();
	}

}
