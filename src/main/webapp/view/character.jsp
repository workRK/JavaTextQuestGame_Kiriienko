<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>question_card</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/main.css">
</head>
<body>

<main class="main-character">

    <div class="character-card">

        <div class="character-image">

        </div>

        <div class="character-text">
            <div class="character-text-block">
                <h3 class="character-title">Опис:</h3>
                <p class="character-text-paragraf">Ілліан Даркскай - відважний іскатель пригод, який народився в самому серці Айрелії, оточений відлюдненим лісом і магічним аурою. З його перших днів, він відчував на собі загадковий поклик древніх таємниць цього королівства.</p>
            </div>

            <div class="character-text-block">
                <h3 class="character-title">Характер:</h3>
                <p class="character-text-paragraf">Ілліан - володар великого серця і сильного духу. Його допитливість та сміливість роблять його відмінним дослідником, готовим розкривати таємниці Айрелії. Він завжди в пошуку нових знань і не боїться ставити свою долю на карту, щоб пройти крізь випробування, які кидає йому цей магічний світ.</p>
            </div>

            <div class="character-text-block">
                <h3 class="character-title">Мета:</h3>
                <p class="character-text-paragraf">Ілліан Даркскай рушає в подорож не тільки для власного задоволення, але й з метою розкрити давні таємниці Айрелії та врятувати королівство від темних сил, які загрожують його магічній рівновазі.</p>
            </div>
        </div>

        <form action="${pageContext.request.contextPath}/game">
            <button class="character-button"><span class="btn-text-character">Початок</span><img src="${pageContext.request.contextPath}/static/images/character_btn_ico.png" alt=""></button>
        </form>
    </div>

</main>

</body>
</html>
