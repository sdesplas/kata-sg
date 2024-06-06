package com.desplas.foobarquix.api.controllers;

import com.desplas.foobarquix.api.exceptions.InvalidInputException;
import com.desplas.foobarquix.api.services.FooBarQuixEngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FooBarQuixController {

    @Autowired
    private FooBarQuixEngineService engineService;

    @GetMapping("/foobarquix")
    public String transform(@RequestParam int value) {
        if (value < 1 || value > 100) {
            throw new InvalidInputException("Le nombre doit être compris entre 0 et 100");
        }
        return this.engineService.transform(value);
    }

    @ExceptionHandler(InvalidInputException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleInvalidInputException(InvalidInputException ex) {
        return ex.getMessage();
    }
}
