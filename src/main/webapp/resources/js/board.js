/**
 * 
 */
var host = "http://220.121.48.205:8181";
$(document).ready(function(){
	$.ajax({url: host+"/board/select",
		data:{},
		method:"get",
		success: function(result){
			console.log(result);
			var html = "";
			for (var i = 0, j = result.length; i < j; i++) {
				html += "<tr><td><a href='boardReg.html?BOARD_ID="+result[i].BOARD_ID+"'>"+result[i].TITLE+"</a></td><td>"+result[i].MEMBER_ID+"</td></tr>";
			}
			$("#boardBody").html(html);
		},
		error:function(error){
			
		}
    });
	
	$("#btnSave").on("click",function(){
		$.ajax({url: host+"/custom/insert",
			data:$("form[name=custom]").serialize(),
			method:"post",
			success: function(result){
				console.log(result);
			},
			error:function(error){
				
			}
	    });
	});
	
	//가져오기
	$("#btnSel").on("click",function(){
		$.ajax({url: host+"/custom/select",
		    method:"get",
		    success: function(result){
				var html = "";
				console.log(result);
				for(var i = 0, j = result.length; i<j; i++){
					html+= "<tr><td>"+result[i].BUSI_NUM+"</td><td>"+result[i].CUSTOM+"</td></tr>"
		        }
				console.log("html",html);
				$($("table")[1]).append(html);
		    },
		    error:function(error){

		    }
		});
	});
	
	//가져오기
	$("#btnSearch").on("click",function(){
		$.ajax({url: "/custom/search",
		    method:"post",
		    data:{busi_num:$("input[name=busi_num]").val(),custom:$("input[name=custom]").val()},
		    success: function(result){
				var html = "";
				console.log(result);
				for(var i = 0, j = result.length; i<j; i++){
					html+= "<tr><td>"+result[i].BUSI_NUM+"</td><td>"+result[i].CUSTOM+"</td></tr>"
		        }
				console.log("html",html);
				$($("table")[1]).append(html);
		    },
		    error:function(error){

		    }
		});
		
	});
	
	
	//사업자번호 또는 거래처명으로 조회하여 콘솔에 출력하기- ajax, db - sql where 조건절 	
	// select *from BUSI_NUM or CUSTOM="insert"
});