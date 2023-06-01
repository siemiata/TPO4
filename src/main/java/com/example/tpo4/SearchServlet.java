package com.example.tpo4;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class SearchServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String carCategory = (String) request.getAttribute("carCategory");
        List<Car> cars = CarDataLoader.loadCarsByCategory(carCategory); // Załaduj dane samochodów z pliku
        request.setAttribute("cars", cars);
        RequestDispatcher dispatcher = request.getRequestDispatcher("ResultServlet");
        dispatcher.forward(request, response);
    }
}
