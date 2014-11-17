package order;

public class MyOrder implements MenuInter {

	@Override
	public String order(YourOrder vo) {
		StringBuffer s = new StringBuffer();
		
		s.append("<li>주문하신제품은").append(vo.getOrdName()).append("입니다.</li>");
		s.append("<li>주문하신 제품의 갯수는:").append(vo.getQuant()).append("입니다.</li>");
		s.append("<li>주문하신 제품의 총가격은:").append(vo.getQuant() * vo.getPrice())
				.append("입니다.</li>");
		
		return s.toString();
	}

}
