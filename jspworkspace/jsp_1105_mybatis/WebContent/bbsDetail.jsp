<%@page import="vo.BbsVO"%>
<%@page import="java.util.List"%>
<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="ex1_top.jsp"%>

<article>


	<p>���� IT���� ���� �����޴� java Technology�� ���ʺ��� ���ޱ������ �н��մϴ� ��������
		�����ӿ�ũ(java opensource framework)�� �̿��� Enterprise Solution ���� �� ������
		�ȵ���̵� �� ���̺긮����� �̿��� ����� ���ø����̼� ������ �н��ϰ� �ǹ� ������Ʈ�� ���� �������� �ʿ�� �ϴ� �ڹ�
		�����Ͼ� �缺�� ��ǥ�� �մϴ�.</p>
	<section>
		<header style="margin: auto; width: 100%;">
			<h2>BbsDETAil page</h2>
		</header>
		<p>
		<table
			style="width: 100%; border: 1px solid; border-collapse: collapse;">
			<thead style="background: #2392f5">
				<tr style="color: white;">
					<th>��ȣ</th>
					<th>����</th>
					<th>�ۼ���</th>
					<th>��ȸ��</th>
					<th>������</th>
					<th>����</th>
					<th>�ۼ���¥</th>
				</tr>
			</thead>
			<tbody>
				<!-- �ݺ����� -->
				<%
					int num = Integer.parseInt(request.getParameter("num"));
						
							BbsVO e = BoardDao.getDao().detail(num);
				%>
				<tr style="background: #00ff">
					<td><%=e.getNum()%></td>
					<td><%=e.getSub()%></td>
					<td><%=e.getWriter()%></td>
					<td><%=e.getHit()%></td>
					<td><%=e.getReip()%></td>
					<td><%=e.getCont()%></td>
					<td><%=e.getRedate().substring(0, 10)%></td>
				</tr>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="7" style="text-align: center"><input
						type="button" value="Write" 
						style="width: 170px; height: 50px; color: white; background-color: coral; font-size: 15px; font-style: oblique;"
						onclick="location='bbsForm.jsp'"> <input type="button"
						style="width: 170px; height: 50px; color: white; background-color: coral"
						value="List" onclick="location='bbslist.jsp'"> <input
						type="button" value="Update"
						style="width: 170px; height: 50px; color: white; background-color: coral"
						onclick="location='bbsupform.jsp?num=<%=num%>'"> <input type="button"
						value="delete"
						style="width: 170px; height: 50px; color: white; background-color: coral"
						onclick="location='bbsdelete.jsp?num=<%=num%>'"></td>
				</tr>
			</tfoot>
		</table>
		</p>
	</section>
</article>
<aside>
	<header>
		<h1>Siderbar Heading</h1>
	</header>
	<p>������ �� ������ �ƴ� ���ü��� ���� ������� aside�� ǥ���� �� �ִ�. ������ ���������� ����� ���� ����
		����Ʈ ��ũ�� �ȳ���, nav ����� �׷� ���� aside ��ҷ� ��� �� �� �ִ�. ���� ���α׿��� �¿��� ���̵�ٸ�
		�ǹ��ϴ� �����μ� ���̵���� Ư������ ���� �ʼ������� �ʾƼ� ǥ�ø� �ص� �ǰ� �� �ص� �Ǵ� ����� �Ǵ� ���������� �������
		�ڸ��� �� �ִ�.</p>

</aside>
<%@ include file="ex1_bottom.jsp"%>