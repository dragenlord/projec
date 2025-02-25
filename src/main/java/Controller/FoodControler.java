package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import repositoriy.Food;

import java.util.List;

public class FoodControler {
    @GetMapping
    public List<Food> helloWorld(){
        return List.of(
                new Food(0,"sd"));

    }

}
