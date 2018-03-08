<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%	
	if(null == request.getSession().getAttribute("currentProgress")){				
		request.getSession().setAttribute("currentProgress", 0);
	}
%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>

<script type="text/javascript">
	var refreshprogessbar = setInterval(checkProgress, 1000);// 1 seconds
	function checkProgress() {/*pass the actual id instead of 12345*/
    	$.getJSON('progressServlet', function(progress) {
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