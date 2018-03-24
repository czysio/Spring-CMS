<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<jsp:include page="/views/header.jsp" />
	<div class="container">
		<h1>Articles list:</h1>
		<table class="table">
			<thead class="thead-light">
				<tr>
					<th>Title</th>
					<th>Author</th>
					<th>Categories</th>
					<th>Created</th>
					<th>Updated</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody class="table table-hover">
				<c:forEach items="${articles}" var="article">
					<tr>
						<td>${article.title}</td>
						<td>${article.author}</td>
						<td>${article.categories}</td>
						<td>${article.created}</td>
						<td>${article.updated}</td>
						<td>
								<a class="btn btn-warning" href="<c:url value='/article/update/${article.id}'/>">Modify</a>
								<a class="btn btn-danger" href="<c:url value='/article/delete/${article.id}'/>">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>