package donate.food.controller;

import donate.food.model.Food;
import donate.food.service.FoodService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class FoodController {

    private final FoodService foodService;

    @PostMapping("/create")
    public String createFood(@RequestBody Food food){
        try{
            foodService.createFood(food);
            return "Success in creating food";
        } catch (Exception e) {
            return "Failed to creating food";
        }
    }

    @GetMapping("/all")
    public List<Food> getAllFood(){
        return foodService.getAllFood();
    }
}
