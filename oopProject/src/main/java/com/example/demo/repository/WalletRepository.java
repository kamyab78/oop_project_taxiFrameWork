package com.example.demo.repository;

import com.example.demo.model.ReserveModel;
import com.example.demo.model.WalletModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface WalletRepository extends JpaRepository<WalletModel,Long> {
    @Query(value = "SELECT * FROM wallet WHERE wallet.user_id = :id", nativeQuery = true)
    List<WalletModel>  findWalletbyid(@Param("id") Long id);
   // @Query("select * from WalletModel wallet where user_id = :id")
   // List<WalletModel> findWalletbyid(@Param("id") Long id);
}
