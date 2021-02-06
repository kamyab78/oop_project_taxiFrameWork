package com.example.demo.controller;

import com.example.demo.dto.WalletRequestDTO;
import com.example.demo.model.PaymentModel;
import com.example.demo.model.ResponseObject;
import com.example.demo.model.WalletModel;
import com.example.demo.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wallet")
public class WalletController {
@Autowired
    WalletService walletService;
public WalletController(WalletService walletService){
    this.walletService=walletService;
}
    @PostMapping("/sharj")
    @ResponseBody
    public ResponseObject payment(@RequestBody WalletModel wallletModel){
        walletService.sharjing(wallletModel);
        return new ResponseObject(null,1);
    }
}
