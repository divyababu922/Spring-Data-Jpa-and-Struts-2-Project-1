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
		<s:textfield label="Keyword" name="keyword"></s:textfield>
		<s:submit value="Search" align="left"></s:submit>
	</s:form>
	<table border="1">
		<tr>
			<th>Name</th>
			<th>Members</th>
		</tr>
		<c:forEach var="customer" items="${customers }">
			<tr>
				<td>${customer.name }</td>
				<td>${customer.members }</td>				
			</tr>
		</c:forEach>
	</table>

</body>
</html>