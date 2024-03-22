<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>start</title>
    <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/main.css">
</head>
<body>

<main class="main-question">

    <div class="question-block">

        <h2 class="question-title">${currentQuestion.questionText}</h2>

        <hr>

        <div class="answer-button__block">
            <c:forEach var="answer" items="${currentQuestion.answers}">
                <form action="${pageContext.request.contextPath}/game" method="post">
                    <button type="submit" class="answer-button" name="userAnswer" value="${answer}">
                        <img src="${pageContext.request.contextPath}/static/images/answer_ico.png" alt="">
                        <span class="answer-btn-text">${answer}</span>
                    </button>
                </form>
            </c:forEach>
        </div>

    </div>

    <h3 class="counter-title">Крок ${currentQuestion.id} із ${TOTAL_QUESTIONS}</h3>

    <div class="progress-container">
        <div class="progress-bar" id="progress-bar" style="width: ${currentProgressPercentage}%"></div>
    </div>

</main>

</body>

</html>
