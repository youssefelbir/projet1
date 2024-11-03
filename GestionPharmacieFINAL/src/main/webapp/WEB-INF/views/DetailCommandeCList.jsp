<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DetailCommandeC List</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f8f9fa;
            padding-top: 50px; /* Ajout d'un espace en haut pour l'en-tête fixe */
        }
        .container {
            margin-bottom: 50px; /* Ajout d'un espace en bas pour le pied de page fixe */
        }
        .footer {
            position: fixed;
            bottom: 0;
            width: 100%;
            background-color: #f8f9fa;
            text-align: center;
            padding: 10px 0;
        }
        .btn-delete {
            padding: 5px 10px;
            margin-right: 5px;
        }
        .center-content {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100%;
        }
    </style>
</head>
<body>
<header class="container">
    <h1 class="text-center">DetailCommandeC List</h1>
</header>
<main class="container">
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">QUANTITE</th>
            <th scope="col">COMMANDEC</th>
            <th scope="col">MEDICAMENT</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${detailCommandeCVue}" var="detailCommandeC">
            <tr>
                <td>${detailCommandeC.id}</td>

                <td>${detailCommandeC.quantite}</td>
                <td>${detailCommandeC.commandeC.id}</td>
                <td>${detailCommandeC.medicaments.id}</td>
                <a class="btn btn-danger btn-sm btn-delete"
                   onclick="return confirm('Are you sure to delete this DetailCommandeC ?')"
                   href="deleteDetailCommandeC?id=${detailCommandeC.id}">
                    Delete
                </a>
                <td>
                    <a class="btn btn-primary btn-sm btn-edit" href="EditDetailCommandeC?id=${detailCommandeC.id}">
                        Edit
                    </a>
                </td>
            </tr>

        </c:forEach>
        </tbody>
    </table>
    <div class="center-content mt-3"> <!-- Centrer le bouton -->
        <a href="CreateDetailCommandeC" class="btn btn-success">Create DetailCommandeC</a>
    </div>
</main>
<footer class="footer">
    <div class="container">
        <!-- Pas de bouton dans le pied de page -->
    </div>
</footer>
</body>
</html>
