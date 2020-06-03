<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
<script>
	
	$(function(){
		
		
		$("#btn1").on("click",function(){
				  $.ajax({
				    url: "/product/selectProductList",
				    type: "POST",
				    dataType: "json",
				    success: function(data){      
				    	console.log(data);
				    },   
				    error: function (request, status, error){  
					      console.log(error);                    
					    }
				});
		})	;
		
		$('#btn2').on('click', function(){
			$.ajax({
				url: "/product/ajaxTest",
				type : "GET",
				dataType : "json",
				success : function(testData){
					const divTest=$('#divTest');
					let str="";
					for(let i=0; i<testData.length;i++){
						const data=testData[i];
						
						str+=data.AUTHOR+"<br>";
					}
					
					divTest.html(str);
				},
				error : function(error){
					console.log(error);
				}
			})	
		})
	});
	
	
	
	
</script>

<body>
<input type='button' id='btn1' value="1">
<input type='button' id='btn2' value="ajaxTest">
<div id='divTest'>

</div>

</body>
</html>