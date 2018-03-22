<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<jsp:include page="/views/header.jsp" />
	<h1>Add new category:</h1>
	<form:form modelAttribute="category" method="POST">
		<br />
		<label>Category: <form:input path="name"
				placeholder="category name" /></label>
		<br />
		<form:errors path="name"></form:errors><br/>
		<label>Description: <form:textarea path="description"
				placeholder="description" /></label>
		<br />
		<form:errors path="description"></form:errors><br/>
		<input type="submit" value="accept" />
	</form:form>
</body>
</html>