package com.example.demo.repository;

import com.example.demo.model.TypeTripModel;
import com.example.demo.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeTripRepository extends JpaRepository<TypeTripModel,Long> {
}
