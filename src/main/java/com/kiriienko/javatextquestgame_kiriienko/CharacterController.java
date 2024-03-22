package com.kiriienko.javatextquestgame_kiriienko;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/character")
public class CharacterController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Ваша логіка обробки запиту
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/game.jsp");
        dispatcher.forward(request, response);
    }
}
