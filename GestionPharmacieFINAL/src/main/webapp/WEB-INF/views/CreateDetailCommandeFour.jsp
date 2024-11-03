<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ajouter detail a commande fournisseur</title>
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
<h2>Ajouter detail a commande fournisseur</h2>
<form action="/newDetailCommandeFour" method="POST" >

    <label for="id">id de la commande :</label>
    <input type="text" id="id" name="id"><br>

    <label for="Quantité">Quantité :</label>
    <input type="number" id="Quantité" name="Quantité"><br>




    <input type="submit" value="Ajouter">
</form>

<footer>
</footer>
</body>
</html>
