package com.example.demo.service;

import com.example.demo.dto.CreateAcoountUserDto;
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
        reserveModel.setStart_time(reserveDto.getStart_time());

        reserveModel.setDistanse(reserveDto.getDistanse());
        Optional<UserModel> userModels = userRepository.findById(reserveDto.getUid());
        Optional <TypeTripModel> typeTripModel=typeTripRepository.findById(reserveDto.getTypeTripid());
        System.out.println(typeTripModel);
        reserveModel.setTypeTripModel(typeTripModel.get());
        reserveModel.setUserModel(userModels.get());
        List<DriverModel> driverModels = driverRepository.findAll();
        Random rn =new Random();
       int randomNum= rn.nextInt(driverModels.size() - 1 + 1) ;
        System.out.println(randomNum);
        reserveModel.setDriverModel(driverModels.get(randomNum));

        reserveRepository.save(reserveModel);
    }
    public void createAccount(CreateAcoountUserDto createAcoountUserDto){
        UserModel userModel=new UserModel();
        userModel.setUsername(createAcoountUserDto.getUsername());
        userModel.setFamily(createAcoountUserDto.getFamily());
        userModel.setName(createAcoountUserDto.getName());
        userModel.setPass(createAcoountUserDto.getPass());
//        Wallet
//       userModel.setWallet();
        userRepository.save(userModel);}
//public void SharedReserve(ReserveModel reserveModel){
//        reserveRepository.save(reserveModel);
//}

    public List<String> GetHistoryOfTrip(int id){
        List<String> reserveList =new ArrayList<>();
        Iterable<ReserveModel>  reserve =reserveRepository.findAll();
        for (ReserveModel reserveModel : reserve) {

                if (reserveModel.getUserModel().getId()==id){
                    reserveList.add(reserveModel.getCity());

            }
        }
        return reserveList;
    }
}
