package com.example.demo.controller;

import com.example.demo.dto.CreateAcoountUserDto;
import com.example.demo.model.ResponseObject;
import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class CreateUserAccountController {
    @Autowired
    private UserService userService;

    public CreateUserAccountController(UserService userService){
        this.userService=userService;
    }
    @PostMapping("/createAccount")
    @ResponseBody
    public ResponseObject createAccount(@RequestBody CreateAcoountUserDto createAcoountUserDto){
        userService.createAccount(createAcoountUserDto);
        return new ResponseObject("Account Successfuly create",200);
    }
}
