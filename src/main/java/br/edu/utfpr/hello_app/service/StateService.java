package br.edu.utfpr.hello_app.service;

import br.edu.utfpr.hello_app.model.dao.CityDAO;
import br.edu.utfpr.hello_app.model.dao.StateDAO;
import br.edu.utfpr.hello_app.model.domain.City;
import br.edu.utfpr.hello_app.model.domain.State;

public class StateService extends AbstractService<Long, State>{

    public StateService() {
        dao = new StateDAO();
    }
}
