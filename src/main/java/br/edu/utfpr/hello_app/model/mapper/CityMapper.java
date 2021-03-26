package br.edu.utfpr.hello_app.model.mapper;

import br.edu.utfpr.hello_app.model.domain.City;
import br.edu.utfpr.hello_app.model.domain.State;
import br.edu.utfpr.hello_app.model.domain.User;
import br.edu.utfpr.hello_app.model.dto.CityDTO;
import br.edu.utfpr.hello_app.model.dto.StateDTO;
import br.edu.utfpr.hello_app.model.dto.UserDTO;


public class CityMapper{

    public CityMapper getInstance(){
        return new CityMapper();
    }

    public City toEntity(CityDTO dto){
        State state = StateMapper.toEntity(dto.getState());
        City entity = new City(dto.getName(), state);
        return entity;
    }

    public CityDTO toDTO(City entity){
        StateDTO stateDTO = StateMapper.toDTO(entity.getState());
        CityDTO dto = new CityDTO(entity.getName(), stateDTO);
        return dto;
    }
}
