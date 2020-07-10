<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>
<link rel="stylesheet" href="/clsproj/css/w3.css">
<link rel="stylesheet" href="/clsproj/css/user.css">
 <link rel="stylesheet" href="/clsproj/js/jquery-3.5.0.min.js">
 <style type="text/javascript">
 
 </style>
</head>
<body>
	<div class="w3-content mxw">
		<h2 class="w3-light-green w3-center w3-padding w3-card-4">${DATA.name}</h2>
		<div class="w3-col w3-padding w3-card-4 w3-margin-bottom w3-center" >
			<img class="w3-border w3-card pd-20" src="/subproj/img/${DATA.avatar}">
		</div>
		<div class="w3-col">
			<div class="w3-col w-200">회원번호 : </div>
			<div class="w3-rest f16">${DATA.mno} </div>
		</div>
		<div class="w3-col">
			<div class="w3-col w-200">회원이름 : </div>
			<div class="w3-rest f16">${DATA.name} </div>
		</div>
		<div class="w3-col">
			<div class="w3-col w-200">회원계정 : </div>
			<div class="w3-rest f16">${DATA.id} </div>
		</div>
		<div class="w3-col">
			<div class="w3-col w-200">회원메일 : </div>
			<div class="w3-rest f16">${DATA.mail} </div>
		</div>
		<div class="w3-col">
			<div class="w3-col w-200">전화번호 : </div>
			<div class="w3-rest f16">${DATA.tel} </div>
		</div>
		<div class="w3-col">
			<div class="w3-col w-200">전화성별 : </div>
			<div class="w3-rest f16">${DATA.gen} </div>
		</div>
		<div class="w3-col">
			<div class="w3-col w-200">가입일자 : </div>
			<div class="w3-rest f16">${DATA.jDate} </div>
		</div>
	</div>
</body>
</html>