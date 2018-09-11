package com.spring.rest.SpringRestLearning.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("message")
    public String getMessage() {
        return "Hello World ";
    }

    @PostMapping("post")
    public String post(@RequestBody Input input) {
        System.out.println(input.getId() + input.getName());
        return "Success";
    }

    static class Input {
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

