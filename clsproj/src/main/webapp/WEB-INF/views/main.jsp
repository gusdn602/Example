<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/clsproj/css/w3.css" />
<link rel="stylesheet" href="/clsproj/css/user.css" />
<script type="text/javascript" src="/clsproj/js/jquery-3.5.0.min.js"></script>
<style>

</style>
<script type="text/javascript">
	$(document).ready(function(){
		$('#lbtn').click(function(){
			$(location).attr('href', '/clsproj/member/login.cls');
		});
		$('#obtn').click(function(){
			$(location).attr('href', '/clsproj/member/logout.cls');
		});
		$('#mlbtn').click(function(){
			$(location).attr('href', '/clsproj/member/memberList.cls');
		});
		$('#bbtn').click(function(){
			$(location).attr('href', '/clsproj/board/boardList.cls');
		});
	});
</script>
</head>
<body>
	<div class="w3-content mxw">
		<h2 class="w3-center w3-pink w3-padding">Main Page</h2>
		<div class="w3-col w3-margin-top">
			<c:if test="${empty SID}">
				<div class="w3-button w3-blue w3-hover-aqua" id="lbtn">Login</div>
			</c:if>
			<c:if test="${not empty SID}">
				<div class="w3-button w3-blue w3-hover-aqua" id="obtn">Logout</div>
				<div class="w3-button w3-indigo w3-hover-blue" id="mlbtn">MemberList</div>
				<div class="w3-button w3-red w3-hover-blue" id="bbtn">게시판</div>
			</c:if>
		</div>
	</div>
</body>
</html>