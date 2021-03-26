package br.edu.utfpr.hello_app.model.mapper;

import br.edu.utfpr.hello_app.model.domain.User;
import br.edu.utfpr.hello_app.model.dto.UserDTO;

public class UserMapper {

    public static User toEntity(UserDTO dto){
        User entity = new User(dto.getName(), dto.getYear(), dto.getAge());
        return entity;
    }

    public static UserDTO toDTO(User entity){
        UserDTO dto = new UserDTO(entity.getName(), entity.getYear(), entity.getAge());
        return dto;
    }
}
