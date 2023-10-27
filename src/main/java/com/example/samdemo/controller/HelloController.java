package com.example.samdemo.controller;

import com.example.samdemo.dto.MessageDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/hello")
public class HelloController {

    @Value(value = "${constants.message}")
    private String message;

    @GetMapping
    public String hello() {
        return message;
    }

    @PostMapping(path = "/save/{name}")
    public String save(@PathVariable(name = "name") String str, @RequestBody MessageDto messageDto) {
        return message + " " + str + ". "+ messageDto.getMessage();
    }
}
