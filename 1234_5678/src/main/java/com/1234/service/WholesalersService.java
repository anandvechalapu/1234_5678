package com.1234.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.1234.model.Wholesalers;
import com.1234.repository.WholesalersRepository;

@Service
public class WholesalersService {

	@Autowired
	private WholesalersRepository wholesalersRepository;
	
	public Wholesalers findByName(String name) {
		return wholesalersRepository.findByName(name);
	}
	
	public Wholesalers findByNumber(String number) {
		return wholesalersRepository.findByNumber(number);
	}
	
	public Wholesalers findByType(String type) {
		return wholesalersRepository.findByType(type);
	}
	
	public Wholesalers findByContactName(String contactName) {
		return wholesalersRepository.findByContactName(contactName);
	}
	
	public Wholesalers findByEmailAddress(String emailAddress) {
		return wholesalersRepository.findByEmailAddress(emailAddress);
	}
	
	public Wholesalers findByActive(boolean active) {
		return wholesalersRepository.findByActive(active);
	}
	
	public Wholesalers findByDateCreated(String dateCreated) {
		return wholesalersRepository.findByDateCreated(dateCreated);
	}
	
	public Wholesalers findByLastModified(String lastModified) {
		return wholesalersRepository.findByLastModified(lastModified);
	}
	
	public Wholesalers save(Wholesalers wholesalers) {
		return wholesalersRepository.save(wholesalers);
	}
	
	public void delete(Wholesalers wholesalers) {
		wholesalersRepository.delete(wholesalers);
	}
	
	public Wholesalers downloadData() {
		return wholesalersRepository.downloadData();
	}
	
	public List<Wholesalers> filterData(String type) {
		return wholesalersRepository.filterData(type);
	}
	
	public Wholesalers submitData() {
		return wholesalersRepository.submitData();
	}
	
	public Wholesalers resetData() {
		return wholesalersRepository.resetData();
	}

}