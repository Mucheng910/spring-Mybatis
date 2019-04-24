package com.example.demo.controller;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@RestController
@RequestMapping("")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    //http://localhost:8080/user?pageNum=2&pageSize=5
    @GetMapping("/user")
    public Page<User> findAll( Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Page<User> userList = userMapper.findAll();
        return userList;
    }

    @GetMapping("/user/{userId}")
    public User findById(@PathVariable long userId) {
        return userMapper.findById(userId);
    }

    @PostMapping("/user")
    public void insertUser(@RequestBody User user) {
        userMapper.insertUser(user.getName());
    }

    @PutMapping("/user/{userId}")
    public void updateUser(@RequestBody User user,@PathVariable int userId) {
        userMapper.updateUser(user.getName(),userId);
    }

    @DeleteMapping("/user/{userId}")
    public void deleteById(@PathVariable long userId) {
        userMapper.deleteById(userId);
    }
}