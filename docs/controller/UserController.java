package com.example.docs.controller;

import com.example.docs.model.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Tag позволяет указать имя контроллера (в springdoc будет выделено жирным шрифтом) и его описание.
 * @Operation позволяет сделать то же самое для методов этого контроллера, но описание надо указывать в параметре summary.
 * Также можно указать назначение каждого параметра в методе с помощью @Parameter.
 */

@RestController
@RequestMapping("/user")
@Tag(name = "Пользователи",
        description = "Все методы для работы с пользователями системы")
public class UserController {

    @GetMapping("/{id}")
    @Operation(summary = "Получить информацию о пользователе по его id")
    public User getUserById(@Parameter(description = "id пользователя")
                            @PathVariable Long id) {
        return new User();
    }


}
