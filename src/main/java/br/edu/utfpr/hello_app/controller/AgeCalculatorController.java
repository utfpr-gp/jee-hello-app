package br.edu.utfpr.hello_app.controller;

import br.edu.utfpr.hello_app.model.domain.User;
import br.edu.utfpr.hello_app.model.dto.UserDTO;
import br.edu.utfpr.hello_app.model.mapper.UserMapper;
import br.edu.utfpr.hello_app.service.UserService;
import sun.java2d.pipe.SpanShapeRenderer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@WebServlet(name = "AgeCalculatorServlet", value = "/calculadora-idade")
public class AgeCalculatorController extends HttpServlet {

    UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("nome");
        String year = request.getParameter("ano");

        if(name == null || year == null){
            request.getRequestDispatcher("/WEB-INF/view/age-calculator.jsp").forward(request, response);
        }
        else{
            Integer yearInt = Integer.parseInt(year);

            int age = userService.calculateAge(yearInt);

            User user = new User(name, yearInt, age);
            userService.save(user);
            request.setAttribute("user", user);
            request.setAttribute("age", age);
            request.getRequestDispatcher("/WEB-INF/view/age-result.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String year = request.getParameter("year");

        Integer yearInt = Integer.parseInt(year);

        int age = userService.calculateAge(yearInt);

        List<User> usersApp = (List<User>) getServletContext().getAttribute("users");
        if(usersApp == null){
            usersApp = new ArrayList<User>();
            getServletContext().setAttribute("users", usersApp);
        }

        User user = new User(name, yearInt, age);
        //persiste no banco de dados
        userService.save(user);
        UserDTO userDTO = UserMapper.toDTO(user);

        usersApp.add(user);
        getServletContext().setAttribute("users", usersApp);

        //envio do DTO para a camada de visão
        request.setAttribute("flash.user", userDTO);
        request.setAttribute("flash.age", age);

        request.getRequestDispatcher("/calculadora-data").forward(request, response);
    }


}
