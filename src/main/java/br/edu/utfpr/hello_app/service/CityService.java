package br.edu.utfpr.hello_app.service;

import br.edu.utfpr.hello_app.model.dao.CityDAO;
import br.edu.utfpr.hello_app.model.dao.UserDAO;
import br.edu.utfpr.hello_app.model.domain.City;
import br.edu.utfpr.hello_app.model.domain.User;

public class CityService extends AbstractService<Long, City>{

    public CityService() {
        dao = new CityDAO();
    }
}
