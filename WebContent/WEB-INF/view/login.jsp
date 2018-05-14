<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script language="JavaScript" src="js/jquery-1.7.2.js"></script>
<script language="JavaScript" src="js/jquery-1.7.2.min.js"></script>
<title>登陆</title>
</head>
<body>
    <form method="post">
        用户名：<input type="text" name="userName"><br>
        密码：<input type="text" name="password"><br>
        <input type="submit" value="登陆">
    </form>
    
    <a href="#"  onclick="test()">ajax</a>
</body>


<script type="text/javascript">
function  test(){
	$.ajax({
		type : "POST",
		url:"login/getList",
		data :null,
		cache : false,
		dataType : "text",
		success : function(msg) {
			alert(msg)
		}
	});
}
</script>
</html>