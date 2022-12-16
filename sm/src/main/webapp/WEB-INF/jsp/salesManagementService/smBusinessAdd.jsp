<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="ko">
<head>
<%@ include file="/WEB-INF/include/include-header.jspf" %>
</head>
<body>
<h2>
	사업추가
</h2>

<form id="frm">
	<table class="type02">
	
		<tr>
			<th><label>코드선택</label></th>
			<td scope="row">
				<select name="CODE">
					<option value="none" hidden>== 선택 ==</option>
					<option value="유지보수">유지보수</option>
					<option value="구축">구축</option>
					<option value="구독">구독</option>
					<option value="SI">SI</option>
					<option value="컨설팅">컨설팅</option>
					<option value="DB구축">DB구축</option>
				</select>
			</td>
		</tr>
		<tr>
			<th><label>사업명/사업개요</label></th>
			<td scope="row">
				<input type="text" id="businessname" name="businessname" required="required">
			</td>
		</tr>
		<tr>
			<th><label>발주처</label></th>
			<td scope="row">
				<input type="text" id="client" name="client" required="required">
			</td>
		</tr>
		<tr>
			<th><label>계약 기간</label></th>
			<td scope="row">
				<input type="date" id="strstartterm" name="strstartterm"> ~ 
				<input type="date" id="strendterm" name="strendterm">
			</td>
		</tr>
		<tr>
			<th><label>전체사업금액</label></th>
			<td scope="row">
				<input type="number" id="plustotalbusinessamount" name="plustotalbusinessamount">
			</td>
		</tr>
		<tr>
			<th><label>지분율</label></th>
			<td scope="row">
				<input type="number" id="Ratio" name="Ratio" min="0" max="100"> %
			</td>
		</tr>
		
	
	</table>
	
	<a href="#this" id="write">작성하기</a>
	<a href="#this" id="list">매출총괄현황</a>
</form>

<%@ include file="/WEB-INF/include/include-body.jspf" %>
<script type="text/javascript">
	$(document).ready(function(){
		$("#list").on("click", function(e){
			e.preventDefault();
			fn_openSalesManagementList();
		});
	});
	
	function fn_openSalesManagementList(){
		var comSubmit = new ComSubmit();
		comSubmit.setUrl("<c:url value='/salesManagementService/openSalesManagementList.do' />");
		comSubmit.submit();
	}
</script>

</body>
</html>