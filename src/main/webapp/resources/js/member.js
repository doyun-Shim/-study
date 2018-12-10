/**
 * 
 */
var host = "http://220.121.48.205:8181";
$(document).ready(function(){
	$("#btnRegist").on("click",function(){
		$.ajax({url: host+"/user/insert",
			data:{ID:$("#id").val(),NAME:$("#name").val(),PASSWORD:$("#password").val()},
			method:"post",
			success: function(result){
				console.log(result);
				location.href = "board.html";
			},
			error:function(error){
				
			}
	    });
	});
});