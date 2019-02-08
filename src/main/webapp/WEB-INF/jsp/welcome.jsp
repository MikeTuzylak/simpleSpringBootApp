<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!-- https://www.baeldung.com/jstl -->

<body>
	<c:set value="Demo Page Title" var="pageTitle" />

	<c:out value="${pageTitle}" />

	<hr>

	<table>
		<tr>
			<td>User Name: Mike</td>
		</tr>
	</table>

	<hr>

	<table>
		<c:forEach var="town" items="${towns}">
			<tr>
				<%-- <td>Town Key: ${town.key} - Value: ${town.value}</td> --%>
				<td>Town: ${town.value}</td>
			</tr>
		</c:forEach>
	</table>

	<hr>

	<c:forTokens items="Patrick:Wilson:Ibrahima:Chris" delims=":" var="name">
		<c:out value="Name: ${name}" />
		<p>
	</c:forTokens>
	
	<hr>
	
	<c:set var="now" value="<%= new java.util.Date()%>"/>
	<fmt:formatDate type="time" value="${now}"/>
	
	<hr>
	
	<c:url value = "/core_tags" var = "myURL">
    	<c:param name = "parameter_1" value = "1234"/>
    	<c:param name = "parameter_2" value = "abcd"/>
	</c:url>
	
	<hr>

	<a href=${myURL}>URL</a>
	
	
	
	
	
	

</body>

</html>
