package com.dailycodebuffer.springboot.tutorial.service;

import java.util.List;
import java.util.Optional;

import com.dailycodebuffer.springboot.tutorial.model.Country;

public interface CountryService {

	public List<Country> getCountries(); 

	public void save(Country country); 

	public Optional<Country> findById(int id);
	
	public void delete(Integer id);
	
}
