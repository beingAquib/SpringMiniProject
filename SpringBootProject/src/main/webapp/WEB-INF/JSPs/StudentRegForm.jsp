<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Reg</title>
</head>
<body>
<pre>

<form action="save" method=post >

Name  : <input type=text name="name"/>

Email : <input type=text name="email"/>

Gender: 
Male   <input type=radio value="male" name="gender"/>
FeMale <input type=radio value="female" name="gender"/>

Mobile/amt: <input type=text   name="totalAmt"/>

<input type="submit" value="Submit"> 


</form>



Goto All students: <a href="all"> click </a>

</pre>
</body>
</html>