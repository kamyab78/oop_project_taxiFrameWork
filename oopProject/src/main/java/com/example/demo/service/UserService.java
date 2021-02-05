package com.example.demo.service;

import com.example.demo.dto.ReserveDto;
import com.example.demo.model.*;
import com.example.demo.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {
    @Autowired
    ReserveRepository reserveRepository;
    @Autowired
    DriverRepository driverRepository;
    @Autowired
    WalletRepository walletRepository;
    @Autowired
    TypeTripRepository typeTripRepository;
@Autowired
UserRepository userRepository;
    public void Reserve(ReserveDto reserveDto){
        ReserveModel reserveModel=new ReserveModel();
        reserveModel.setCity(reserveDto.getCity());
        reserveModel.setCost(reserveDto.getCost());
        reserveModel.setDelay(reserveDto.getDelay());
        reserveModel.setDistanse(reserveDto.getDistanse());
        Optional<UserModel> userModels = userRepository.findById(reserveDto.getUid());

        reserveModel.setUserModel(userModels.get());
        List<DriverModel> driverModels = driverRepository.findAll();
        Random rn =new Random();
       int randomNum= rn.nextInt(driverModels.size() - 1 + 1) ;
        System.out.println(randomNum);
        reserveModel.setDriverModel(driverModels.get(randomNum));
        Optional <TypeTripModel> typeTripModel=typeTripRepository.findById(reserveDto.getTypeTripid());
        reserveModel.setTypeTripModel(typeTripModel.get());
        reserveRepository.save(reserveModel);
    }
    public void createAccount(UserModel userModel){
//        Wallet
//       userModel.setWallet();
        userRepository.save(userModel);}
//public void SharedReserve(ReserveModel reserveModel){
//        reserveRepository.save(reserveModel);
//}

    public List GetHistoryOfTrip(int id){
        List<ReserveModel> reserveList =new ArrayList<>();
        Iterable<ReserveModel>  reserve =reserveRepository.findAll();
        for (ReserveModel reserveModel : reserve) {


                if (reserveModel.getUserModel().getId().equals(id)){
                    reserveList.add(reserveModel);

            }
        }
        return reserveList;
    }
}
