<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
		<form:form modelAttribute="article" method="POST"
			class="form-horizontal">
			<fieldset>

				<legend>Add new article:</legend>

				<div class="form-group">
					<label class="col-md-4 control-label" for="title">Title: </label>
					<div class="col-md-4">
						<form:input path="title" placeholder="Article title" id="title" />
					</div>
					<div class="col-md-4">
						<form:errors path="title" />
					</div>
				</div>

				<div class="form-group">
					<label class="col-md-4 control-label" for="author">Author: </label>
					<div class="col-md-4">
						<form:select path="author" id="author">
							<c:forEach items="${authors}" var="authors">
									<form:option value="${authors.id}" label="${authors.lastName}, ${authors.firstName}" />
							</c:forEach>
						</form:select>
					</div>
				</div>

				<div class="form-group">
					<label class="col-md-4 control-label" for="categories">Categories: </label>
					<div class="col-md-4">
						<form:select path="categories" items="${categories}"
							multiple="true" itemLabel="name" itemValue="id" id="categories">
						</form:select>
					</div>
					<div class="col-md-4">
						<form:errors path="categories" />
					</div>
				</div>

				<div class="form-group">
					<label class="col-md-4 control-label" for="content">Content: </label>
					<div class="col-md-4">
						<form:textarea path="content" placeholder="content" id="content" />
					</div>
					<div class="col-md-4">
						<form:errors path="content" />
					</div>
				</div>
				
					<input class="btn btn-secondary" type="submit" value="accept" />

			</fieldset>
		</form:form>
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