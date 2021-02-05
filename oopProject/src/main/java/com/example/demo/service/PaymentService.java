package com.example.demo.service;

import com.example.demo.model.PaymentModel;
import com.example.demo.model.WalletModel;
import com.example.demo.repository.PaymentRepository;
import com.example.demo.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;
    @Autowired
    WalletRepository walletRepository;
public void pay(PaymentModel paymentModel){
    paymentRepository.save(paymentModel);
}
public void paywithwallet(Long cost , Long uid){
   Optional <WalletModel> walletModel = walletRepository.findById(uid);
    if(walletModel.isPresent()){
        if(walletModel.get().getAmount()>=cost){
            walletModel.get().setAmount(walletModel.get().getAmount()-cost);
            walletRepository.save(walletModel.get());
        }
    }


}
}
