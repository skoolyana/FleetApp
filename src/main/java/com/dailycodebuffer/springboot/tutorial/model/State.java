package com.dailycodebuffer.springboot.tutorial.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class State {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;	
	private String name;
	private String capital;
    private String code;
    
    @ManyToOne
	@JoinColumn(name="countryid", insertable=false, updatable=false)
	private Country country;
	
	private Integer countryid;
	
	private String details;
	

}
