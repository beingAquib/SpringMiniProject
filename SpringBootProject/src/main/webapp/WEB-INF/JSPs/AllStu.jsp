<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All students</title>
</head>
<body>

Here are all the students

<table border="3">

<tr>

<td>RollNum  </td>
<td>Name </td>
<td>Email </td>
<td>Gender: </td>
<td>Total: </td>
<td>Operations</td>




</tr>

 <c:forEach var="m" items="${Studs}" >
 <tr>
<td>${m.rollNumber}   </td>
<td>${m.name} </td>
<td>${m.email}</td>
<td>${m.gender}</td>
<td>${m.totalAmt}</td>
<td><a href="delete?id=${m.rollNumber}"> Delete </a> | <a href="edit?id=${m.getRollNumber()}"> Edit </td>

 </tr>
 </c:forEach>

</table>
 
<hr/>

<!--** If current page is not a first page then show First page Link  -->

<c:if test="${!page.isFirst()}">
	<a href="?page=0">FIRST</a> &nbsp;&nbsp;
</c:if>

<!--** If current page has previous page then show Link : current page number -1 -->

<c:if test="${page.hasPrevious()}">
	<a href="?page=${page.getNumber()-1}">PREVIOUS</a> &nbsp;&nbsp;
</c:if>

<!--** Display page numbers from zero to 'total pages - 1'  -->

<c:forEach var="i" begin="0" end="${page.getTotalPages()-1}">
<a href="?page=${i}">${i+1}</a> &nbsp;&nbsp;
</c:forEach>


<!--** If current page has next page then show Link : current page number + 1 -->

<c:if test="${page.hasNext()}">
	<a href="?page=${page.getNumber()+1}">NEXT</a> &nbsp;&nbsp;
</c:if>

<!-- ** If current page is not a last page then show LAST page Link  -->

<c:if test="${!page.isLast()}">
	<a href="?page=${page.getTotalPages()-1}">LAST</a> &nbsp;&nbsp;
</c:if>

<hr/>

 <hr>
 
 to register :-
 
 <a href="/">Register</a>


</body>
</html>