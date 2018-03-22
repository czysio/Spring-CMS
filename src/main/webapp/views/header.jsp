<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<div class="container" >
	<a href="<c:url value='/article/all'/>" class="btn btn-primary" >Show All Articles</a>
	<a href="<c:url value='/article/create'/>" class="btn btn-primary">Add new Article</a>
	<a href="<c:url value='/author/all'/>" class="btn btn-primary" >Show All Authors</a>
	<a href="<c:url value='/author/create'/>" class="btn btn-primary" >Add new Author</a>
	<a href="<c:url value='/category/all'/>" class="btn btn-primary" >Show All Categories</a>
	<a href="<c:url value='/category/create'/>" class="btn btn-primary" >Add new Category</a>
</div>