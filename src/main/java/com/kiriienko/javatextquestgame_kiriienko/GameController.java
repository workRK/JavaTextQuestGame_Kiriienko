package com.kiriienko.javatextquestgame_kiriienko;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/game")
public class GameController extends HttpServlet {

    private static final String QUESTIONS_FILE = "/questions.json";
    private static final String WRONG_ANSWER_PAGE = "/view/wrong.jsp";
    private static final int TOTAL_QUESTIONS = 23;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        // Отримання індексу поточного питання з сесії
        int currentQuestionIndex = (int) session.getAttribute("currentQuestionIndex");

        // Завантаження питань з JSON
        List<Question> questions = loadQuestions();

        // Перевірка, чи індекс не виходить за межі кількості питань
        if (currentQuestionIndex < 0 || currentQuestionIndex >= TOTAL_QUESTIONS) {
            response.sendRedirect(request.getContextPath() + "/game");
            return;
        }

        // Отримання поточного питання
        Question currentQuestion = questions.get(currentQuestionIndex);

        // Збереження поточного питання та загальної кількості питань у атрибутах сесії
        request.setAttribute("currentQuestion", currentQuestion);
        request.setAttribute("TOTAL_QUESTIONS", TOTAL_QUESTIONS);


        // Визначення відсоткового прогресу для прогрес-бару
        int currentProgressPercentage = (currentQuestionIndex * 100) / TOTAL_QUESTIONS;
        request.setAttribute("currentProgressPercentage", currentProgressPercentage);

        // Перенаправлення на сторінку питання
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/game.jsp");
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Отримання індексу поточного питання з сесії
        HttpSession session = request.getSession();

        // Отримання відповіді від користувача
        String userAnswer = request.getParameter("userAnswer");
        int currentQuestionIndex = (int) session.getAttribute("currentQuestionIndex");

        // Завантаження питань з JSON
        List<Question> questions = loadQuestions();

        // Перевірка вірності відповіді
        if (userAnswer != null && userAnswer.trim().equals(questions.get(currentQuestionIndex).getCorrectChoice().trim())) {
            // Якщо відповідь правильна, оновлення індексу поточного питання
            currentQuestionIndex++;
            session.setAttribute("currentQuestionIndex", currentQuestionIndex);

            // Перенаправлення на сторінку питання
            response.sendRedirect(request.getContextPath() + "/game");
        } else {
            // Якщо відповідь невірна, перенаправлення на сторінку помилкової відповіді
            response.sendRedirect(request.getContextPath() + WRONG_ANSWER_PAGE);
        }
    }

    private List<Question> loadQuestions() {

        List<Question> questions = new ArrayList<>();

        try (InputStream inputStream = getClass().getResourceAsStream(QUESTIONS_FILE)) {
            assert inputStream != null;
            try (InputStreamReader reader = new InputStreamReader(inputStream)) {

                // Використання Gson для парсингу JSON у список об'єктів Question
                questions = new Gson().fromJson(reader, new TypeToken<List<Question>>() {}.getType());
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        return questions;
    }
}
