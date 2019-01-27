
  <%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
	<form action="http://localhost:8080/Site/controleur" method="POST"></form>
		<table>
			<tr>
				<td> Mot clé: </td>
				<td><input type="text" name="motCle"></td>
				<td><input type="submit" value="Chercher"></td>
			</tr>
		</table>
	</div>
	 
	<div>
	<table>
			<tr>
				<th> REF</th> <th>DES</th> <th>PRIX</th> <th>QUANTITE</th>
			</tr>
			<c:forEach items="${model.produits}" var="p"></c:forEach>
				<tr>
					<td>${p.reference}</td>
					<td>${p.designation}</td>
					<td>${p.prix}</td>
					<td>${p.quantite}</td>
				</tr>
		</table>
	</div>
</body>
</html>