[#ftl]
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Evening Option</title>
</head>
<body>
<h1>Selected Evening Option:</h1>
<p th:text="${selectedOption}"></p>
<div>Vylosováno: <span>${ruleta}</span></div>
</body>
</html>