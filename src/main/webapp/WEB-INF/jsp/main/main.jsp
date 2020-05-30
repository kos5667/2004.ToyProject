<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
<script>
///	$(function(){
//		
//	})
	
	function product2(){
		$('#product').on('click', function(){
			alert("ddd");
			$('form').attr('action','/product/selectProductList').attr('method','get').submit();
		});
	}
	
	
	function product3(){
		//alert("333");
		
	}
	
</script>
</head>
<body>
<form>

<div>
<input type='button' id='product' onclick="product3()">


</div>
</form>
</body>
</html>