package com.dailycodebuffer.springboot.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dailycodebuffer.springboot.tutorial.model.InvoiceStatus;

public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus, Integer>{

	
}
