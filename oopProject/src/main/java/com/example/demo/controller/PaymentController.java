package com.example.demo.controller;

import com.example.demo.dto.PayWithWalletDto;
import com.example.demo.dto.PaymentDto;
import com.example.demo.model.PaymentModel;
import com.example.demo.model.ReserveModel;
import com.example.demo.model.ResponseObject;
import com.example.demo.service.PaymentService;
import com.example.demo.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService){
        this.paymentService=paymentService;
    }
    @PostMapping("/payment")
    @ResponseBody
    public ResponseObject payment(@RequestBody PaymentDto paymentDto){
        paymentService.pay(paymentDto);
        return new ResponseObject("Payment Successfuly ",200);
    }


    @PostMapping("/payment/wallet")
    @ResponseBody
    public ResponseObject paymentWithWallet(@RequestBody PayWithWalletDto payWithWalletDto){
        paymentService.paywithwallet(payWithWalletDto);
        return new ResponseObject("Payment Successfuly ",200);
    }
}
