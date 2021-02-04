package com.example.demo.service;

import com.example.demo.model.ReserveModel;
import com.example.demo.model.UserModel;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    ReserveRepository reserveRepository;
@Autowired
UserRepository userRepository;
    public void Reserve(ReserveModel reserveModel){
        reserveRepository.save(reserveModel);
    }
    public void createAccount(UserModel userModel){userRepository.save(userModel);}
}
