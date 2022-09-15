package com.example.docs.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Информация о пользователе")
public class User {

    @Schema(description = "Идентификатор")
    Long id;

    @Schema(description = "имя")
    String name;

}
