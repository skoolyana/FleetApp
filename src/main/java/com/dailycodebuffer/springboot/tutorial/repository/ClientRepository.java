package com.dailycodebuffer.springboot.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dailycodebuffer.springboot.tutorial.model.Client;

public interface ClientRepository  extends JpaRepository<Client, Integer> {

}
