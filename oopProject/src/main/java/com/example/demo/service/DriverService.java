package com.example.demo.service;

import com.example.demo.model.DriverModel;
import com.example.demo.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DriverService {
    @Autowired
    DriverRepository driverRepository;

       public void createAccount(DriverModel driverModel){driverRepository.save(driverModel);}
}
