package com.example.samdemo.controller;

import com.example.samdemo.dto.MessageDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/hello")
public class HelloController {
    @GetMapping
    public String hello() {
        return "Hello World";
    }

    @PostMapping(path = "/save/{name}")
    public String save(@PathVariable(name = "name") String str, @RequestBody MessageDto messageDto) {
        return "Hello " + str + ". "+ messageDto.getMessage();
    }
}
