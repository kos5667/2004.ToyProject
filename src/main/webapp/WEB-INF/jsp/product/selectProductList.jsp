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
					      var msg = "ERROR<br><br>"
					      msg += request.status + "<br>" + request.responseText + "<br>" + error;
					      console.log(msg);                    
					    }
				});


			
			
		})	;
	});
	
	
	
	
</script>

<body>
<input type='button' id='btn1' value="1">

</body>
</html>