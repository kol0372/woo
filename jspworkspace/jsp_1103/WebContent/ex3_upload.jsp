<%@page import="dao.ImgDirDao"%>

<%@page import="vo.ImgDirVo"%>
<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	//���Ͼ��ε带 ���ؼ� ���� ���������� upload��ġ�� �����´�.
	String path = application.getRealPath("/upload");
	System.out.println(path);

	//enctype="multipart/form-data"�� ��� �Ϲ����� request�δ� ������ ÷�ε��� 
	//���� cos.jar���� multipartREquest��ü�� ����ؼ� ó���Ѵ�.
	//MultipartRequest(request,patrh,�������۷�,���ڵ�,���ϸ�������å);
	//new DefaultFileRenamepolicy():������ �����̸��� ���ε� �ȴٸ� ��������.
	MultipartRequest mr = new MultipartRequest(request, path,
	1024 * 1024 * 5, "euc-kr", new DefaultFileRenamePolicy());

	System.out.println("writer" + mr.getParameter("writer"));
	//�Ѿ�� ������ File��ü�� ����
	File s_file = mr.getFile("s_file");
	System.out.println("file" + s_file.getName());
	String fileUrl = application.getContextPath() + "/upload/"
	+ s_file.getName();

	ImgDirVo v = new ImgDirVo();
	v.setWriter(mr.getParameter("writer"));
	v.setImgpath(s_file.getName());
	//DAO����
	ImgDirDao.getDao().addImg(v);
	//�̵��� ������ �̵�
	response.sendRedirect("ex3_list.jsp");
%><img src="<%=fileUrl%>">
/<%=mr.getParameter("writer")%><img src="<%=application.getContextPath()%>/upload/unjung.jpg">