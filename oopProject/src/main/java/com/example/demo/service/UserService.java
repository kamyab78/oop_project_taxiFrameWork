package com.example.demo.service;

import com.example.demo.model.DriverModel;
import com.example.demo.model.ReserveModel;
import com.example.demo.model.UserModel;
import com.example.demo.model.WalletModel;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
public class UserService {
    @Autowired
    ReserveRepository reserveRepository;
    @Autowired
    DriverRepository driverRepository;
    @Autowired
    WalletRepository walletRepository;
@Autowired
UserRepository userRepository;
    public void Reserve(ReserveModel reserveModel){
        List<DriverModel> driverModels = driverRepository.findAll();
        Random rn =new Random();
       int randomNum= rn.nextInt(driverModels.size() - 1 + 1) + 1;
        reserveModel.setDriverModel(driverModels.get(randomNum));
        reserveRepository.save(reserveModel);
    }
    public void createAccount(UserModel userModel){
//        Wallet
//       userModel.setWallet();
        userRepository.save(userModel);}
public void SharedReserve(ReserveModel reserveModel){
        reserveRepository.save(reserveModel);
}

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
