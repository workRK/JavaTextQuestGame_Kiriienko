
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>wrong</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/main.css">
</head>
<body>

<main class="main-wrong">

    <div class="wrong-block">

        <h2 class="wrong-title">
            О ні! Ваш вибір призвів до невдачі у вашій подорожі "Таємницями Айрелії". Нагадуємо, що кожне ваше рішення має вагомі наслідки, і цей раз не став винятком.
        </h2>

        <h2 class="wrong-title">
            Чи бажаєте ви почати заново, уважно зваживши свої подальші кроки, або повернутися на головну сторінку, щоб розглянути інші можливості в містичному світі Айрелії? Пам'ятайте, нові загадки та пригоди чекають на вас у кожному вашому рішенні. Спробуйте ще раз і покажіть усім свою наполегливість у розкритті таємниць цього чарівного світу!
        </h2>


    </div>

    <form action="${pageContext.request.contextPath}/restart" method="get">
        <button type="submit" class="restart-button"><span class="btn-text">На початок</span><img src="${pageContext.request.contextPath}/static/images/restart_ico.png" alt=""></button>
    </form>
</main>

</body>
</html>
