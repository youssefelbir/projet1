<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title> Liste Des Medicaments</title>
</head>
<body>
<header>
    <h1>Liste Des Medicaments</h1>
</header>
<main>
<table class="table tabble-stripped">
    <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">LABEL</th>
            <th scope="col">STOCK</th>
            <th scope="col">DOSE</th>
            <th scope="col">PRIX</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach items="${medicamentsVue}" var="medicament">
        <tr>
            <td>${medicament.id}</td>
            <td>${medicament.label}</td>
            <td>${medicament.stock}</td>
            <td>${medicament.dose}</td>
            <td>${medicament.prix}</td>
            <td style="text-align: right;">
                <button ><a onclick="return confirm(' YOU WANT TO DELETE THIS INSTANCE ?')" href="deleteMediBase?id=${medicament.id}">Supprimer</a></button>
                <button ><a href="editMedicament?id=${medicament.id}">Modifier</a></button>
            </td>
        </tr>
    </c:forEach>
    </tbody>

</table>

</main>
<footer>
    <a href="ajoutMedicament">Creation Du Medicament</a>
</footer>
</body>
</html>


