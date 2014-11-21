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
	// @ModelAttribute - tvo�� ModelAndView�� addObject��
	public ModelAndView save(@ModelAttribute("tvo") TBoardVO tvo,
			HttpServletRequest request) {

		// System.out.println("TVO : sub" + tvo.getMfile());
		// Dao�� ������ �� �� �� �ְ�, ����!

		System.out.println("Mfile()" + tvo.getMfile());
		HttpSession session = request.getSession();
		// �ý��ۿ��´� documentroot ��θ� �����´�
		String r_path = session.getServletContext().getRealPath("/");
		System.out.println(r_path);
		// �̹��� ���ε��� ���
		String img_path = "\\img\\";
		System.out.println(img_path);
		// �����ؼ� �̹��ڰ� ����� ��ΰ��� ����
		StringBuffer path = new StringBuffer();
		// mfile.getOriginalFilename() ���ε�� ���� �̸��� path�� ����
		String oriFn = tvo.getMfile().getOriginalFilename();
		
		path.append(r_path).append(img_path).append(oriFn);
		System.out.println(path);
		
		//---------------------------------
		tvo.setMfile2(oriFn);
		//--------------------------------
		
		// �̹����� ����� ��θ� ���� ��
		// ���Ͼ��ε�

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
