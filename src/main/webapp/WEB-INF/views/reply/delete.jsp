<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <title>Delete Reply</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/reply/delete.do" method="post">
    <input type="hidden" name="replyNo" value="${replyVO.replyNo}" />
    <input type="hidden" name="contentsNo" value="${replyVO.contentsNo}" />

    <p>댓글 내용: ${replyVO.content}</p>

    <input type="submit" value="댓글 삭제" />
</form>

</body>
</html>
