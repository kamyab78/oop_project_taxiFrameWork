package com.example.demo.repository;

import com.example.demo.model.ReserveModel;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ReserveRepository extends JpaRepository<ReserveModel,Long>{
}

