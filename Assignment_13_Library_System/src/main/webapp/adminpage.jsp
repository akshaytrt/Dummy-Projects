<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.sears.corps.model.Book"%>
<%@page import="com.sears.corps.services.impl.BookImpl"%>
<%@page import="com.sears.corps.services.BookService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
</head>
<body>
	<%
		if (request.getSession(false) == null)
			response.sendError(404);

		String user = (String) request.getSession(false).getAttribute("name");
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
		<div style="clear: both;"></div>
		<div style="display: inline-block; float: left; padding: 10px">
			<form style="display: inline-block; float: left; padding: 10px"
				action="AddBook" method="post">
				<!-- Trigger the modal with a button -->
				<button type="button" class="btn btn-info btn-lg"
					data-toggle="modal" data-target="#addModal">Add Book</button>

				<!-- Modal -->
				<div class="modal fade" id="addModal" role="dialog">
					<div class="modal-dialog">

						<!-- Modal content-->
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">&times;</button>
								<h4 class="modal-title">Book Details</h4>
							</div>
							<div class="modal-body" style="margin: 10px">
								<input style="margin: 10px" type="text" class="form-control"
									name="bookname" placeholder="BOOK NAME"> <input
									style="margin: 10px" type="text" class="form-control"
									name="author" placeholder="AUTHOR"> <input
									style="margin: 10px" type="text" class="form-control"
									name="copies" placeholder="COPIES">
							</div>
							<div class="modal-footer">
								<button type="submit" class="btn btn-default">ADD</button>
							</div>
						</div>
					</div>
				</div>
			</form>

			<form style="display: inline-block; float: left; padding: 10px"
				action="AssignBook" method="post">
				<!-- Trigger the modal with a button -->
				<button type="button" class="btn btn-info btn-lg"
					data-toggle="modal" data-target="#assignModal">Assign a
					Book</button>

				<!-- Modal -->
				<div class="modal fade" id="assignModal" role="dialog">
					<div class="modal-dialog">

						<!-- Modal content-->
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">&times;</button>
								<h4 class="modal-title">Book assigning</h4>
							</div>
							<div class="modal-body" style="margin: 10px">
								<input style="margin: 10px" type="text" class="form-control"
									name="bookId" placeholder="BOOK ID"> <input
									style="margin: 10px" type="text" class="form-control"
									name="studentId" placeholder="STUDENT ID">
							</div>
							<div class="modal-footer">
								<button type="submit" class="btn btn-default">ADD</button>
							</div>
						</div>
					</div>
				</div>
			</form>
			<form style="display: inline-block; float: left; padding: 10px"
				action="AssignBook" method="post">
				<!-- Trigger the modal with a button -->
				<button id="assignedBooks" type="button" class="btn btn-info btn-lg"><a style="color:white" href="BorrowedBooks.jsp"> Assigned
					Books</a></button>
			</form>
			<form style="display: inline-block; float: left; padding: 10px"
				action="UpdateBook" method="post">
				<!-- Trigger the modal with a button -->
				<button type="button" class="btn btn-info btn-lg"
					data-toggle="modal" data-target="#updateModal">Update Book</button>

				<!-- Modal -->
				<div class="modal fade" id="updateModal" role="dialog">
					<div class="modal-dialog">

						<!-- Modal content-->
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal">&times;</button>
								<h4 class="modal-title">Book Details</h4>
							</div>
							<div class="modal-body" style="margin: 10px">
							<input style="margin: 10px" type="text" class="form-control"
									name="id" placeholder="BOOK ID">
								 <input
									style="margin: 10px" type="text" class="form-control"
									name="copies" placeholder="COPIES">
							</div>
							<div class="modal-footer">
								<button type="submit" class="btn btn-default">ADD</button>
							</div>
						</div>
					</div>
				</div>
			</form>
			
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