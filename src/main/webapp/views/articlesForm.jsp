<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
	<h1>Add new article:</h1>
	<form:errors path="*" />
	<form:form modelAttribute="article" method="POST">
		<br />
		<form:errors path="*"/>
		<br />
		<label>Title: <form:input path="title"
				placeholder="Article title" /></label>
		<br />
		<form:errors path="title" /><br/>
		<label>Author: <form:select path="author">
				<form:option value="0" label="--Select Author--"/>
    			<form:options items="${authors}" itemValue="id" />
			</form:select></label>
		<br />
		<label>Categories: <form:select path="categories"
				items="${categories}" multiple="true" itemLabel="name" itemValue="id">
			</form:select></label>
		<br />
		<form:errors path="categories" /><br/>
		<label>Content: <form:textarea path="content"
				placeholder="content" /></label>
		<br />
		<form:errors path="content" /><br/>
		<input type="submit" value="accept" />
	</form:form>
</body>
</html>