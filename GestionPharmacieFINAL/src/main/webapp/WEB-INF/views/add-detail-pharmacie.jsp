<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ajouter un detail de la pharmacie</title>
</head>
<body>
<h1>Ajouter un detail de pharmacie</h1>
<c:if test="${not empty successMessage}">
    <div style="color: green;">${successMessage}</div>
</c:if>
<form action="addDetailPharmacie" method="post">
    <label for="medicamentId">Selectionner le medicament:</label>
    <select id="medicamentId" name="medicamentId">
        <c:forEach items="${medicamentsVue}" var="medicament">
            <option value="${medicament.id}">ID: ${medicament.id} - ${medicament.label}</option>
        </c:forEach>
    </select>
    <select id="pharmaciId" name="pharmaciId">
        <c:forEach items="${pharmacies}" var="phar">
            <option value="${phar.id}">ID: ${phar.id} - ${phar.nomPh}</option>
        </c:forEach>
    </select>
    <label for="quantite">Quantite:</label>
    <input type="text" id="quantite" name="quantite">
    <button type="submit">Ajouter</button>
</form>
</body>
</html>
