package donate.food.service;

import donate.food.model.Food;
import donate.food.repository.FoodRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;

    public void createFood(Food food){
        foodRepository.save(food);
    }

    public List<Food> getAllFood() { return foodRepository.findAll(); }
}
