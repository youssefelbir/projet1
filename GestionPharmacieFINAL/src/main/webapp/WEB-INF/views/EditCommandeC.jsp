<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CommandeC Edition</title>
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
    <h1>CommandeC Edition</h1>
</header>
<main>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="form-container">
                    <form action="updateCommandeC" method="post">
                        <div class="mb-3">
                            <label hidden="hidden" for="id">ID:</label>
                            <input hidden="hidden" type="text" id="id" name="idCommande" value="${commandeCView.idCommande}">
                        </div>

                        <div class="mb-3">
                            <label for="adresseLiv">Adresse Livraison:</label>
                            <input type="text" class="form-control" id="adresseLiv" name="adresseLiv" value="${commandeCView.adresseLiv}">
                        </div>
                        <div class="mb-3">
                            <label for="Livreur">Livreur:</label>
                            <input type="number" class="form-control" id="Livreur" name="livreur" value="${commandeCView.livreur.id}">
                        </div>
                        <div class="mb-3">
                            <label for="Client">Client:</label>
                            <input type="number" class="form-control" id="Client" name="client" value="${commandeCView.client.id}">
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
    <a href="CommandeCList" class="btn btn-secondary btn-long">CommandeC List</a>
</footer>
<!-- Bootstrap Bundle JS (popper.js included) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

