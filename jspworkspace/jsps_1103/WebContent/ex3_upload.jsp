<%@page import="dao.ImgDirDao"%>
<%@page import="vo.ImgDriVO"%>
<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%
	
	String path = application.getRealPath("/upload");
	System.out.println(path);

    MultipartRequest mr = new MultipartRequest(request,path,1024*1024*5,
    				"euc-kr",new DefaultFileRenamePolicy());
    
    System.out.println("writer :"+mr.getParameter("writer"));
    // �Ѿ�� ������ File��ü�� ����
    File s_file =mr.getFile("s_file");
    System.out.println("file :"+ s_file.getName());
    String fileUrl = application.getContextPath() + "/upload/"+ s_file.getName();

	// ��� �Ķ���͸� vo��ü�� ����
	ImgDriVO v = new ImgDriVO();
	v.setWriter(mr.getParameter("writer"));
	v.setImgpath(s_file.getName());
	// Dao�� ����
	ImgDirDao.getDao().addImg(v);
	// �̵��� ������ �̵�
	response.sendRedirect("ex3_list.jsp");

%><img src="<%=fileUrl%>"> / <%=mr.getParameter("writer") %><br />
<img src="<%=application.getContextPath()%>/upload/unjung.jpg">





