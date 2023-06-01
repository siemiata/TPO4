package com.example.tpo4;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class RequestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String carCategory = request.getParameter("carCategory");
        request.setAttribute("carCategory", carCategory);
        RequestDispatcher dispatcher = request.getRequestDispatcher("SearchServlet");
        dispatcher.forward(request, response);
    }
}
