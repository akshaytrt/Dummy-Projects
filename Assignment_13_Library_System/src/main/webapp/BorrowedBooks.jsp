<%@page import="com.sears.corps.model.Book"%>
<%@page import="com.sears.corps.model.BookMaintenance"%>
<%@page import="com.sears.corps.services.impl.BookMaintenanceImpl"%>
<%@page import="com.sears.corps.services.BookMaintenanceService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.table {
  width: 88%;
  max-width: 100%;
  margin-bottom: 20px;
  margin: auto;
}</style>
</head>
<body>
<div style="font-size:50px;"><center>Assigned Books</center>
</div>
		<div class="row">
			<table id="books" class="table table-striped table-bordered">
				<tr>
					<th>Book Id</th>
					<th>Book Name</th>
					<th>Author</th>
					<th>Student Id</th>
					<th>Student Name</th>
					<th>Mobile</th>
					<th>Address</th>
					<th>Issued on</th>
					<th>Return date</th>
				</tr>
				<%
					BookMaintenanceService bookMaintenanceService=new BookMaintenanceImpl();
					List<BookMaintenance> bookList = new ArrayList<BookMaintenance>();
					bookList = bookMaintenanceService.getAssignedBooks();
					for(BookMaintenance book:bookList) {
				%>
				<tr>
					<td><%=book.getBook().getBookId()%></td>
					<td><%=book.getBook().getBookName()%></td>
					<td><%=book.getBook().getAuthorName()%></td>
					<td><%=book.getStudent().getStudentUsername()%></td>
					<td><%=book.getStudent().getName()%></td>
					<td><%=book.getStudent().getMobile()%></td>
					<td><%=book.getStudent().getAddress()%></td>
					<td><%=book.getIssueDate()%></td>
					<td><%=book.getReturnDate()%></td>
				</tr>


				<%
					}
				%>

			</table>
		</div>

</body>
</html>