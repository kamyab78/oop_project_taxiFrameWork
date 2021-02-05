package com.example.demo.repository;

import com.example.demo.model.DriverModel;
import com.example.demo.model.PaymentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<DriverModel,Long> {
}
