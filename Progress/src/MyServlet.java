package name;

import java.io.IOException;




import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

//import com.google.common.collect.Table.Cell;

import jxl.*;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;



@WebServlet("/myservlet")
public class MyServlet extends HttpServlet {
	
	@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException ,ArithmeticException{
		
			
		if(null == request.getSession().getAttribute("currentProgress")){				
			request.getSession().setAttribute("currentProgress", 0);
		}
	
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
	        String Environment1 = request.getParameter("Environment1"); 
	        String browser1 = request.getParameter("browser1"); 
	        System.out.println(Environment1+" "+browser1);
	      
	
	        // do some processing here...
	      
	        // get response writer
	        //PrintWriter writer = response.getWriter();
	        openURL myClass = new openURL();
	        
	      
	        int passcount=0;
	        int executionCount=0;
	       
            
            //Obtain the reference to the first sheet in the workbook
           
           
            
             
            //Display the cell contents
            String statusTC01 = "No Run",statusTC02 = "No Run",statusTC03 = "No Run",statusTC04 = "No Run",statusTC05= "No Run",statusTC06 = "No Run",statusTC07="No Run"; 
            request.setAttribute("value12", "Pass");
            //System.out.println("status==" +request.getParameter("TC01")+ " boolean=");
            RequestDispatcher dispatcher = request.getRequestDispatcher("test2.jsp");
           int currentProgress=0;
            if (request.getParameter("TC01")!=null) {
            	try {
				 System.out.println("hi pooja");
		        	++executionCount;
					myClass.openurl(Environment1, browser1);
					
					++passcount;
					statusTC01="Pass";
					//request.setAttribute("status2", "Pass");
					//request.setAttribute("status1", "10%");
					currentProgress+=10;
					
					request.getSession().setAttribute("currentProgress", currentProgress);
					
					System.out.println("currentProgress1"+ currentProgress);
					request.setAttribute("mypercentage", Integer.toString(currentProgress)+"%");
					System.out.println("mypercentage2="+request.getAttribute("mypercentage"));
					 dispatcher.forward( request, response );
					//System.out.println("value12="+request.getAttribute("value12"));
				//	System.out.println("Status="+request.getAttribute("status2")+"value="+request.getAttribute("value12"));
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
	      if (request.getParameter("TC02")!=null)
		        try {
		        	++executionCount;
					myClass.userTab();
					//RequestDispatcher dispatcher = request.getRequestDispatcher("test2.jsp");
					++passcount;
					statusTC02="Pass";
				//	request.setAttribute("status2", "Pass"); // set your String value in the attribute
					//request.setAttribute("status2", "20%");
					RequestDispatcher dispatcher1 = request.getRequestDispatcher("test2.jsp");
					currentProgress+=10;
					
					request.getSession().setAttribute("currentProgress", currentProgress);
					
					System.out.println("currentProgress2"+ currentProgress);
					request.setAttribute("mypercentage", Integer.toString(currentProgress)+"%");
					System.out.println("mypercentage2="+request.getAttribute("mypercentage"));
					dispatcher1.forward( request, response );
					
			         
			        // build Result HTML code
			        
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	          if (request.getParameter("TC03")!=null)
		        try {
		        	++executionCount;
					myClass.search_UserName();
					++passcount;
					statusTC03="Pass";
					//request.setAttribute("value12", "30%");
					currentProgress+=10;
				
					request.setAttribute("mypercentage", Integer.toString(currentProgress)+"%");
					System.out.println("currentProgress3"+ currentProgress);
					System.out.println("mypercentage2="+request.getAttribute("mypercentage"));
					
					//System.out.println("value12="+request.getAttribute("value12"));
					
					//RequestDispatcher dispatcher = request.getRequestDispatcher("test2.jsp");
				//	request.setAttribute("status3", "Pass");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	       if (request.getParameter("TC04")!=null)
		        try {
		        	++executionCount;
					myClass.search_UserID();
					++passcount;
					statusTC04="Pass";
					//request.setAttribute("value12", "40%");
					
				//	System.out.println("value12="+request.getAttribute("value12"));
					
					//request.setAttribute("status4", "Pass");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	       if (request.getParameter("TC05")!=null)
		        try {
		        	++executionCount;
					myClass.search_SupervisorName();
					++passcount;
					statusTC05="Pass";
					//request.setAttribute("status5", "Pass");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	       if (request.getParameter("TC06")!=null)
		        try {
		        	++executionCount;
					myClass.search_SupervisorID();
					++passcount;
					statusTC06="Pass";
					//request.setAttribute("status6", "Pass");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	       if (request.getParameter("TC07")!=null)
		        try {
		        	++executionCount;
					myClass.search_SiteName();
					++passcount;
					statusTC07="Pass";
					//request.setAttribute("status7", "Pass");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	      //dispatcher.forward( request, response );
	       int failcount=executionCount-passcount;
	       float passpercentage=passcount/executionCount*100;
	       
	       System.out.println("executionCount="+executionCount+"count="+ passcount );
	
	     
	     PrintWriter writer = response.getWriter();
	         
	        // build Result HTML code
	        String htmlRespone = "<html>";
	         htmlRespone +="<head> <style>#t01 {     font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;     border-collapse: collapse;     width: 100%; }  #t01 td, #t01 th {     border: 1px solid #ddd;     padding: 8px; }  #t01 tr:nth-child(even){background-color: #f2f2f2;}  #t01 tr:hover {background-color: #ddd;}  #t01 th {     padding-top: 12px;     padding-bottom: 12px;     text-align: left;     background-color: #3232ff;     color: white; }   ul { list-style-type: none; margin: 0; padding: 0; overflow: hidden; background-color: #333333; }  li { float: left; }  li a { display: block; color: white; text-align: center; padding: 16px; text-decoration: none; }  li a:hover { background-color: #111111; } </style> <meta charset=\"ISO-8859-1\"> <title>Insert title here</title> </head><table id=\"t01\" >  <caption><b>Test Suite</b></caption>   <tr>   <th onclick=\"sortTable(0)\">Sr.No</th>     <th onclick=\"sortTable(2)\">Test Case Name</th>      <th onclick=\"sortTable(1)\">Status</th>   </tr>   <tr>   <th>1</th>     <td>Verify user is able to login</td>   </td>     <td >"+statusTC01+"</td>   </tr>   <tr>   <th>2</th>     <td>Verify user Tab is displayed </td>         <td >"+statusTC02+"</td>   </tr>   <tr>   <th>3</th>     <td>Verify user is able to search by user firstName and LastName  </td>        <td >"+statusTC03+"</td>   </tr>   <tr>   <th>4</th>     <td>Verify user is able to search by UserID  </td>       <td >"+statusTC04+"</td>   </tr>   <tr>   <th>5</th>     <td>Verify user is able to search by Supervisor FirstName and LastName   </td>     <td >"+statusTC05+"</td>   </tr>   <tr>   <th>6</th>     <td>Verify user is able to search by SupervisorID  </td>      <td >"+statusTC06+"</td>   </tr>    <tr>    <th>7</th>     <td>Verify user is able to search by Site Name  </td>    <td >"+statusTC07+"</td>   </tr> </table> <body> <table id=\"t01\"> <caption><b>Test Result</b></caption> <tr> <th>Number TestCases </th> <th>Pass</th> <th>Fail</th> <th>% Pass</th> </tr> <tr> <td>"+executionCount+"</td> <td>"+passcount+"</td> <td>"+failcount+"</td> <td>"+passpercentage+"</td> </tr> </table> <button >Export</button> <div id=\"piechart\"></div> <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>  <script type=\"text/javascript\"> google.charts.load('current', {'packages':['corechart']}); google.charts.setOnLoadCallback(drawChart);   function drawChart() { var data = google.visualization.arrayToDataTable([ ['Task', 'Hours per Day'], ['Pass', "+passcount+"], ['Fail', "+failcount+"],  ]);  var options = {'title':'Execution PieChart', 'width':550, 'height':400};   var chart = new google.visualization.PieChart(document.getElementById('piechart')); chart.draw(data, options); } </script> <script> function sortTable(n) {   var table, rows, switching, i, x, y, shouldSwitch, dir, switchcount = 0;   table = document.getElementById(\"t01\");   switching = true;    dir = \"asc\";     while (switching) {      switching = false;     rows = table.getElementsByTagName(\"TR\");      for (i = 1; i < (rows.length - 1); i++) {           shouldSwitch = false;             x = rows[i].getElementsByTagName(\"TD\")[n];       y = rows[i + 1].getElementsByTagName(\"TD\")[n];          if (dir == \"asc\") {         if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {                    shouldSwitch= true;           break;         }       } else if (dir == \"desc\") {         if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) {                   shouldSwitch= true;           break;         }       }     }     if (shouldSwitch) {            rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);       switching = true;            switchcount ++;          } else {             if (switchcount == 0 && dir == \"asc\") {         dir = \"desc\";         switching = true;       }     }   } }";
	        htmlRespone +="</script></body>"; 
	        htmlRespone += "</html>";
	         
	        // return response
	        writer.println(htmlRespone);
}}

