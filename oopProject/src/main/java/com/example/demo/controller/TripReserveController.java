package com.example.demo.controller;

import com.example.demo.model.ReserveModel;
import com.example.demo.model.ResponseObject;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
public class TripReserveController {
    @Autowired
    private UserService userService;

    public TripReserveController(UserService userService){
        this.userService=userService;
    }
    @PostMapping("/reserve")
    @ResponseBody
    public ResponseObject addSerial(@RequestBody ReserveModel reserveModel){
        userService.Reserve(reserveModel);
        return new ResponseObject(null,1);
    }
}
