<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<! DOCTYPE html>
<html>
<body>
<h2>SPORTS MANAGEMENT SYSTEM</h2>>
<br><br><br><br>
<br><br>
<table>
    <tr>
        <th>College name</th>>
        <br>
        <th>Gender</th>>
        <br>
        <th>Date of bird<th>
        <br>
        <th>Email</th>>
        <br>
        <th>Name</th>>
    </tr>>
    <br><br><br>
<c:forEach var="ch" items="${chessList}">
    <c:url var="updateButton" value="/sport_project/updateChessInfo">
        <c:param name="chId" value="${ch.id}"/>
    </c:url>
    <c:url var="deleteButton" value="/sport_project/deleteChessInfo">
        <c:param name="chId" value="${ch.id}"/>
    </c:url>
        <tr>
            <td>${ch.collegeName}</td>>
            <td>${ch.gender}</td>>
            <td>${ch.dateOfBird}</td>>
            <br><br>
            <td>${ch.email}</td>>
            <td>${ch.name}</td>>
            <td>
                <input type="button" value="Update"
                       onclick="window.location.href='${updateButton}'"/>
            </td>>
            <td>
                <input type="button" value="Delete"
                       onclick="window.location.href='${deleteButton}'"/>
            </td>>
            <br>
        </tr>>
    </c:forEach>>
</table>>
<br><br>
<input type="button" value="Main page"
       onclick="window.location.href='/'"/>
</body>>
</html>>