package com.example.demo.service;

import com.example.demo.dto.WalletRequestDTO;
import com.example.demo.model.UserModel;
import com.example.demo.model.WalletModel;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WalletService {
    @Autowired
    WalletRepository walletRepository;
    @Autowired
    UserRepository userRepository;
    public void sharjing(WalletRequestDTO walletRequestDTO){

        List<WalletModel> walletModel =walletRepository.findWalletbyid(walletRequestDTO.getUid());
        if(walletModel.size()!=0){

                walletModel.get(0).setAmount(walletModel.get(0).getAmount()+walletRequestDTO.getAmount());
                walletRepository.save(walletModel.get(0));

        }
        else{
            WalletModel walletModel1 =new WalletModel();

            walletModel1.setAmount(walletRequestDTO.getAmount());
            Optional<UserModel> userModels = userRepository.findById(walletRequestDTO.getUid());
            walletModel1.setUserModel(userModels.get());
            walletRepository.save(walletModel1);
        }

    }
}
