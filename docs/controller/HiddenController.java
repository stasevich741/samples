package com.example.docs.controller;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Аннотация @Hidden скрывает весь rest-контроллер.
 *
 * @Operation с флагом hidden полностью исключает информацию о данном методе из документации.
 */


@Hidden
@RestController
@RequestMapping("/balances")
public class HiddenController {

    @GetMapping("/{personId}")
    public String getBalanceByPersonId(@PathVariable Long id) {
        return "";
    }

    @Operation(hidden = true)
    public String hiddenMethod() {
        return "";
    }
}
