<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title>Update Reply</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/reply/update.do" method="post">
    <input type="hidden" name="replyNo" value="${replyVO.replyNo}" />
    <input type="hidden" name="contentsNo" value="${replyVO.contentsNo}" />

    <label for="content">댓글 내용:</label>
    <textarea id="content" name="content" rows="3" required>${replyVO.content}</textarea>
    <br>
    <input type="submit" value="댓글 수정" />
</form>

</body>
</html>
