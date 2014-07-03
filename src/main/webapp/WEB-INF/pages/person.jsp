<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Persons</title>
</head>
<body>
<div class="row">
<h2>Persons</h2>


    <c:forEach var="person" items="${persons}">
        <li>
            ${person.name}
        </li>
    </c:forEach>


</div>
<div class="row">
<h2>Add person</h2>

    <form:form action="\person" modelAttribute="createPersonCommand" method="post">
       Name: <form:input path="name"/>
       Age: <form:input path="age" />
        <input type="submit" value="Submit"/>
    </form:form>
</div>
</body>
</html>
