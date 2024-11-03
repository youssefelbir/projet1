<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>DetailCommandeC Creation</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        /* Ajout de styles supplémentaires */
        body {
            background-color: #f8f9fa;
        }
        .form-container {
            background-color: #f0f0f0;
            border-radius: 15px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            padding: 40px;
            margin-top: 50px; /* Augmenter la marge supérieure */
        }
        .form-control {
            border-radius: 10px;
        }
        .btn-long {
            padding: 10px 30px;
        }
        .btn-secondary {
            background-color: #6c757d; /* Gris foncé */
            border-color: #6c757d;
        }
        .btn-secondary:hover {
            background-color: #5a6268; /* Gris légèrement plus foncé au survol */
            border-color: #5a6268;
        }
        .btn-primary {
            background-color: #28a745; /* Vert */
            border-color: #28a745;
        }
        .btn-primary:hover {
            background-color: #218838; /* Vert légèrement plus foncé au survol */
            border-color: #218838;
        }
    </style>
</head>
<body>
<header class="text-center mt-3">
    <h1>DetailCommandeC Creation</h1>
</header>
<main>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="form-container">
                    <form action="saveDetailCommandeC" method="post">
                        <div class="mb-3">
                            <label for="Quantite" class="form-label">Quantite:</label>
                            <input type="text" class="form-control" id="Quantite" name="Quantite">
                        </div>
                        <div class="mb-3">
                            <label for="Medicament" class="form-label">Medicament:</label>
                            <select class="form-select" id="Medicament" name="medicaments">
                                <c:forEach items="${medicamentsVue}" var="medicament">
                                    <option value="${medicament.id}">${medicament.label}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="text-center">
                            <button type="submit" class="btn btn-primary btn-long">Save</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</main>
<footer class="text-center mt-3">
    <a href="DetailCommandeCList" class="btn btn-secondary btn-long">DetailCommandeC List</a>
</footer>
<!-- Bootstrap Bundle JS (popper.js included) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
