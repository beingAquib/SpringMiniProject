<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Employee</title>
</head>
<body>

Edit the below employee: ---



<form:form action="goedit" method="post" modelAttribute="stu">

<pre>
Roll  : <form:input path="rollNumber" readonly="true"/>
NAME: <form:input path="name"/>
Email: <form:input path="email"/>

Gender: 
Male   <form:radiobutton value="male" path="gender"/>
FeMale <form:radiobutton value="female" path="gender"/>

Amount : <form:input path="totalAmt"/>
 

<input type =submit value=Edit />
</pre>
</form:form>

</body>
</html>