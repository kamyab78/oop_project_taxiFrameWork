package com.example.demo.repository;

import com.example.demo.model.ReserveModel;
import com.example.demo.model.WalletModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<WalletModel,Long> {
}
