<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title> NOS PHARMACIES</title>
</head>
<body>
<header>
    <h1>NOS PHARMACIES</h1>
</header>
<main>
    <table class="table tabble-stripped">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">NOM</th>
            <th scope="col">EMAIL</th>
            <th scope="col">TELEPHONE</th>
            <th scope="col">VILLE</th>
            <th scope="col">ZONE</th>
            <th scope="col">EN GARDE?</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${pharmacieVue}" var="pharma">
            <tr>
                <td>${pharma.id}</td>
                <td>${pharma.nomPh}</td>
                <td>${pharma.mailPh}</td>
                <td>${pharma.telPh}</td>
                <td>${pharma.ville}</td>
                <td>${pharma.zone}</td>
                <td>${pharma.garde}</td>
            </tr>
        </c:forEach>
        </tbody>

    </table>

</main>
<footer>
    <a href="ajoutPharmacie">New Pharmacie</a>
</footer>
</body>
</html>


