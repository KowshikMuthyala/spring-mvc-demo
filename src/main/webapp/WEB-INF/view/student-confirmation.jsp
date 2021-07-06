<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>

<head>

<title> Student Confirmation Form</title >

</head>

<body>


Student is Confirmed : ${student.firstName}${student.lastName}

<br><br>

Country is Confirmed : ${student.country}

<br><br>

Favorite Language is: ${student.favouriteLanguage }
<br><br>

	Operating Systems:
<ul>
	<c:forEach var="temp" items= "${student.operatingSystems}" >
	
	<li>${temp}</li>
	
	</c:forEach>
	
</ul>	

</body>
</html>