<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Modifier Employe</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-image: url('https://wallpapercave.com/wp/wp7728120.jpg');
            background-size: cover;
            background-repeat: no-repeat;
            background-position: center;
        }

        header {
            background-color: rgba(0, 0, 0, 0.8);
            color: white;
            text-align: center;
            padding: 20px 0;
        }

        h1 {
            margin: 0;
            font-size: 36px;
        }

        main {
            padding: 20px;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 80vh;
        }

        form {
            background-color: rgba(255, 255, 255, 0.8);
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            width: 400px;
        }

        label {
            display: block;
            margin-bottom: 10px;
            font-weight: bold;
        }

        input[type="text"],
        input[type="email"],
        input[type="tel"] {
            width: calc(100% - 22px);
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 16px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 12px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }

        footer {
            background-color: rgba(0, 0, 0, 0.8);
            color: white;
            text-align: center;
            padding: 20px 0;
            position: fixed;
            bottom: 0;
            width: 100%;
        }

        footer a {
            color: white;
            text-decoration: none;
            font-weight: bold;
        }
    </style>
</head>
<body>
<header>
    <h1>Modifier Employe</h1>
</header>
<main>
    <form action="/updateEmploye" method="post">
        <div>
            <label hidden="hidden" for="id">ID :</label>
            <input hidden="hidden" type="text" id="id" name="id" value="${employeView.id}">
        </div>
        <div>
            <label for="nom">Nom :</label>
            <input type="text" id="nom" name="nom" value="${employeView.nom}">
        </div>
        <div>
            <label for="prenom">Prenom :</label>
            <input type="text" id="prenom" name="prenom" value="${employeView.prenom}">
        </div>
        <div>
            <label for="mail">Email :</label>
            <input type="email" id="mail" name="mail" value="${employeView.mail}">
        </div>
        <div>
            <label for="tel">Telephone :</label>
            <input type="tel" id="tel" name="tel" value="${employeView.tel}" pattern="[0-9]{10}" placeholder="Format: 0123456789" maxlength="10">
        </div>
        <div>
            <label for="cin">CIN :</label>
            <input type="text" id="cin" name="cin" value="${employeView.cin}">
        </div>
        <div>
            <input type="submit" value="Update">
        </div>
    </form>
</main>
<footer>
    <a href="listeemployes">Nos Employes</a>
</footer>
</body>
</html>
