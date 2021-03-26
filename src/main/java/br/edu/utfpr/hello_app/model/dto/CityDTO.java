package br.edu.utfpr.hello_app.model.dto;

import br.edu.utfpr.hello_app.model.domain.State;
import lombok.Data;
import lombok.NonNull;

@Data
public class CityDTO {
    @NonNull
    private String name;
    @NonNull
    private StateDTO state;
}
