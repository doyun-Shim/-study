var host = "http://220.121.48.205:8181";
$(document).ready(function(){
	
	$("input[type=submit]").on("click", function(){
		$.ajax({url: host+"/user/loginChk",
			data:{ID:$("input[name=id]").val(),PW:$("input[name=pw]").val()},
			method:"post",
			success: function(result){
				console.log(result);
				
				if (result.length==0) {
					alert("id나 비밀번호가 맞지않습니다.")
				}else if(result.length==1){
					sessionStorage.setItem("user",JSON.stringify(result[0]));
					location.href = "board.html";
				}
				//서버에 로그인 유저 정보를 저장하고 게시판 목록 페이지로 이동한다.
			},
			error:function(error){
				console.log(error);
			}
		});
	});
});