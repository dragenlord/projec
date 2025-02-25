package com.example.projec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.projec.repositoriy.Food;

import java.util.List;
@RestController
public class FoodControler {
    @GetMapping("/List")
    public List<Food> helloWorld(){
        return List.of(
                new Food(0,"sd"));

    }

}
