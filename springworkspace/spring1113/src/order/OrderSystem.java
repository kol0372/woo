package order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class OrderSystem {
	
	// auto�� ����
	@Autowired
	private MenuInter menu;

	

	public String printMenu(YourOrder vo) {
		return vo.getName() + "����<br/>" + menu.order(vo);
	}
}
