package com.example.demo.controller;

import com.example.demo.model.ReserveModel;
import com.example.demo.model.ResponseObject;
import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/user")
public class TripController {
    @Autowired
    private UserService userService;

    public TripController(UserService userService){
        this.userService=userService;
    }
    @PostMapping("/reserve")
    @ResponseBody
    public ResponseObject Reserve(@RequestBody ReserveModel reserveModel){
        userService.Reserve(reserveModel);
        return new ResponseObject(null,1);
    }
    @GetMapping("/GetHistory/{id}")
    //idie user manzorame
    @ResponseBody
    public ResponseObject GetHistory(@PathVariable int id){
       List<String> list = userService.GetHistoryOfTrip(id);
        return new ResponseObject(list,1);
    }
    @PostMapping("/reserve/shared")
    @ResponseBody
    public ResponseObject SharedReserve(@RequestBody ReserveModel reserveModel){
        userService.SharedReserve(reserveModel);
        return new ResponseObject(null,1);
    }

}
