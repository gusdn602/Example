<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>게시판글쓰기</title>
<link rel="stylesheet" href="/clsproj/css/w3.css">
<script type="text/javascript" src="/clsproj/js/jquery-3.5.0.min.js"></script>
<style>
    
</style>
<script type="text/javascript">
	
	function setNum(cnt){
		cnt = cnt + 1;
		return cnt;
	}
	
	var cnt = 1;
	function addTg(){
		cnt = setNum(cnt);
		var tag1 = '<input class="file w3-input w3-border" type="file" name="file'+ cnt + '" id="file'+ cnt +'">';
		var no = 0;
		var el = $('.file').val();
		for(i = 0 ; i < el.length ; i++){
			if(!el[i]){
				no = no + 1;
			}
		}
		if(no > 1 ){
			return;
		}
		$('.box').append(tag1);
		setNum();
		$('.box > input').last().change(function(){
			addTg();
		});
	}
	
	$(document).ready(function(){
		$('#save').click(function(){
			// 데이터 유효성 체크
			$('#frm').submit();
		});
		
		$('.file').click(function(){
			var str = $(this).val();
			alert(str);
			if(!str || str == ''){
				addTg();
			}
		});
	});
</script>
</head>
<body>
    <div class="w3-content" style="max-width: 1000px;">
        <div class="w3-center w3-col ">
            <h2>게시판글쓰기</h2>
        </div>
        <form method="post" action="/clsproj/board/boardWriteProc.cls" id="frm"
        		class="w3-row w3-margin-top" encType="multipart/form-data">
            <div class="w3-row w3-margin-top">
                <div class="w3-card w3-padding">
                    <input class="w3-border-0" type="text" name="title" id="title" placeholder="제목 입력란" style="width: 960px;">
                </div>
            </div>
            <div class="w3-row w3-margin-top w3-left-align box">
                <input class="file w3-input w3-border" type="file" name="file1" id="file1">
                <!-- 
                <input class="file w3-input w3-border" type="file" name="file2">
                <input class="file w3-input w3-border" type="file" name="file3">
                <input class="file w3-input w3-border" type="file" name="file4">
                 -->
            </div>
            <div class="w3-row w3-margin-top">
                <div class="w3-card w3-padding w3-margin-bottom">
                    <textarea class="w3-border-0" name="body" id="body" 
                    			cols="105" rows="10" placeholder="본문 입력란" 
                    			style="resize: none;"></textarea>
                </div>
            </div>
        </form>
        <div class="w3-row w3-margin-top w3-margin-bottom">
            <div class=" w3-button w3-blue" id="cancel">취소</div>
            <div class=" w3-button w3-green" id="save">완료</div>
        </div>
      </div>
</body>
</html>