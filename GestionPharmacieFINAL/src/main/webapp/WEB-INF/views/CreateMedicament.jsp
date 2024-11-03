<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Creation Medicament</title>
</head>
<body>
<header>
    <h1> Nouveaux Arrivage Medicament</h1>
</header>
<main>
    <form action="newMedicament" method="post">
        <div>
            <label for="label">Label : </label>
            <input type="text" id="label" name="label">
        </div>
        <div>
            <label for="stock">Stock : </label>
            <input type="number" step="1" id="stock" name="stock">
        </div>
        <div>
            <label for="dose">Dose en g : </label>
            <input type="number" step="1" id="dose" name="dose">
        </div>
        <div>
            <label for="prix">Prix : </label>
            <input type="number" step="0.01" id="prix" name="prix">
        </div>
        <div>
            <input type="submit" value="Save">
        </div>
    </form>
</main>
<footer>
    <a href="listemedicaments">Nos Medicaments</a>
</footer>
</body>
</html>


