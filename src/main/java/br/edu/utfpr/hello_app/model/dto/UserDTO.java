package br.edu.utfpr.hello_app.model.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class UserDTO {
    @NonNull
    private String name;
    @NonNull
    private int year;
    @NonNull
    private int age;
}
