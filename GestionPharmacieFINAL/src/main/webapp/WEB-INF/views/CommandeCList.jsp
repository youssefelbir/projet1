<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/5.3.3/css/bootstrap.min.css">
    <title>CommandeC List</title>
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
    <h1 class="text-center">CommandeC List</h1>
</header>
<main class="container">
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">DATECOMMANDE</th>
            <th scope="col">ADRESSELIV</th>
            <th scope="col">LIVREUR</th>
            <th scope="col">CLIENT</th>
            <th scope="col">ACTION</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${commandeCVue}" var="commandeC">
            <tr>
                <td>${commandeC.idCommande}</td>
                <td>${commandeC.dateCommande}</td>
                <td>${commandeC.adresseLiv}</td>
                <td>${commandeC.livreur.id}</td>
                <td>${commandeC.client.id}</td>
                <td>
                    <a class="btn btn-danger btn-sm btn-delete"
                       onclick="return confirm('Are you sure to delete this CommandeC ?')"
                       href="deleteCommandeC?id=${commandeC.idCommande}">
                        Delete
                    </a>
                </td>
                <td>
                    <a class="btn btn-primary btn-sm btn-edit" href="EditCommandeC?id=${commandeC.idCommande}">
                        Edit
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div class="center-content mt-3"> <!-- Centrer le bouton -->
        <a href="CreateCommandeC" class="btn btn-success">CommandeC Creation</a>
    </div>
</main>
<footer class="footer">
    <div class="container">
        <!-- Pas de bouton dans le pied de page -->
    </div>
</footer>
</body>
</html>
