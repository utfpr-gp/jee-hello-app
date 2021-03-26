package br.edu.utfpr.hello_app.service;

import br.edu.utfpr.hello_app.model.dao.UserDAO;
import br.edu.utfpr.hello_app.model.domain.User;

import java.util.Calendar;

public class UserService extends AbstractService<Long, User>{

    public UserService() {
        dao = new UserDAO();
    }

    public int calculateAge(int year){
        int yearNow = Calendar.getInstance().get(Calendar.YEAR);
        return yearNow - year;
    }
}
