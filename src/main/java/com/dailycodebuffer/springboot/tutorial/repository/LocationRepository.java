package com.dailycodebuffer.springboot.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dailycodebuffer.springboot.tutorial.model.Location;

public interface LocationRepository extends JpaRepository<Location, Integer>  {

}
