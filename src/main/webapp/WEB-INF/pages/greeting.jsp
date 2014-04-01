<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Greetings</title>
</head>
<body>
    <p><spring:message code="hello.label" text="Some default text"/> ${name}</p>
</body>
</html>
