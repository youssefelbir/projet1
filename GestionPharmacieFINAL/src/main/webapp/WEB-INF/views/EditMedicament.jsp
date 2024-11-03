<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Modifier Medicament</title>
</head>
<body>
<header>
    <h1> Modifier Medicament</h1>
</header>
<main>
    <form action="/updateMedicament" method="post">
        <div>
            <label hidden="hidden" for="id">ID : </label>
            <input hidden="hidden" type="text" id="id" name="id" value="${medicamentView.id}">
        </div>
        <div>
            <label for="label">Label : </label>
            <input type="text" id="label" name="label" value="${medicamentView.label}">
        </div>
        <div>
            <label for="stock">Stock : </label>
            <input type="number" step="1" id="stock" name="stock" value="${medicamentView.stock}">
        </div>
        <div>
            <label for="dose">Dose en g : </label>
            <input type="number" step="1" id="dose" name="dose" value="${medicamentView.dose}">
        </div>
        <div>
            <label for="prix">Prix : </label>
            <input type="number" step="0.01" id="prix" name="prix" value="${medicamentView.prix}">
        </div>
        <div>
            <input type="submit" value="Update">
        </div>
    </form>
</main>
<footer>
    <a href="listemedicaments">Nos Medicaments</a>
</footer>
</body>
</html>


