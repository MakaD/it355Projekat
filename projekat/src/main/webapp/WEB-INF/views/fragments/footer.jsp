<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<link rel="stylesheet" href="<spring:url value="/resources/css/home.css"/>" type="text/css"/>

<footer>
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <ul class="list-inline">
                        <li>
                            <a href="<spring:url value="/"/>">Home</a>
                        </li>
                        <li class="footer-menu-divider">&sdot;</li>
                        <li>
                            <a href="<spring:url value="/about"/>">About</a>
                        </li>
                    </ul>
                    <p class="copyright text-muted small">Copyright &copy; Marina Damnjanovic 2017. All Rights Reserved</p>
                </div>
            </div>
        </div>
    </footer>

</body>
</html>