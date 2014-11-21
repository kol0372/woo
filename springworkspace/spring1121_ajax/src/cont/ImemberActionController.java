package cont;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import vo.ImemberVO;
import dao.ImemberDao;

@Controller
public class ImemberActionController {
	@Autowired
	private ImemberDao iDao;

	@RequestMapping(value = "/idcheck.kosta", method = RequestMethod.POST)
	public ModelAndView idCheck(String id) {
		System.out.println("C_ID:" + id);
		ModelAndView mav = new ModelAndView("idchk");
		int res = iDao.checkID(id);
		String msg;
		if (res > 0) {
			msg = "이미 존재하는 아이디 입니다.";
		} else {
			msg = "사용 가능한 아이디 입니다.";
		}
		mav.addObject("idv", id);
		mav.addObject("msg", msg);
		mav.addObject("res", res);
		return mav;
	}

	// login처리
	@RequestMapping(value = "/login.kosta", method = RequestMethod.POST)
	public ModelAndView login(ImemberVO vo, HttpSession session) {
		ModelAndView mav = new ModelAndView("index");
		int res = iDao.loginCheck(vo);
		String msg = "";
		if (res > 0) {
			msg = "로긴성공.";
			session.setAttribute("uid", vo.getId());
		} else {
			msg = "로긴실패";
		}

		mav.addObject("msg", msg);
		return mav;

	}
	@RequestMapping(value = "/loginout.kosta")
	public ModelAndView logout(HttpSession session) {
		session.invalidate();
		ModelAndView mav = new ModelAndView("index");
		return mav;

	}

}
