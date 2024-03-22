package com.kiriienko.javatextquestgame_kiriienko;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/restart")
public class RestartController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Очищення атрибутів сесії
        HttpSession session = request.getSession();
        session.invalidate();

        // Перенаправлення на початкову сторінку гри
        response.sendRedirect(request.getContextPath() + "/start");
    }
}
