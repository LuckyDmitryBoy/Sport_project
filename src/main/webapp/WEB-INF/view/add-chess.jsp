<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<! DOCTYPE html>
<html>
<body>
<h2>Chess registration form</h2>>
<br>
<br>
<form:form action="saveChess" modelAttribute="chess">
    <form:hidden path="id"/>
    College name <form:input path="collegeName"/>
    <form:errors path="collegeName"/>
    <br><br>
    Gender
    <br>
    Man <form:radiobutton path="gender" value="man"/>
    Female <form:radiobutton path="gender" value="female"/>
    <br><br>
    Date of bird <form:input path="dateOfBird"/>
    <form:errors path="dateOfBird"/>
    <br><br>
    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    <input type="submit" value="ok">
</form:form>>
</body>>
</html>>