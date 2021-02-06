package com.example.demo.controller;

import com.example.demo.dto.CreateAcoountDriverDto;
import com.example.demo.model.DriverModel;
import com.example.demo.model.ResponseObject;
import com.example.demo.model.UserModel;
import com.example.demo.service.DriverService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/driver")
public class CreateDriverAccountController {
    @Autowired
    private DriverService driverService;

    public CreateDriverAccountController(DriverService driverService){
        this.driverService=driverService;
    }
    @PostMapping("/createAccount")
    @ResponseBody
    public ResponseObject createAccount(@RequestBody CreateAcoountDriverDto createAcoountDriverDto){
        driverService.createAccount(createAcoountDriverDto);
        return new ResponseObject("Account Successfuly create",200);
    }
}