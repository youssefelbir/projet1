<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title> Liste Des factures fournisseures</title>
</head>
<body>
<header>
    <h1>Liste Des factures fournisseures</h1>
</header>
<main>
    <table class="table tabble-stripped">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">TOTAL</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${commandefourVue}" var="commandefour">
            <tr>
                <td>${commandefour.id}</td>
                <td>${commandefour.dateCommande}</td>
                <td style="text-align: right;">
                    <button ><a onclick="return confirm(' YOU WANT TO DELETE THIS INSTANCE ?')" href="deletecommandefour?id=${commandefour.id}">Supprimer</a></button>
                    <button ><a href="editcommandefour?id=${commandefour.id}">Modifier</a></button>
                </td>
            </tr>
        </c:forEach>
        </tbody>

    </table>

</main>
<footer>
    <a href="ajoutFactureFour">Creation Du commande fournisseur</a>
</footer>
</body>
</html>


