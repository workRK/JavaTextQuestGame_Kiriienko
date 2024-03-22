package com.kiriienko.javatextquestgame_kiriienko;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "startPageServlet", value = "/start")
public class StartPageServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Початкова ініціалізація гри
        HttpSession session = request.getSession(true);

        session.setAttribute("currentQuestionIndex", 0);

        // Перенаправлення на сторінку гри
        response.sendRedirect(request.getContextPath() + "/view/character.jsp");
    }
}