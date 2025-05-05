package donate.user.controller;

import donate.user.dto.Food;
import donate.user.model.User;
import donate.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    public String createUser(@RequestBody User user){
        try {
            userService.createUser(user);
            return "Success in creating user";
        } catch (Exception e) {
            return "Failed in creating user";
        }
    }

    @GetMapping("/all")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/all/food")
    public List<Food> getAllFood(){
        return userService.getAllFood();
    }

}
