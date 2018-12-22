var host = "http://220.121.48.205:8181";
$(document).ready(function(){
	$.ajax({url: host+"/board/select",
		data:{},
		method:"get",
		success: function(result){
			console.log(result);
			var html = "";
			for (var i = 0, j = result.length; i < j; i++) {
				html += "<tr><td><a href='boardReg.html?BOARD_ID="+result[i].BOARD_ID+
				   "'>"+result[i].TITLE+"</a></td><td>"+result[i].MEMBER_ID+"</td></tr>";
			}
			$("#boardBody").html(html);
		},
		error:function(error){
		}
    });
});