package com.example.dndavorionwikibackend.Controller.UserController;

import com.example.dndavorionwikibackend.Model.User.User;
import com.example.dndavorionwikibackend.Repositories.UserRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @CrossOrigin
    @PostMapping("/add")
    public void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
