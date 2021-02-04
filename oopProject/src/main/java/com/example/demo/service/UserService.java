package com.example.demo.service;

import com.example.demo.model.ReserveModel;
import com.example.demo.repository.ReserveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    ReserveRepository reserveRepository;

    public void Reserve(ReserveModel reserveModel){
        reserveRepository.save(reserveModel);
    }
}
