package br.edu.utfpr.hello_app.controller;

import com.google.gson.Gson;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

@WebServlet(name = "CityController", value = "/cities")
public class CityController extends HttpServlet {
    Map<String, List<String>> citiesByStateMap = new HashMap<String,List<String>>();

    @Override
    public void init(ServletConfig config) throws ServletException {
        citiesByStateMap.put("Paraná", Arrays.asList("Guarapuava", "Maringá", "Curitiba"));
        citiesByStateMap.put("São Paulo", Arrays.asList("São Paulo", "Piracicaba", "Campinas"));
        citiesByStateMap.put("Santa Catarina", Arrays.asList("Florianópolis", "Joinville", "Blumenau"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String state = request.getParameter("estado");

        String json = new Gson().toJson(citiesByStateMap.get(state));

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
