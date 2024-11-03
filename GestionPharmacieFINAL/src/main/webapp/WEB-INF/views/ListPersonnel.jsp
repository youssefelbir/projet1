<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Nos Personnels</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background-color: #333;
            color: #eee; /* Couleur du texte */
        }

        header {
            background-color: #222;
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

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            border: 1px solid #444;
            padding: 10px;
            text-align: left;
        }

        th {
            background-color: #222;
            color: white;
        }

        td {
            background-color: #444;
        }

        button {
            padding: 8px 12px;
            background-color: #222;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            transition: background-color 0.3s ease;
            text-decoration: none;
            margin-right: 5px;
        }

        button:hover {
            background-color: #111;
        }

        footer {
            background-color: #222;
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
    <h1>Nos Personnel</h1>
</header>
<main>
    <table>
        <thead>
        <tr>
            <th>ID</th>
            <th>NOM</th>
            <th>PRENOM</th>
            <th>EMAIL</th>
            <th>TELEPHONE</th>
            <th>CIN</th>
            <th style="text-align: center;">ACTIONS</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${PersonnelVue}" var="personnel">
            <tr>
                <td>${personnel.id}</td>
                <td>${personnel.nom}</td>
                <td>${personnel.prenom}</td>
                <td>${personnel.mail}</td>
                <td>${personnel.tel}</td>
                <td>${personnel.cin}</td>
                <td style="text-align: center;">
                    <button><a href="editPersonnel?id=${personnel.id}" style="color: white;">Modifier</a></button>
                    <button onclick="return confirm('Vous voulez supprimer ce personne ?')"><a href="deletePersonnel?id=${personnel.id}" style="color: white;">Supprimer</a></button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</main>
<footer>
    <a href="ajoutPersonnel" style="color: white;">Nouveau Personnel</a>
</footer>
</body>
</html>
