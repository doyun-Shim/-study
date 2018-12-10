/**
 * 
 */
var host = "http://220.121.48.205:8181";
$(document).ready(function(){
	function getUrlParameter(name) {
	    name = name.replace(/[\[]/, '\\[').replace(/[\]]/, '\\]');
	    var regex = new RegExp('[\\?&]' + name + '=([^&#]*)');
	    var results = regex.exec(location.search);
	    return results === null ? '' : decodeURIComponent(results[1].replace(/\+/g, ' '));
	};
	if(window.location.search){
		$.ajax({url: host+"/board/detail",
			data:{BOARD_ID:getUrlParameter("BOARD_ID")},
			method:"post",
			success: function(result){
				$("#updateArea").show();
				var data = result[0];
				$("input[name=boardId]").val(data.BOARD_ID);
				$("input[type=text]").val(data.TITLE);
				$("#regId").text(data.NAME);
				$("#regDt").text(data.REGDATE);
				$("textarea").val(data.CONTENT);
				console.log(result);
			},
			error:function(error){
				
			}
	    });
	}
		
	$("input[type=button]").on("click",function(){
		if($("input[type=text]").val()==""){
			alert("제목은 필수입니다.");
			return;
		}
		var user = JSON.parse(sessionStorage.user);
		var boardId = $("input[name=boardId]").val();
		var data = {ID:user.ID,TITLE:$("input[type=text]").val(),CONTENT:$("textarea").val()};
		if(boardId){data.BOARD_ID = boardId;}
		$.ajax({url: host+"/board/insert",
			data:data,
			method:"post",
			success: function(result){
				location.href = "board.html";
				console.log(result);
			},
			error:function(error){
				
			}
	    });
	});
	
	$("#btnBack").on("click",function(){
		history.back();
	});
	
	$("#delete").on("click",function(){
		$.ajax({url: host+"/board/delete",
			data:{BOARD_ID:getUrlParameter("BOARD_ID")},
			method:"post",
			success: function(result){
				location.href = "board.html";
			}
	    });
	});
});