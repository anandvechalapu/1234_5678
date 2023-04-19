package com.1234.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.1234.model.Publisher;
import com.1234.model.Publications;
import com.1234.service.PublisherService;
import com.1234.service.PublicationsService;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	private PublisherService publisherService;
	
	@Autowired
	private PublicationsService publicationsService;
	
	@GetMapping("/publishers")
	public List<Publisher> getAllPublishers(){
		return publisherService.getAllPublishers();
	}
	
	@PostMapping("/publishers")
	public void addPublisher(@RequestBody Publisher publisher){
		publisherService.addPublisher(publisher);
	}
	
	@PutMapping("/publishers")
	public void editPublisher(@RequestBody Publisher publisher){
		publisherService.editPublisher(publisher);
	}
	
	@GetMapping("/publishers/csv")
	public List<Object[]> downloadPublishersAsCsv(){
		return publisherService.downloadPublishersAsCsv();
	}
	
	@GetMapping("/publishers/name/{name}")
	public Publisher findPublisherByName(@PathVariable String name){
		return publisherService.findPublisherByName(name);
	}
	
	@GetMapping("/publishers/unique/{name}")
	public int checkIfPublisherNameUnique(@PathVariable String name){
		return publisherService.checkIfPublisherNameUnique(name);
	}
	
	@GetMapping("/publishers/active")
	public List<Publisher> getActivePublishers(){
		return publisherService.getActivePublishers();
	}
	
	@GetMapping("/publications")
	public List<Publications> findAll(){
		return publicationsService.findAll();
	}
	
	@GetMapping("/publications/{id}")
	public Optional<Publications> findById(@PathVariable Long id){
		return publicationsService.findById(id);
	}
	
	@GetMapping("/publications/name/{name}")
	public Publications findByName(@PathVariable String name){
		return publicationsService.findByName(name);
	}
	
	@GetMapping("/publications/publisher/{publisher}")
	public Publications findByPublisher(@PathVariable String publisher){
		return publicationsService.findByPublisher(publisher);
	}
	
	@GetMapping("/publications/day/{day}")
	public Publications findByDay(@PathVariable String day){
		return publicationsService.findByDay(day);
	}
	
	@PostMapping("/publications")
	public Publications save(@RequestBody Publications publication){
		return publicationsService.save(publication);
	}
	
	@DeleteMapping("/publications/{id}")
	public void deleteById(@PathVariable Long id){
		publicationsService.deleteById(id);
	}
	
	@DeleteMapping("/publications")
	public void deleteAll(){
		publicationsService.deleteAll();
	}
	
	@GetMapping("/publications/csv")
	public void downloadCsv(){
		publicationsService.downloadCsv();
	}
	
	@PutMapping("/publications")
	public void editPublication(