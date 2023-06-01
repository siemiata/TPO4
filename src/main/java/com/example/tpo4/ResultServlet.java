package com.example.tpo4;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ResultServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Car> cars = (List<Car>) request.getAttribute("cars");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Wyniki wyszukiwania</title></head><body>");
        out.println("<h1>Wyniki wyszukiwania</h1>");
        out.println("<table border='1'>");
        out.println("<tr><th>Kategoria</th><th>Marka</th><th>Rok produkcji</th><th>Pojemność</th><th>Zużycie paliwa</th></tr>");

        for (Car car : cars) {
            out.println("<tr>");
            out.println("<td>" + car.getCategory() + "</td>");
            out.println("<td>" + car.getBrand() + "</td>");
            out.println("<td>" + car.getYearOfProd() + "</td>");
            out.println("<td>" + car.getCapacity() + "</td>");
            out.println("<td>" + car.getFuelComp() + "</td>");
            out.println("</tr>");
        }

        out.println("</table>");
        out.println("</body></html>");
    }
}
