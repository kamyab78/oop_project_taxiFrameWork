package com.example.demo.service;

import com.example.demo.model.WalletModel;
import com.example.demo.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletService {
    @Autowired
    WalletRepository walletRepository;
    public void sharjing(WalletModel walletModel){
        walletRepository.save(walletModel);
    }
}
