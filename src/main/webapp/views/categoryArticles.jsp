<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<jsp:include page="/views/header.jsp" />
	<h1>Articles in ${category} category:</h1>
	<table border="1px solid black">
		<tr>
			<th>Article Title</th>
			<th>Author</th>
			<th>Content</th>
			<th>Created</th>
			<th>Updated</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${articlesincategory}" var="article">
			<tr>
				<td>${article.title}</td>
				<td>${article.author}</td>
				<td>${article.content}</td>
				<td>${article.created}</td>
				<td>${article.updated}</td>
				<td>
					<button>
						<a href="http://localhost:8080/SpringCMS/article/update/${article.id}">Modify</a>
					</button>
					<button>
						<a href="http://localhost:8080/SpringCMS/article/delete/${article.id}">Delete</a>
					</button>
				</td>
			</tr>				
		</c:forEach>
	</table>
</body>
</html>