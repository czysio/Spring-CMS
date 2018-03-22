<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<jsp:include page="/views/header.jsp" />
	<h1>Authors list:</h1>
	<Table border="1px solid black">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${authors}" var="author">
			<tr>
				<td>${author.firstName}</td>
				<td>${author.lastName}</td>
				<td>
					<button>
						<a href="http://localhost:8080/SpringCMS/author/update/${author.id}">Modify</a>
					</button>
					<button>
						<a href="http://localhost:8080/SpringCMS/author/delete/${author.id}">Delete</a>
					</button>
					<button>
						<a href="http://localhost:8080/SpringCMS/author/allarticles/${author.id}">Show this author articles</a>
					</button>
				</td>
			</tr>
		</c:forEach>
	</Table>
</body>
</html>