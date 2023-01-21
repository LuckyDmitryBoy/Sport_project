<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<! DOCTYPE html>
<html>
<body>
<h2>SPORTS MANAGEMENT SYSTEM</h2>>
<br><br><br><br><br><br>
<table>
    <tr>
        <th>College name</th>>
        <th>Gender</th>>
        <th>Date of bird<th>
        <th>Email</th>>
        <th>Name</th>>
    </tr>>
<br><br><br>
<c:forEach var="val" items="${voleybalList}">
    <c:url var="updateButton" value="/sport_project/updateVolleyballInfo">
        <c:param name="valId" value="${val.id}"/>
    </c:url>
    <c:url var="deleteButton" value="/sport_project/deleteVolleyballInfo">
        <c:param name="valId" value="${val.id}"/>
    </c:url>
        <tr>
            <td>${val.collegeName}</td>>
            <br>
            <td>${val.gender}</td>>
            <br>
            <td>${val.dateOfBird}</td>>
            <br>
            <td>${val.email}</td>>
            <br>
            <td>${val.name}</td>>
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