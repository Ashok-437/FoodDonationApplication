package donate.user.feign;

import donate.user.dto.Food;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("food")
public interface FoodFeign {

    @GetMapping("/all")
    List<Food> getAllFood();
}
