package order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class OrderSystem {
	
	// auto로 구현
	@Autowired
	private MenuInter menu;

	

	public String printMenu(YourOrder vo) {
		return vo.getName() + "님이<br/>" + menu.order(vo);
	}
}
