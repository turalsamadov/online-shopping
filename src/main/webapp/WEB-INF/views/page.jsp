<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 09.05.2018
  Time: 02:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>

<spring:url var="css" value="/resources/css"/>
<spring:url var="js" value="/resources/js"/>
<spring:url var="images" value="/resources/images"/>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Online Shopping - ${title}</title>

    <script>
        window.menu = '${title}';
    </script>

    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">

    <!-- Bootstrap theme CSS -->
    <link href="${css}/bootstrap.cerulean.theme.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>
    <!-- Navigation -->
    <%@include file="shared/navbar.jsp" %>

    <!-- Page Content -->
    <!-- Home content -->
    <c:if test="${userClickHome == true}">
        <%@include file="home.jsp" %>
    </c:if>

    <!-- About content -->
    <c:if test="${userClickAbout == true}">
        <%@include file="about.jsp" %>
    </c:if>

    <!-- Contact content -->
    <c:if test="${userClickContact == true}">
        <%@include file="contact.jsp" %>
    </c:if>

    <!-- Products content -->
    <c:if test="${userClickAllProducts == true or userClickCategoryProducts == true}">
        <%@include file="listProducts.jsp" %>
    </c:if>

    <!-- Footer -->
    <%@include file="shared/footer.jsp" %>

    <!-- JQuery -->
    <script src="${js}/jquery.js"></script>

    <!-- Bootstrap -->
    <script src="${js}/bootstrap.bundle.min.js"></script>

    <!-- Custom js -->
    <script src="${js}/myapp.js"></script>
</body>

</html>

