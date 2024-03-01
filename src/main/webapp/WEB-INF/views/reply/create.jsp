<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title>Create Reply</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/reply/create.do" method="post">
    <input type="hidden" name="contentsNo" value="${contentsno}" />

    <label for="content">댓글 내용:</label>
    <textarea id="content" name="content" rows="3" required></textarea>
    <br>
    <input type="submit" value="댓글 작성" />
</form>

</body>
</html>