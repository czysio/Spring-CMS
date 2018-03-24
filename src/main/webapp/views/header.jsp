<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<ul class="nav nav-tabs bg-secondary text-white">
  	<li class="nav-item">
   		<a class="nav-link active bg-secondary text-white" href="<c:url value='/'/>">Home</a>
  	</li>
  	<li class="nav-item dropdown">
    	<a class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Article</a>
    <div class="dropdown-menu">
      	<a class="dropdown-item" href="<c:url value='/article/all'/>" >Show All Articles</a>
		<a class="dropdown-item" href="<c:url value='/article/create'/>" >Add new Article</a>
	</div>
  </li>
  <li class="nav-item dropdown">
    <a class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Author</a>
    <div class="dropdown-menu">
      	<a class="dropdown-item" href="<c:url value='/author/all'/>" >Show All Authors</a>
		<a class="dropdown-item" href="<c:url value='/author/create'/>" >Add new Author</a>
	</div>
  </li>
   <li class="nav-item dropdown">
    <a class="nav-link dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Category</a>
    <div class="dropdown-menu">
      	<a class="dropdown-item" href="<c:url value='/category/all'/>" >Show All Categories</a>
		<a class="dropdown-item" href="<c:url value='/category/create'/>" >Add new Category</a>
	</div>
  </li>
</ul>