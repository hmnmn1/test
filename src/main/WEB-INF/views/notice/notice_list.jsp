<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Notice List</title>
</head>
<body>
    <h1>Notice List</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Content</th>
            <th>Writer</th>
            <th>Reg Date</th>
        </tr>
        <c:forEach var="notice" items="${noticeList}">
            <tr>
                <td>${notice.id}</td>
                <td>${notice.title}</td>
                <td>${notice.content}</td>
                <td>${notice.writer}</td>
                <td>${notice.regDate}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>