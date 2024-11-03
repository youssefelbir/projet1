<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Livreur Edition</title>
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
        .btn-success {
            background-color: #28a745; /* Vert */
            border-color: #28a745;
        }
        .btn-success:hover {
            background-color: #218838; /* Vert légèrement plus foncé au survol */
            border-color: #218838;
        }
    </style>
</head>
<body>
<header class="text-center mt-3">
    <h1>Livreur Edition</h1>
</header>
<main>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="form-container">
                    <form action="updateLivreur" method="post">
                        <div class="mb-3">
                            <label hidden="hidden" for="id">ID:</label>
                            <input type="text" class="form-control" id="id" name="id" value="${livreurView.id}" hidden>
                        </div>
                        <div class="mb-3">
                            <label for="firstname">First Name:</label>
                            <input type="text" class="form-control" id="firstname" name="firstname" value="${livreurView.firstname}">
                        </div>
                        <div class="mb-3">
                            <label for="lastname">Last Name:</label>
                            <input type="text" class="form-control" id="lastname" name="lastname" value="${livreurView.lastname}">
                        </div>
                        <div class="mb-3">
                            <label for="email">Email:</label>
                            <input type="email" class="form-control" id="email" name="email" value="${livreurView.email}">
                        </div>
                        <div class="mb-3">
                            <label for="address">Address:</label>
                            <input type="text" class="form-control" id="address" name="address" value="${livreurView.address}">
                        </div>
                        <div class="mb-3">
                            <label for="telephone">Telephone:</label>
                            <input type="number" class="form-control" id="telephone" name="telephone" value="${livreurView.telephone}">
                        </div>
                        <div class="mb-3">
                            <label for="zone">Zone:</label>
                            <input type="text" class="form-control" id="zone" name="zone" value="${livreurView.zone}">
                        </div>
                        <div class="text-center">
                            <button type="submit" class="btn btn-success btn-long">Update</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</main>
<footer class="text-center mt-3">
    <a href="LivreursList" class="btn btn-secondary btn-long">Livreurs List</a>
</footer>
<!-- Bootstrap Bundle JS (popper.js included) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
