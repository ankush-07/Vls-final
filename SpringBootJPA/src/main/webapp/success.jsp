<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<center><h1>All Information</h1></center>
<script type="text/javascript">
function addUser(){
	document.fn.action="registeration";
	document.fn.submit();
}

function deleteUser(){
	document.fn.action="delete";
	document.fn.submit();
}

function editUser(){
	document.fn.action="edit";
	document.fn.submit();
}

</script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="fn">
<table border="1" align="center">
<th>Sr No.</th>
<th>sid</th>
<th>Name</th>
<th>Address</th>
<th>Mobile No.</th>

<tr>
   <c:forEach items="${data}" var="user">
   
   <br>
   <td><input type="radio" name="sid" value="${user.sid}"></td>
   <td>${user.sid}</td>
   <td>${user.name}</td>
   <td>${user.addr}</td>
   <td>${user.mobino}</td>
   
   
   </tr>
   </c:forEach>

</table>

<table border="2" align="center">
<tr>
<td><input type="button" value="EDIT" onclick="editUser()"></td>
<td><input type="button" value="ADD" onclick="addUser()"></td>
<td><input type="button" value="DELETE" onclick="deleteUser()"></td>
</table>

</form>
</body>
</html>