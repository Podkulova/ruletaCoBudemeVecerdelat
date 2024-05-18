[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Ruleta</title>
    <meta content="width=device-width, initial-scale=1" name="viewport">
    <link href="https://fonts.gstatic.com" rel="preconnect">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,400;0,700;1,400;1,700&display=swap" rel="stylesheet">
    <link href="css/styles.css" rel="stylesheet"> <!-- Připojení externího CSS souboru -->
</head>
<body>
<div class="container">
    <div>
        <h1>Dnes večer nás čeká: <span>${moznost}</span></h1>
    </div>
    <div class="roulette-container">
        <img id="ruleta" class="ruleta" src="/images/ruleta-${index}.svg"/>
    </div>
    <button id="spinButton" class="spinButton">Roztočit</button> <!-- Tlačítko pro spuštění animace -->
</div>
<script src="/js/script.js"></script>
</body>
</html>