package com.example.demo.controller;

import com.example.demo.model.PaymentModel;
import com.example.demo.model.ReserveModel;
import com.example.demo.model.ResponseObject;
import com.example.demo.service.PaymentService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public ResponseObject payment(@RequestBody PaymentModel paymentModel){
        paymentService.pay(paymentModel);
        return new ResponseObject(null,1);
    }


    @PostMapping("/payment/wallet/{cost}/{uid}")
    @ResponseBody
    public ResponseObject paymentWithWallet(@PathVariable Long uid ,  Long cost){
        paymentService.paywithwallet(uid, cost);
        return new ResponseObject(null,1);
    }
}
