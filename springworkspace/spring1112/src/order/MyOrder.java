package order;

public class MyOrder implements MenuInter {

	@Override
	public String order(YourOrder vo) {
		StringBuffer s = new StringBuffer();
		
		s.append("<li>�ֹ��Ͻ���ǰ��").append(vo.getOrdName()).append("�Դϴ�.</li>");
		s.append("<li>�ֹ��Ͻ� ��ǰ�� ������:").append(vo.getQuant()).append("�Դϴ�.</li>");
		s.append("<li>�ֹ��Ͻ� ��ǰ�� �Ѱ�����:").append(vo.getQuant() * vo.getPrice())
				.append("�Դϴ�.</li>");
		
		return s.toString();
	}

}
