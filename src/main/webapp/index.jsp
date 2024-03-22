<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>start</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/main.css">
</head>
<body>

<main class="main">

    <div class="start-block">

        <h1 class="main-title">Шлях Чарівника</h1>

        <div class="start-block_text-block">
            <p class="start-block_text-paragraf">
                Ласкаво просимо до містичного світу "Шлях чарівника"! Сюжет нашої гри розгортається в давньому королівстві, де сили магії та таємниці тісно переплітаються з щоденним життям. Ти - відважний шукач пригод, що вирішив дослідити таємничий забутий ліс, де, за легендами, сховані давні артефакти.<br>

                Твій шлях буде повний загадок та викликів, де кожен вибір відкриває нові перспективи та впливає на хід подій. Тобі доведеться укласти союз з загадковими мандрівниками, розгадувати таємниці давніх фонтанів і боротися з темними силами, щоб розкрити секрети Айрелії.<br>

                Чи зможеш ти пройти через випробування, прийняти мудрі рішення та стати захисником цього магічного королівства? Тебе чекають дивовижні відкриття та несподівані повороти сюжету. Поглибишся в "Шлях чарівника" і стань частиною пригоди що захоплює!
            </p>
        </div>

        <form action="${pageContext.request.contextPath}/start">
            <button class="start-button"><span class="btn-text">Вирушаємо</span><img src="${pageContext.request.contextPath}/static/images/btn_start_ico.png" alt=""></button>
        </form>

        <div class="copyright-text">
            <p>All rights reserved © 2024 The Wizard's Way</p>
        </div>

    </div>

</main>

</body>
</html>