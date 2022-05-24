<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset="ISO-8859-1">
<title>DropDown</title>
</head>

<body>

<h3>Customer List</h3>

<s:form method="get" namespace="/customer" action="search">

<s:select multiple="true" label="Keyword" name="keyword" list="customers"/>
<s:submit value="Search" ></s:submit>

</s:form>

</body>
</html>