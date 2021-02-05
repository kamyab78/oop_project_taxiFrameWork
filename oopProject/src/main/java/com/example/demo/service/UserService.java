package com.example.demo.service;

import com.example.demo.model.ReserveModel;
import com.example.demo.model.UserModel;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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


    public List GetHistoryOfTrip(int id){
        List<ReserveModel> reserveList =new ArrayList<>();
        Iterable<ReserveModel>  reserve =reserveRepository.findAll();
        for (ReserveModel reserveModel : reserve) {
            for (int i = 0; i <reserveModel.getUserModel().size() ; i++) {

                if (reserveModel.getUserModel().get(i).getId().equals(id)){
                    reserveList.add(reserveModel);
                }
            }
        }
        return reserveList;
    }
}
