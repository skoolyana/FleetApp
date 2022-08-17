package com.dailycodebuffer.springboot.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dailycodebuffer.springboot.tutorial.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

	
}
