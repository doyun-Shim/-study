<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<script type="http://ajax.googleapis.com/ajax/libs/jqurey/1.11.3/jquery.min.js"></script>
	<script src="/js/custom.js"  type="text/javascript"></script>
</head>

<body>
   <h1 align=center>거래처 관리</h1>
   <p><table border="1" cellpadding="20" cellspacing="0" width=350 align=center><tr><td>
	사업자번호 <input type="text" name="busi_num" value="111-11-11111"><br>
	거 래 처 명  <input type="text" name="custom" value="롯데마트">
	<input id="btnSearch" type="button" value="조회" >
    </td></tr></table></p>

   <table border="1" cellpadding="5" cellspacing="0" width="350" align=center>
	<tr><td align="center">사업자번호 </td><td align="center">거래처명</td></tr>
	<tr><td align="center">111-11-11111</td>
	<td align="center">롯데마트</td></tr>	
	<tr><td>&nbsp; </td><td>&nbsp; &nbsp;</td></tr>
	<tr><td>&nbsp; &nbsp;</td><td>&nbsp; &nbsp;</td></tr>
	<tr><td>&nbsp; &nbsp;</td><td>&nbsp; &nbsp;</td></tr>
	<tr><td>&nbsp; &nbsp;</td><td>&nbsp; &nbsp;</td></tr>
   </table></p>
   
	<p align=right>
		<input id="btnSave" type="submit" value="저장">
		<input id="btnSel" type="submit" value="가져오기">
		<input type="submit" value="삭제"></p>
	
    <div style="border: 1px">
		<form name="custom">
			사업자번호 <input type="text" name="busi_num" value="111-11-11111" valign=center>  
		 	약          칭<input type="text" name="short" value="롯데마트" char="20"><br>
		 	거 래  처 명 <input type="text" name="custom" value="롯데마트" char="20"><br>	
			대    표   자  <input type="text" name="ceo" value="홍길동" char="10">
			담    당   자  <input type="text" name="charge_person" value="홍길동" char="10"><br>
			업          태  <input type="text" name="busi_condition" value="test" char="10">	
			종          목  <input type="text" name="item" value="test1" char="10"><br>
			우 편 번 호  <input type="search" name="post_num" value="023">
			<input type="button" value="검색" onclick=window.open("jusoserch.html","","resieeable=no")>
			주  소  1 <input type="text" name="addr1" value="test"><br>
			주  소  2 <input type="text" name="addr2" width="500" value="test11"><br>
			전화번호 <input type="tel" name="tel" value="021111222">
			팩스번호 <input type="tel" name="fax" value="023333222"><br>
			홈페이지 <input type="url" name="homepage" value="http://test.com"><br>
			법인여부 <input type="radio" name="co_yn" value="Y">법인
				<input type="radio" name="co_yn" value="N" checked="checked">개인
			해외여부 <input type="radio" name="foreign_yn" value="N" checked>국내
				<input type="radio" name="foreign_yn" value="Y">해외<br>
			과세구분 <select name="tax_yn"><option value="Y" selected>과세/면세</option><option value="N">비과세</option></select>
			국       가<input type="submit" name="kor" value="KOR"><input type="search" name="post_num" value="053">
				<input type="button" value="검색" onclick=window.open("jusoserch.html","","resieeable=no")></br>
			특수관계자<input type="checkbox" name="special_relation" value="Y"> 
			거래중지 <input type="checkbox" name="trade_stop" value="Y"></br>
			계 약 기 간<input type="date" name=contract_period_s value="2001-01-01">
				  <input type="date" name=contract_period_e value="2001-12-31"><br>
			등 록 정 보<input type="button" name="regi_info_man" value="홍길동">
		  		  <input type="datetime" name="regi_info_date" value="2005-05-05">
			변 경 정 보<input type="button" name="modi_info_man" value="홍길동">
		  		  <input type="datetime" name="modi_info_date" value="2005-05-05"><br><br>
			(거래처 계좌정보)
		</form>	
		<table border=1 cellpadding=10 cellspacing="0" width="600">
			<tr><td align="center">사 무 소</td><td align="center">은행</td>
			<td align="center">계좌번호</td></tr>
	   		<tr><td align="center">청주공장</td><td align="center"> 농협중앙회</td>
			<td align=center>111-111-1111111</td></tr>
			<tr><td>&nbsp; &nbsp;</td><td></td><td></td></tr>	
		</table>
   </div>
</body>
</html>
