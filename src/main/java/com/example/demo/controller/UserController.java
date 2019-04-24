package com.example.demo.controller;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user")
    public List<User> findAll() {
        return null;
    }

    @GetMapping("/user/{userId}")
    public User findById(@PathVariable long userId) {
        return null;
    }

    @PostMapping("/user")
    public void insertUser(@RequestBody User user) {
    }

    @PutMapping("/user/{userId}")
    public void updateUser(@RequestBody User user,@PathVariable int userId) {
    }

    @DeleteMapping("/user/{userId}")
    public void deleteById(@PathVariable long userId) {
    }
}
