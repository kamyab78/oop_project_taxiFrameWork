package com.example.demo.service;

import com.example.demo.dto.WalletRequestDTO;
import com.example.demo.model.UserModel;
import com.example.demo.model.WalletModel;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WalletService {
    @Autowired
    WalletRepository walletRepository;
    @Autowired
    UserRepository userRepository;
    public void sharjing(WalletRequestDTO walletRequestDTO){
        WalletModel walletModel =new WalletModel();
        walletModel.setAmount(walletRequestDTO.getAmount());
        Optional<UserModel> userModels = userRepository.findById(walletRequestDTO.getUid());
        walletModel.setUserModel(userModels.get());
        walletRepository.save(walletModel);
    }
}
