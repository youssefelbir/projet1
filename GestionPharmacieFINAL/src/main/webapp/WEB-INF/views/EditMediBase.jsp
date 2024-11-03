<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Modifier MediBase</title>
</head>
<body>
<header>
    <h1> Modifier Molecule (MediBase)</h1>
</header>
<main>
    <form action="/updateMediBase" method="post">
        <div>
            <label hidden="hidden" for="id">ID de la molecule : </label>
            <input hidden="hidden" type="text" id="id" name="id" value="${medibaseView.id}">
        </div>
        <div>
            <label for="nom">Nom de la molecule : </label>
            <input type="text" id="nom" name="nom" value="${medibaseView.nom}">
        </div>
        <br>
        <div >
            <label for="description" style="align-items: center">Description : </label>
            <textarea  id="description" name="description" style="width: 700px;"  value="${medibaseView.description}">${medibaseView.description}</textarea>
        </div>
        <br>
        <div>
            <label for="recommandation">Recommandation : </label>
            <textarea id="recommandation" name="recommandation" style="width: 700px;" value="${medibaseView.recommandation}">${medibaseView.recommandation}</textarea>
        </div>
        <br>
        <div>
            <label for="alerte">Alerte : </label>
            <textarea id="alerte" name="alerte" style="width: 700px;" value="${medibaseView.alerte}">${medibaseView.alerte}</textarea>
        </div>
        <br>
        <div>
            <input type="submit" value="Update">
        </div>

    </form>
</main>
<footer>
    <a href="listemedibase">Molecules</a>
</footer>
</body>
</html>


