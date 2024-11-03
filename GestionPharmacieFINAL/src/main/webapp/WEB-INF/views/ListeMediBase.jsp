<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title> Liste Des Molecules</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background-image: url('https://w0.peakpx.com/wallpaper/942/533/HD-wallpaper-technology-physics-and-chemistry-chemistry.jpg');
            background-size: cover;
            background-repeat: no-repeat;
            background-position: center;
            color: white; /* Couleur du texte */
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
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        th, td {
            padding: 10px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #333;
        }

        tr:hover {
            background-color: rgba(255, 255, 255, 0.1);
        }

        td {
            background-color: rgba(0, 0, 0, 0.5); /* Arrière-plan noir pour les cellules */
        }

        button {
            background-color: black;
            border: none;
            padding: 8px 16px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 14px;
            margin: 4px 2px;
            cursor: pointer;
            border-radius: 5px;
        }

        button:hover {
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
    <h1>Liste Des Molecules</h1>
</header>
<main>
    <table class="table tabble-stripped">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Nom</th>
            <th scope="col">Description</th>
            <th scope="col">Recommandation</th>
            <th scope="col">Précaution</th>
            <th scope="col">Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${medibaseVue}" var="medibase">
            <tr>
                <td>${medibase.id}</td>
                <td>${medibase.nom}</td>
                <td>${medibase.description}</td>
                <td>${medibase.recommandation}</td>
                <td>${medibase.alerte}</td>
                <td style="text-align: right;">
                    <button ><a onclick="return confirm('YOU WANT TO DELETE THIS INSTANCE ?')" href="deleteMediBase?id=${medibase.id}">Supprimer</a></button>
                    <button ><a href="editMediBase?id=${medibase.id}">Modifier</a></button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</main>
<footer>
    <a href="ajoutMediBase">Nouvelle molecule</a>
</footer>
</body>
</html>
