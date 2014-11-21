package ex1;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dao.DaoServiceImple;

@Controller
public class TBoardController {
	
	@Autowired
	private DaoServiceImple dao;

	@RequestMapping(value = "/save.kosta", method = RequestMethod.POST)
	// @ModelAttribute - tvo가 ModelAndView의 addObject됨
	public ModelAndView save(@ModelAttribute("tvo") TBoardVO tvo,
			HttpServletRequest request) {

		// System.out.println("TVO : sub" + tvo.getMfile());
		// Dao에 연결을 할 수 도 있고, 가공!

		System.out.println("Mfile()" + tvo.getMfile());
		HttpSession session = request.getSession();
		// 시스템에맞는 documentroot 경로를 가져온다
		String r_path = session.getServletContext().getRealPath("/");
		System.out.println(r_path);
		// 이미지 업로드할 경로
		String img_path = "\\img\\";
		System.out.println(img_path);
		// 조합해서 이미자가 저장될 경로값을 구현
		StringBuffer path = new StringBuffer();
		// mfile.getOriginalFilename() 업로드된 파일 이름을 path에 설정
		String oriFn = tvo.getMfile().getOriginalFilename();
		
		path.append(r_path).append(img_path).append(oriFn);
		System.out.println(path);
		
		//---------------------------------
		tvo.setMfile2(oriFn);
		//--------------------------------
		
		// 이미지가 저장될 경로를 지정 끝
		// 파일업로드

		File f = new File(path.toString());

		try {
			tvo.getMfile().transferTo(f);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		ModelAndView mav = new ModelAndView("success2");
		mav.addObject("imgName", oriFn);

		try {
			dao.transaction(tvo);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return mav;
	}
}
