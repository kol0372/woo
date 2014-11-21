package ex1;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import dao.DaoServiceImple;

@Controller
public class CopyOfTBoardController {

	@Autowired
	private DaoServiceImple dao;

	@RequestMapping(value = "/save.kosta", method = RequestMethod.POST)
	// @ModelAttribute - tvo∞° ModelAndView¿« addObjectµ 
	public ModelAndView save(@ModelAttribute("tvo") TBoardVO tvo,
			HttpServletRequest request) {

		MultipartFile path= tvo.getMfile();
		

		tvo.setMfile2(path.toString());

		ModelAndView mav = new ModelAndView("success3");
		mav.addObject("imgName", oriFn);

		try {
			= dao.getList(tvo);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return mav;
	}
}
