package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("test")
public class index {

    @GetMapping()
    public Map<String, String> index(@RequestParam("id") String id, @RequestParam("name") String name) {
        Map<String, String> res = new HashMap<>();
        res.put("Hello","WORLD");
        return res;
    }
}
