package com.example.demo.service;

import com.example.demo.dto.PayWithWalletDto;
import com.example.demo.dto.PaymentDto;
import com.example.demo.model.PaymentModel;
import com.example.demo.model.ReserveModel;
import com.example.demo.model.UserModel;
import com.example.demo.model.WalletModel;
import com.example.demo.repository.PaymentRepository;
import com.example.demo.repository.ReserveRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.WalletRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;
    @Autowired
    WalletRepository walletRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    ReserveRepository reserveRepository;
public void pay(PaymentDto paymentDto){
    PaymentModel paymentModel=new PaymentModel();
    paymentModel.setCost(paymentDto.getCost());
    Optional<UserModel> userModels = userRepository.findById(paymentDto.getUid());
    paymentModel.setUserModel(userModels.get());
    Optional<ReserveModel> reserveModel = reserveRepository.findById(paymentDto.getReserveid());
    paymentModel.setReserveModel(reserveModel.get());
    paymentRepository.save(paymentModel);
}
public void paywithwallet(PayWithWalletDto payWithWalletDto){
   List<WalletModel> walletModel =walletRepository.findWalletbyid(payWithWalletDto.getUid());
    if(walletModel.size()!=0){
    if(walletModel.get(0).getAmount()>=payWithWalletDto.getCost()){
        walletModel.get(0).setAmount(walletModel.get(0).getAmount()-payWithWalletDto.getCost());
        walletRepository.save(walletModel.get(0));
}
    }


}
}
