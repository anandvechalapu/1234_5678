package com.1234.controller; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.1234.model.Publisher;
import com.1234.service.PublisherService;
import com.1234.entity.Publications;
import com.1234.service.PublicationsService;

@RestController
@RequestMapping("/api")
public class Controller {
 
    @Autowired
    private PublisherService publisherService;
    
    @Autowired
    private PublicationsService publicationsService;
    
    @GetMapping("/publishers/name/{name}")
    public Publisher findByName(@PathVariable String name) {
        return publisherService.findByName(name);
    }
    
    @GetMapping("/publishers/active/{active}")
    public Publisher findByActive(@PathVariable boolean active) {
        return publisherService.findByActive(active);
    }
    
    @GetMapping("/publishers/nameasc")
    public List<Publisher> findAllByOrderByNameAsc() {
        return publisherService.findAllByOrderByNameAsc();
    }
    
    @PostMapping("/publishers/download")
    public void downloadDataAsCsvFormat(){
        publisherService.downloadDataAsCsvFormat();
    }
    
    @PostMapping("/publishers/addoredit")
    public void addOrEditPublisher(@RequestBody Publisher publisher) {
        publisherService.addOrEditPublisher(publisher);
    }
    
    @PostMapping("/publishers/resetselection")
    public void resetSelectionToLastSearch(@RequestBody Publisher publisher) {
        publisherService.resetSelectionToLastSearch(publisher);
    }
    
    @GetMapping("/publications/name/{name}")
    public List<Publications> getPublicationsByName(@PathVariable String name) {
		return publicationsService.getPublicationsByName(name);
	}
	
	@GetMapping("/publications/publisher/{publisher}")
	public List<Publications> getPublicationsByPublisher(@PathVariable String publisher) {
		return publicationsService.getPublicationsByPublisher(publisher);
	}
	
	@GetMapping("/publications/day/{day}")
	public List<Publications> getPublicationsByDay(@PathVariable String day) {
		return publicationsService.getPublicationsByDay(day);
	}
	
	@GetMapping("/publications/name/{name}/publisher/{publisher}/day/{day}")
	public List<Publications> getPublicationsByNameAndPublisherAndDay(@PathVariable String name, @PathVariable String publisher, @PathVariable String day) {
		return publicationsService.getPublicationsByNameAndPublisherAndDay(name, publisher, day);
	}
	
	@GetMapping("/publications/active")
	public List<Publications> getAllActivePublications() {
		return publicationsService.getAllActivePublications();
	}
	
	@GetMapping("/publications/inactive")
	public List<Publications> getAllInActivePublications() {
		return publicationsService.getAllInActivePublications();
	}
	
	@GetMapping("/publications/name/{name}/active")
	public List<Publications> getActivePublicationsByName(@PathVariable String name) {
		return publicationsService.getActivePublicationsByName(name);
	}
	
	@GetMapping("/publications/name/{name}/publisher/{publisher}/active")
	public List<Publications> getActivePublicationsByNameAndPublisher(@PathVariable String name, @Path