package br.edu.utfpr.hello_app.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "StateController", urlPatterns = {"/estado", "/states"})
public class StateController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> states = new ArrayList<>();
        states.add("Paraná");
        states.add("São Paulo");
        states.add("Santa Catarina");

        String json = new Gson().toJson(states);
        json = new String(json.getBytes(), "UTF-8");

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
