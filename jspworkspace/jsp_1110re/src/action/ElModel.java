package action;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.BoardVO;
import vo.Customer;
import control.ActionForward;
import dao.BoardDao;

public class ElModel implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req,
			HttpServletResponse resp) throws IOException {
		// TODO Auto-generated method stub		return null;
		
		Customer cust = new Customer();
		cust.setName("홍길동");
		cust.setEmail("kol@naver.com");
		cust.setPhone("01056220372");
		
		req.setAttribute("customer", cust);
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("name", "소나타");
		map.put("maker", "현대");
		
		req.setAttribute("car", map);
		
		return new ActionForward("el.jsp", false);
	}

}
