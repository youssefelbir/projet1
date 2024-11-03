<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Creation MediBase</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background-image: url('https://w0.peakpx.com/wallpaper/942/533/HD-wallpaper-technology-physics-and-chemistry-chemistry.jpg');
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
            font-size: 24px;
        }

        main {
            padding: 20px;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        form {
            background-color: white;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.3);
            width: 80%;
            max-width: 600px;
        }

        label {
            display: block;
            margin-bottom: 10px;
            font-weight: bold;
        }

        input[type="text"],
        textarea {
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
    <h1>Nouvelle Molecule (MediBase)</h1>
</header>
<main>
    <form action="newMediBase" method="post">
        <div>
            <label for="nom">Nom de la molecule :</label>
            <input type="text" id="nom" name="nom">
        </div>
        <div>
            <label for="description">Description :</label>
            <textarea id="description" name="description" rows="4"></textarea>
        </div>
        <div>
            <label for="recommandation">Recommandation :</label>
            <textarea id="recommandation" name="recommandation" rows="4"></textarea>
        </div>
        <div>
            <label for="alerte">Alerte :</label>
            <textarea id="alerte" name="alerte" rows="4"></textarea>
        </div>
        <div>
            <input type="submit" value="Save">
        </div>
    </form>
</main>
<footer>
    <a href="listemedibase">Molecules</a>
</footer>
</body>
</html>
