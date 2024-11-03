<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>NOS PHARMACIES</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
            background-size: cover;
            background-repeat: no-repeat;
            background-attachment: fixed;
            color: #333; /* Couleur du texte */
        }


        h1 {
            margin: 0;
            font-size: 36px;
        }

        .pharmacy-container {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-around;
            padding: 20px;
        }

        .pharmacy-card {
            flex-basis: calc(33.33% - 20px);
            margin-bottom: 20px;
            text-align: center;
            background-color: rgba(255, 255, 255, 0.7); /* Fond semi-transparent */
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            transition: background-color 0.3s;
        }

        .pharmacy-card:hover {
            background-color: rgba(255, 255, 255, 0.9); /* Fond semi-transparent */
        }

        .pharmacy-image {
            position: relative;
        }

        .pharmacy-image img {
            width: 100%;
            height: auto;
            border-radius: 10px 10px 0 0;
        }

        .pharmacy-name {
            position: absolute;
            bottom: 0;
            left: 0;
            width: 100%;
            background-color: rgba(0, 0, 0, 0.7); /* Fond semi-transparent */
            color: white;
            padding: 10px;
            box-sizing: border-box;
            border-radius: 0 0 10px 10px;
            transition: opacity 0.3s, font-size 0.3s;
            opacity: 1;
        }

        .pharmacy-image:hover .pharmacy-name {
            opacity: 1;
        }

        footer {
            background-color: rgba(0, 0, 0, 0.8); /* Fond semi-transparent */
            color: white;
            text-align: center;
            padding: 20px 0;
        }

        footer a {
            color: white;
            text-decoration: none;
            font-weight: bold;
        }
        nav {
            background-color: rgba(0, 0, 0, 0.8); /* Fond semi-transparent */
            padding: 10px 20px; /* Ajout de padding pour l'espace autour des liens */
            margin-bottom: 20px; /* Ajout d'une marge en bas */
        }

        .navbar {
            list-style-type: none;
            margin: 0;
            padding: 0;
            display: flex; /* Utilisation de flexbox pour aligner les éléments horizontalement */
            align-items: center; /* Alignement vertical au centre */
        }

        .navbar h1 {
            margin: 0; /* Suppression de la marge par défaut */
            color: white; /* Couleur du texte */
            margin-right: 300px;
        }

        .navbar li {
            margin-right: 50px; /* Marge entre les éléments */
        }

        .navbar li:last-child {
            margin-right: 0; /* Aucune marge à droite pour le dernier élément */
        }

        .navbar a {
            color: white;
            text-decoration: none;
            font-weight: bold;
            border-radius: 5px; /* Ajout de coins arrondis */
            transition: background-color 0.3s; /* Transition pour un effet au survol */
        }

        .navbar a:hover {
            background-color: rgba(255, 255, 255, 0.3); /* Fond semi-transparent au survol */
        }

        header {
            background-color: rgba(0, 0, 0, 0.6); /* Fond semi-transparent */
            color: white;
            text-align: center;
            padding: 20px 0;
            margin-bottom: 20px; /* Ajout d'une marge en bas */
        }


    </style>
    <script>
        // Fonction pour changer l'arrière-plan toutes les 5 secondes
        function changeBackground() {
            var images = [
                'https://www.timeskipper.co/wp-content/uploads/2023/02/Les-grands-enjeux-de-la-pharmacie-de-demain.jpg',
                'https://img.freepik.com/photos-gratuite/vue-dessus-composition-bureau-medical-espace-copie_23-2148502942.jpg',
                'https://doers.ma/wp-content/uploads/2022/11/Ouvrir-une-pharmacie-au-Maroc.jpg',
                'https://static.vecteezy.com/ti/vecteur-libre/p1/3476771-pharmacie-background-medicine-objects-pills-on-wooden-table-top-view-template-for-web-banner-of-pharmacy-sale-or-advertising-vectoriel.jpg',
                'https://img.pikbest.com/wp/202347/capsule-pill-pharmacy-and-healthcare-concept-blue-background-with-pills-in-panoramic-layout-3d-render_9763081.jpg!w700wp'
            ];
            var currentIndex = 0;

            function change() {
                document.body.style.backgroundImage = 'url("' + images[currentIndex] + '")';
                currentIndex = (currentIndex + 1) % images.length;
            }

            // Appeler la fonction de changement d'arrière-plan toutes les 5 secondes
            setInterval(change, 3000);
        }
        window.onload = changeBackground; // Appeler la fonction lorsque la page est chargée
    </script>
</head>
<body>
<nav>
    <ul class="navbar">
        <h1>Gestion Pharmacies</h1>
        <li><a href="listemedicaments">ListeMedicaments</a></li>
        <li><a href="listemedibase">ListeMediBase</a></li>
        <li><a href="listeemployes">ListeEmploye</a></li>
    </ul>
</nav>
<header>
    <h1>NOS PHARMACIES</h1>
</header>
<main class="pharmacy-container">
    <c:forEach items="${pharmacieVue2}" var="pharma">
        <div class="pharmacy-card">
            <div class="pharmacy-image">
                <img src="https://cdn.futura-sciences.com/buildsv6/images/wide1920/e/a/3/ea393f271d_50148115_preparateur-en-pharmacie1.jpg" alt="${pharma.nomPh}">
                <p class="pharmacy-name">PHARMACIE ${pharma.nomPh} (${pharma.ville})</p>
            </div>
            <p><b>${pharma.nomPh}</b></p>
            <p>Email: ${pharma.mailPh}</p>
            <p>Téléphone: ${pharma.telPh}</p>
            <p>Ville: ${pharma.ville}</p>
            <p>Zone: ${pharma.zone}</p>
            <p>En garde? ${pharma.garde ? 'Oui' : 'Non'}</p>
            <button ><a
                    onclick="return confirm(' YOU WANT TO DELETE THIS INSTANCE ?')"
                    href="deletePharmacie?id=${pharma.id}">Supprimer</a></button>
            <button ><a
                    href="editPharmacie?id=${pharma.id}">Modifier</a></button>
            <br>
        </div>
    </c:forEach>
</main>
<footer>
    <a href="ajoutPharmacie">Nouvelle Pharmacie</a>
</footer>
</body>
</html>
