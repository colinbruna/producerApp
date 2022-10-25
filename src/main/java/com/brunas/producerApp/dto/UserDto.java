package com.brunas.producerApp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class UserDto {

    @JsonProperty("name") //para serializar/desserializar o nome da propriedade
    private String name;
    @JsonProperty("age")
    private int age;

    @Override
    public String toString() {
        return "UserDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
