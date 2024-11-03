<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Clients List</title>
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
        .btn-edit,
        .btn-delete {
            padding: 5px 10px;
            margin-right: 5px;
        }
        .table-container {
            max-height: calc(100vh - 220px);
            overflow-y: auto;
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
    <h1 class="text-center">Clients List</h1>
</header>
<main class="container">
    <div class="table-container">
        <div class="card">
            <div class="card-body">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">First Name</th>
                        <th scope="col">Last Name</th>
                        <th scope="col">Email</th>
                        <th scope="col">Address</th>
                        <th scope="col">Actions</th> <!-- Changement de "ACTION" à "ACTIONS" pour plus de clarté -->
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${clientsVue}" var="client">
                        <tr>
                            <td>${client.id}</td>
                            <td>${client.firstname}</td>
                            <td>${client.lastname}</td>
                            <td>${client.email}</td>
                            <td>${client.address}</td>
                            <td>
                                <a class="btn btn-danger btn-sm btn-delete"
                                   onclick="return confirm('Are you sure to delete this Client ?')"
                                   href="deleteClient?id=${client.id}">
                                    Delete
                                </a>
                                <a class="btn btn-primary btn-sm btn-edit" href="EditClient?id=${client.id}">
                                    Edit
                                </a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    <div class="center-content mt-3"> <!-- Centrer le bouton -->
        <a href="CreateClient" class="btn btn-success">Create New Client</a>
    </div>
</main>
<footer class="footer">
    <div class="container">
        <!-- Pas de bouton dans le pied de page -->
    </div>
</footer>
<!-- Bootstrap Bundle JS (popper.js included) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>






