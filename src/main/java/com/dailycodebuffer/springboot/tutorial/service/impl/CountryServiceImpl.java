package com.dailycodebuffer.springboot.tutorial.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailycodebuffer.springboot.tutorial.model.Country;
import com.dailycodebuffer.springboot.tutorial.repository.CountryRepository;
import com.dailycodebuffer.springboot.tutorial.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepository countryRepository;

	// Return List Of Countries
	
	@Override
	public List<Country> getCountries() {
		// TODO Auto-generated method stub
		return countryRepository.findAll();
	}

	@Override
	public void save(Country country) {
		// TODO Auto-generated method stub
	
		 countryRepository.save(country);
		
	}

	@Override
	public Optional<Country> findById(int id) {
		// TODO Auto-generated method stub
		return countryRepository.findById(id);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
		countryRepository.deleteById(id);
	}

	
	
}
