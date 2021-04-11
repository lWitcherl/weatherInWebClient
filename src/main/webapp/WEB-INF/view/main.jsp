<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WeatherIn</title>
</head>
<body>
welcome to WeatherIn
<br><br><br>
<form action="search" method="get">
    <input type="text" name="param">
    <input type="submit" value="search">
</form>
</body>
</html>
