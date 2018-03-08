<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.shri.LongProcess"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
	//HttpSession session = request.getSession();
	if(null == session.getAttribute("longProcess_12345")){
		LongProcess username = new LongProcess(); 
		username.start();
		session.setAttribute("longProcess_12345", username);
	}
%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>

<script type="text/javascript">
	var refreshprogessbar = setInterval(checkProgress, 10000);// 10 seconds
	function checkProgress() {/*pass the actual id instead of 12345*/
    	$.getJSON('progressServlet?downloadId=12345', function(progress) {
        	if(progress == 100){clearInterval(refreshprogessbar);}
        	setProgress(progress);
    	});
	}

	function setProgress(value)
	{
	var progressBar = document.getElementById("p1");
	progressBar.value = value;
	progressBar.getElementsByTagName('span')[0].textContent = value;
	}
</script>
<title>Insert title here</title>
</head>
<body>
	<progress id="p1" max="100" value="0"><span>0</span>%</progress>
</body>
</html>