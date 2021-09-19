<%@ page language="java" import="java.sql.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Integer cusid = (Integer) session.getAttribute("cusid");
Integer withdraw=Integer.parseInt(request.getParameter("withdraw"));
boolean result=false;
try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url=application.getInitParameter("url");
    String username=application.getInitParameter("username");
    String password=application.getInitParameter("password");
    Connection con=DriverManager.getConnection(url,username,password);
    
    String query="select * from account where customerid=?";
    PreparedStatement ps=con.prepareStatement(query);
    ps.setInt(1, cusid);
    ResultSet rs=ps.executeQuery();
    
    String query1="update account set accountbalance=? where customerid=?";
	PreparedStatement ps1=con.prepareStatement(query1);
	if(rs.next())
	{
	ps1.setInt(1, rs.getInt(4)-withdraw);
	ps1.setInt(2,cusid);
    }
	result=ps1.executeUpdate()>0;
	if(result)
	{
		out.println("balance updated ");
		%>
		<br/>
		<a href="balance.jsp">balance</a>
		
		<%
	}
	else
	{
		out.println("please enter atleast 1000rs");
	}
	
} 
catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
%>
</body>
</html>