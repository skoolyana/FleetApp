package com.dailycodebuffer.springboot.tutorial.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

public class VehicleMaintenance {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="vehicleid", insertable=false, updatable=false)
	private Vehicle vehicle;
	private Integer vehicleid;
	
	
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date startDate;
	
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date endDate;
	
	private Double price;
	

	@ManyToOne
	@JoinColumn(name="supplierid", insertable=false, updatable=false)
	private Supplier supplier;
	private Integer supplierid;
	
	
	private String remarks;
	
}
