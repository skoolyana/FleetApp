package com.dailycodebuffer.springboot.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycodebuffer.springboot.tutorial.model.VehicleType;

@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {

}