<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<! DOCTYPE html>
<html>
<body>
<h2>SPORTS MANAGEMENT SYSTEM</h2>>
<br><br><br><br><br><br>
<table>
    <tr>
       <th>College name</th>>
        <br>
        <th>Gender</th>>
        <br>
        <th>Date of bird<th></th>>
        <br>
        <th>Email</th>>
        <br>
        <th>Name</th>>
    </tr>>
        <br><br><br>
        <c:forEach var="fot" items="${footballList}">
            <c:url var="updateButton" value="/sport_project/updateFootballInfo">
                <c:param name="fotId" value="${fot.id}"/>
            </c:url>
            <c:url var="deleteButton" value="/sport_project/deleteFootballInfo">
                <c:param name="fotId" value="${fot.id}"/>
            </c:url>
    <tr>
        <td>${fot.collegeName}</td>>
        <td>${fot.gender}</td>>
        <td>${fot.dateOfBird}</td>>
        <td>${fot.email}</td>>
        <td>${fot.name}</td>>
        <td>
            <input type="button" value="Update"
                   onclick="window.location.href='${updateButton}'"/>
        </td>>
        <td>
            <input type="button" value="Delete"
                   onclick="window.location.href='${deleteButton}'"/>
        </td>>
    </tr>>
    </c:forEach>>
</table>>
<br><br>
<input type="button" value="Main page"
       onclick="window.location.href='/'"/>
</body>>
</html>>