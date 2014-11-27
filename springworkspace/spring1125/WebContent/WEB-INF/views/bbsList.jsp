<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>


<tiles:insertDefinition name="defaultTemplate">
	<tiles:putAttribute name="body">
		<div id="wrap" class="list">
		<table>
			<thead>
				<tr>
					<th colspan="5">Bbs1 List</th>
				</tr>
				<tr>
					<td>번호</td>
					<td>제목</td>
					<td>작성자</td>
					<td>조회수</td>
					<td>작성날짜</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="listv" items="${list}">
				<tr>
				<td>${listv.num}</td>
				<td><a href="bbs1detail.kosta?num=${listv.num}">${listv.sub}</a></td>
				<td>${listv.writer}</td>
				<td>${listv.hit}</td>
				<td>${listv.regdate}</td>
				</tr>
				</c:forEach>
			</tbody>
			<tfoot>
				<tr>
					<td colspan="5"><input type="button" value="write"
						onclick="location='bbs1form.kosta'"></td>
				</tr>
			</tfoot>

		</table>
	</div>
	</tiles:putAttribute>
</tiles:insertDefinition>

