<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%	
	if(null == request.getSession().getAttribute("currentProgress")){				
		request.getSession().setAttribute("currentProgress", 0);
	}
%>

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
<style>


#t01 {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

#t01 td, #t01 th {
    border: 1px solid #ddd;
    padding: 8px;
}

#t01 tr:nth-child(even){background-color: #f2f2f2;}

#t01 tr:hover {background-color: #ddd;}

#t01 th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: #3232ff;
    color: white;
}


ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333333;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 16px;
    text-decoration: none;
}

li a:hover {
    background-color: #111111;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
function validateForm() {
	if (document.getElementById("ddOne").value == "" && document.getElementById("ddTwo").value == "" && document.getElementById("fileToLoad1").value == ""  ) {
	    alert("Environment , Browser and Test Data are  not selected .Select Environment , Browser and Test Data");
	    return false;
	  }
	if (document.getElementById("ddOne").value == "" && document.getElementById("ddTwo").value == ""   ) {
	    alert("Environment and Browser are  not selected .Select Environment and Browser");
	    return false;
	  }
	if (document.getElementById("ddOne").value == ""  && document.getElementById("fileToLoad1").value == ""  ) {
	    alert("Environment and Test Data  are  not selected .Select Environment and Test Data ");
	    return false;
	  }
	if ( document.getElementById("ddTwo").value == "" && document.getElementById("fileToLoad1").value == ""  ) {
	    alert("Browser and Test Data are  not selected .Select  Browser and Test Data");
	    return false;
	  }
	 if (document.getElementById("ddOne").value == ""  ) {
	    alert("Environment is not selected .Select Environment");
	    return false;
	  }
	  if ( document.getElementById("ddTwo").value == "" ) {
		    alert("Browser is not selected .Select Browser");
		    return false;
		  }
	  if ( document.getElementById("fileToLoad1").value == "" ) {
		    alert("Select Test  Data");
		    return false;
		  }
	  if ( !document.getElementById('TC011').checked  )
			  //&& (!document.getElementById('TC012').unchecked) && (!document.getElementById('TC013').unchecked) &&(!document.getElementById('TC014').unchecked) && (!document.getElementById('TC015').unchecked) && (!document.getElementById('TC016').unchecked) && (!document.getElementById('TC017').unchecked))
	  {
		    alert("Select Test case for Execution ");
		    return false;
		  } 
	}
</script>
<body >

<progress id="p1" max="100" value="0"><span>0</span>%</progress>

<form action="${pageContext.request.contextPath}/myservlet" onsubmit="return validateForm()" method="post"  >
  <!--    Username: <input type="text" name="username"/> <br/>
    Password: <input type="password" name="password"/> <br/> -->
       <p><b>Environment:</b></b></p>
    <select id="ddOne" name="Environment1">
    <option value="">Choose One</option>
  <option value="QA">QA</option>
  <option value="TRN">TRN</option>
  </select>
 <p><b>Browser:</b></p>
  <select id="ddTwo" name="browser1">
  <option value="">Choose One</option>
  <option value="Chrome">Chrome</option>
  <option value="Firefox">Firefox</option>
  <option value="InternetExplorer">InternetExplorer</option>
  </select>
  <p> </p>
  <br>
 <table>
    
    <tr>
        <td><b>Test Data:</b></td>
        <td><input type="file" id="fileToLoad1"></td>
        
    </tr>
    
</table>
  <table id="t01" >
 <caption><b>User Tab - Test Suite</b></caption>
  <tr>
  <th onclick="sortTable(1)">Sr No</th>
    <th onclick="sortTable(0)">Test Case Name</th>
    <th >Execution</th> 
       <!-- <th>Status</th>  -->
      </tr>
  <tr>
  <th>1</th>
    <td>Verify user is able to login</td>
    <td><input type="checkbox" name="TC01" id="TC011"></td> 
  <%--  <td><%=request.getAttribute("status1")%></td>  --%>
  
   
  </tr>
  <tr>
  <th>2</th>
    <td>Verify user Tab is displayed </td>
    <td><input type="checkbox" name="TC02" id="TC012"></td> 
     <%--  <td><%=request.getAttribute("status2")%></td>  --%>
  
  </tr>
  <tr>
  <th>3</th>
    <td>Verify user is able to search by user firstName and LastName  </td>
    <td><input type="checkbox" name="TC03" id="TC013"></td> 
  
  </tr>
  <tr>
  <th>4</th>
    <td>Verify user is able to search by UserID  </td>
    <td><input type="checkbox" name="TC04" id="TC014"></td> 
   
  </tr>
  <tr>
  <th>5</th>
    <td>Verify user is able to search by Supervisor FirstName and LastName   </td>
    <td><input type="checkbox" name="TC05" id="TC015"></td> 
   
  </tr>
  <tr>
  <th>6</th>
    <td>Verify user is able to search by SupervisorID  </td>
    <td><input type="checkbox" name="TC06" id="TC016"></td> 
  
  </tr>
   <tr>
   <th>7</th>
    <td>Verify user is able to search by Site Name  </td>
    <td><input type="checkbox" name="TC07" id="TC017"></td> 
   
  </tr>
</table>




<p>request1:<td><%=request.getAttribute("mypercentage")%></td><p>

   <input  type="submit" value="Execute" onclick="loadDoc()"/>
   </br>
<p>request2:<td><%=request.getAttribute("mypercentage")%></td><p>
</form>

 <p>request3:<td><%=request.getAttribute("mypercentage")%></td><p>
 <script>
function loadDoc() {
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
      document.getElementById("mypercentage").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET", "ajax_info.txt", true);
  xhttp.send();
}
</script>
<script>
function sortTable(n) {
  var table, rows, switching, i, x, y, shouldSwitch, dir, switchcount = 0;
  table = document.getElementById("t01");
  switching = true;
  //Set the sorting direction to ascending:
  dir = "asc"; 
  /*Make a loop that will continue until
  no switching has been done:*/
  while (switching) {
    //start by saying: no switching is done:
    switching = false;
    rows = table.getElementsByTagName("TR");
    /*Loop through all table rows (except the
    first, which contains table headers):*/
    for (i = 1; i < (rows.length - 1); i++) {
      //start by saying there should be no switching:
      shouldSwitch = false;
      /*Get the two elements you want to compare,
      one from current row and one from the next:*/
      x = rows[i].getElementsByTagName("TD")[n];
      y = rows[i + 1].getElementsByTagName("TD")[n];
      /*check if the two rows should switch place,
      based on the direction, asc or desc:*/
      if (dir == "asc") {
        if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {
          //if so, mark as a switch and break the loop:
          shouldSwitch= true;
          break;
        }
      } else if (dir == "desc") {
        if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) {
          //if so, mark as a switch and break the loop:
          shouldSwitch= true;
          break;
        }
      }
    }
    if (shouldSwitch) {
      /*If a switch has been marked, make the switch
      and mark that a switch has been done:*/
      rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
      switching = true;
      //Each time a switch is done, increase this count by 1:
      switchcount ++;      
    } else {
      /*If no switching has been done AND the direction is "asc",
      set the direction to "desc" and run the while loop again.*/
      if (switchcount == 0 && dir == "asc") {
        dir = "desc";
        switching = true;
      }
    }
  }
}
</script>




<script type="text/javascript">

function saveTextAsFile()
{
    var textToSave = document.getElementById("fileToLoad1").value;
    var textToSaveAsBlob = new Blob([textToSave], {type:"text/plain"});
    var textToSaveAsURL = window.URL.createObjectURL(textToSaveAsBlob);
    var fileNameToSaveAs = document.getElementById("fileToLoad1").value;

    var downloadLink = document.createElement("a");
    downloadLink.download = fileNameToSaveAs;
    downloadLink.innerHTML = "Download File";
    downloadLink.href = textToSaveAsURL;
    downloadLink.onclick = destroyClickedElement;
    downloadLink.style.display = "none";
    document.body.appendChild(downloadLink);

    downloadLink.click();
}

function destroyClickedElement(event)
{
    document.body.removeChild(event.target);
}


</script>


<br>





</body>
</html>