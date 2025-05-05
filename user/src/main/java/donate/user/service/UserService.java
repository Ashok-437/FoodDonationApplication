package donate.user.service;

import donate.user.dto.Food;
import donate.user.feign.FoodFeign;
import donate.user.model.User;
import donate.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final FoodFeign foodFeign;

    //Save User
    public void createUser(User user){

        userRepository.save(user);

    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public List<Food> getAllFood() {
        return foodFeign.getAllFood();
    }
}
