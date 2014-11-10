package action;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.BoardVO;
import vo.PageVO;
import control.ActionForward;
import dao.BoardDao;

public class BoardListModel implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		// 페이지 설정을 위한 객체를 생성
		PageVO pageInfo = new PageVO();
		// 한페이지에 보여줄 라인수
		int rowsPerPage = 5;
		// 한페이지에 보여줄 페이지블록수
		int pagesPerBlock = 5;
		// 페이지 값, 1, 2, 3
		int currentPage = Integer.parseInt(request.getParameter("page"));
		int currentBlock = 0;
		// 페이지 값에 따라서 페이지블록을 연산하는 부분(홀수일경우1을더하는)
		if(currentPage % pagesPerBlock == 0){
			currentBlock = currentPage / pagesPerBlock;
		} else {
			currentBlock = currentPage / pagesPerBlock + 1;
		}
		// 현재페이지 값에 따른 startRow값을 연산(SQL문에서 between절에 들어갈 값)
		// 1페이지 일때는 1부터, 2페이지 일때는 6부터
		int startRow = (currentPage -1) * rowsPerPage + 1;
		// 1*5 = 5까지, 2*5= 10까지..
		int endRow = currentPage * rowsPerPage;
		
		// 전체 데이터 레코드 값을 얻기		
		int totalRows = BoardDao.getDao().getTotalCount();
		int totalPages = 0;
		// 전체 페이지값 구하기
		if(totalRows % rowsPerPage == 0){
			totalPages = totalRows / rowsPerPage;
		} else {
			totalPages = totalRows / rowsPerPage + 1;
		}
		// 전체 블록값 구하기
		int totalBlocks = 0;
		if(totalPages % pagesPerBlock == 0){
			totalBlocks = totalPages / pagesPerBlock;
		} else {
			totalBlocks = totalPages / pagesPerBlock + 1;
		}
		pageInfo.setCurrentPage(currentPage);
		pageInfo.setCurrentBlock(currentBlock);
		pageInfo.setRowsPerPage(rowsPerPage);
		pageInfo.setPagesPerBlock(pagesPerBlock);
		pageInfo.setStartRow(startRow);
		pageInfo.setEndRow(endRow);
		pageInfo.setTotalRows(totalRows);
		pageInfo.setTotalPages(totalPages);
		pageInfo.setTotalBlocks(totalBlocks);
		
		request.setAttribute("pageInfo", pageInfo);
		HashMap<String, Integer> map = new HashMap<>();
		map.put("begin", startRow);
		map.put("end", endRow);
		List<BoardVO> list = BoardDao.getDao().getList(map);
		request.setAttribute("list", list);
		
		return new ActionForward("boardList.jsp", false);
	}

}
