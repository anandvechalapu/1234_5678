package com.1234.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.1234.model.Publications;
import com.1234.repository.PublicationsRepository;

@Service
public class PublicationsService {

	@Autowired
	private PublicationsRepository repository;
	
	public List<Publications> findAll() {
		return repository.findAll();
	}
	
	public Optional<Publications> findById(Long id) {
		return repository.findById(id);
	}
	
	public Publications findByName(String name) {
		return repository.findByName(name);
	}	
	
	public Publications findByPublisher(String publisher) {
		return repository.findByPublisher(publisher);
	}
	
	public Publications findByDay(String day) {
		return repository.findByDay(day);
	}
	
	public Publications save(Publications publication) {
		return repository.save(publication);
	}
	
	public void deleteById(Long id) {
		repository.deleteById(id);
	}
	
	public void deleteAll() {
		repository.deleteAll();
	}
	
	public void downloadCsv(){
		// code to download csv file
	}
	
	public void editPublication(Publications publication){
		// code to edit publication
	}
	
	public void viewPublication(Publications publication){
		// code to view publication
	}
	
	public void checkUsername(String username){
		// code to check username
	}
	
	public void checkDay(String day){
		// code to check day
	}
	
	public void checkPublisher(String publisher){
		// code to check publisher
	}
	
	public void downloadData(){
		// code to download data in Excel format
	}
	
	public void addPublication(Publications publication){
		// code to add publication
	}
	
	public void filterData(){
		// code to filter data
	}
	
	public void submitPublication(){
		// code to submit publication
	}
	
	public void resetPublication(){
		// code to reset publication
	}
	
}