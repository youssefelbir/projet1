<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Modifier une pharmacie</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
            margin: 0;
            padding: 20px;
            background-image: url("https://www.timeskipper.co/wp-content/uploads/2023/02/Les-grands-enjeux-de-la-pharmacie-de-demain.jpg");
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
        }

        h2 {
            color: #007bff;
            text-align: center;
        }

        form {
            background-color: rgba(255, 255, 255, 0.9);
            max-width: 500px;
            margin: 0 auto;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }

        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }

        input[type="text"],
        input[type="email"],
        input[type="tel"],
        input[type="checkbox"] {
            width: calc(100% - 12px);
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 4px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        footer {
            margin-top: 20px;
            text-align: center;
        }

        footer a {
            color: #007bff;
            text-decoration: none;
        }

        footer a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<h2>MODIFIER LES INFORMAMATIONS DE LA PHARMACIE</h2>
<form action="/updatePharmacie" method="POST" >
    <label hidden="hidden" for="id" >ID de la pharmacie :</label>
    <input hidden="hidden" type="text" id="id" name="id" value="${pharmacieView.id}"><br>

    <label for="nomPh">Nom de la pharmacie :</label>
    <input type="text" id="nomPh" name="nomPh" value="${pharmacieView.nomPh}"><br>

    <label for="ville">Ville :</label>
    <input type="text" id="ville" name="ville" value="${pharmacieView.ville}"><br>

    <label for="zone">Zone :</label>
    <input type="text" id="zone" name="zone" value="${pharmacieView.zone}"><br>

    <label for="mailPh">Adresse e-mail :</label>
    <input type="email" id="mailPh" name="mailPh" value="${pharmacieView.mailPh}"><br>

    <label for="telPh">Numero de telephone :</label>
    <input type="tel" id="telPh" name="telPh" pattern="[0-9]{10}" placeholder="Format: 0123456789" maxlength="10" value="${pharmacieView.telPh}"><br>

    <label for="garde">En garde ?</label>
    <input type="checkbox" id="garde" name="garde" value="${pharmacieView.garde}"><br>

    <input type="submit" value="Update">
</form>

<footer>
    <a href="/">Pharmacies</a>
</footer>
</body>
</html>
