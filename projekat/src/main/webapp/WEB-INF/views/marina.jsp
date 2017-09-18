<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Internship for You</title>

<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">

</head> 

<body>

<jsp:include page="../views/fragments/header.jsp"></jsp:include>

<div class="container">

		<!-- Page Header -->
        <div class="row">
            <div class="col-lg-12">
            	<br>
                <h1 class="page-header">Your future 
                    <small>starts here</small>
                </h1>
            </div>
        </div>
        <!-- /.row -->


<div class="row">

<h1>List of ads</h1>
<p>Here you can see the list of the ads, edit them, remove or update.</p>
<table border="1px" cellpadding="0" cellspacing="0" >
<thead>
<tr>
<th width="10%">id</th><th width="15%">title</th><th width="10%">company</th><th width="10%">actions</th>
</tr>
</thead>
<tbody>
<c:forEach var="ad" items="${oglas}">
<tr>
	<td>${ad.id_oglasa}</td>
	<td>${ad.naslov}</td>
	<td>${ad.rok}</td>
	<td>
	<a href="">Edit</a><br/>
	<a href="">Delete</a><br/>
	</td>
</tr>
</c:forEach>
</tbody>
</table>

</div>

<p><a href="${pageContext.request.contextPath}/home.html">Home page</a></p>

</div>

<jsp:include page="../views/fragments/footer.jsp"></jsp:include>

</body>
</html>