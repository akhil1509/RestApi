package com.example.RestApi.controller;

import com.example.RestApi.model.User;
import jakarta.validation.Valid;
import org.springframework.boot.context.properties.bind.validation.BindValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base")
public class UserController {
    @PostMapping("/users")
    public ResponseEntity<String> validate(@Valid @RequestBody User user, BindingResult result){
if(result.hasErrors()){
    return new ResponseEntity<String>("invalid", HttpStatus.BAD_REQUEST);
} else {
    return new ResponseEntity<String>("valid", HttpStatus.OK);
}
    }
}
