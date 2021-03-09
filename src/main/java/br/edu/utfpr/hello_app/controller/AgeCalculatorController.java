package br.edu.utfpr.hello_app.controller;

import sun.java2d.pipe.SpanShapeRenderer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@WebServlet(name = "AgeCalculatorServlet", value = "/calculadora-idade")
public class AgeCalculatorController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("nome");
        String year = request.getParameter("ano");

        if(name == null || year == null){
            request.getRequestDispatcher("/WEB-INF/view/age-calculator.jsp").forward(request, response);
        }
        else{
            Integer yearInt = Integer.parseInt(year);

            int age = calculateAge(yearInt);
            request.setAttribute("age", age);
            request.getRequestDispatcher("/WEB-INF/view/age-result.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String year = request.getParameter("year");

        Integer yearInt = Integer.parseInt(year);

        int age = calculateAge(yearInt);

        request.setAttribute("flash.age", age);
        request.getRequestDispatcher("/calculadora-data").forward(request, response);
    }

    private int calculateAge(int year){
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);
        return yearNow - year;
    }
}
