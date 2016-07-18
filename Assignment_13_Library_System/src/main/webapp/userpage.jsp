<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="com.sears.corps.model.Book"%>
<%@page import="com.sears.corps.services.impl.BookImpl"%>
<%@page import="com.sears.corps.services.BookService"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<title>Insert title here</title>
<script>

</script>
</head>
<body>
	<%
		if (request.getSession(false) == null)
			response.sendError(404);

		String user = (String) request.getSession(false).getAttribute("studentUserName");
	%>

	<div class="container">
		<div class="pull-left">
			<h1>
				Welcome :
				<%=user%></h1>
		</div>
		<div class="pull-right">
			<a href="LogoutServlet" style="font-size: 25px; color: black">Logout
			</a>
		</div>
		<div class="row" style="padding-top: 50px;">
			<table id="books" class="table table-striped table-bordered">
				<tr>
					<th>Book Id</th>
					<th>Book Name</th>
					<th>Author</th>
					<th>Copies</th>
				</tr>
				<%
					BookService bookService = new BookImpl();
					List<Book> bookList = new ArrayList<Book>();
					bookList = bookService.getBookDetails();
					for (Book book : bookList) {
				%>
				<tr>
					<td><%=book.getBookId()%></td>
					<td><%=book.getBookName()%></td>
					<td><%=book.getAuthorName()%></td>
					<td><%=book.getCopies()%></td>
				</tr>


				<%
					}
				%>

			</table>
		</div>
	</div>
</body>

</html>