package com.example.demo.service;

import com.example.demo.dto.CreateAcoountDriverDto;
import com.example.demo.model.DriverModel;
import com.example.demo.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DriverService {
    @Autowired
    DriverRepository driverRepository;

       public void createAccount(CreateAcoountDriverDto createAcoountDriverDto){
           DriverModel driverModel=new DriverModel();
           driverModel.setCarinfo(createAcoountDriverDto.getCarinfo());
           driverModel.setFamily(createAcoountDriverDto.getFamily());
           driverModel.setName(createAcoountDriverDto.getName());
           driverModel.setPass(createAcoountDriverDto.getPass());
           driverModel.setSex(createAcoountDriverDto.getSex());
           driverModel.setUsername(createAcoountDriverDto.getUsername());
           driverRepository.save(driverModel);
       }
}
