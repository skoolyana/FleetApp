package com.dailycodebuffer.springboot.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dailycodebuffer.springboot.tutorial.model.VehicleModel;

public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
