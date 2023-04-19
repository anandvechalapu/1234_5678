package com.1234.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.1234.repository.PublisherRepository;
import com.1234.model.Publisher;

@Service
public class PublisherService {
 
    @Autowired
    private PublisherRepository publisherRepository;
    
    public Publisher findByName(String name) {
        return publisherRepository.findByName(name);
    }
    
    public Publisher findByActive(boolean active) {
        return publisherRepository.findByActive(active);
    }
    
    public List<Publisher> findAllByOrderByNameAsc() {
        return publisherRepository.findAllByOrderByNameAsc();
    }
    
    public void downloadDataAsCsvFormat(){
        publisherRepository.downloadDataAsCsvFormat();
    }
    
    public void addOrEditPublisher(Publisher publisher) {
        publisherRepository.addOrEditPublisher(publisher);
    }
    
    public void resetSelectionToLastSearch(Publisher publisher) {
        publisherRepository.resetSelectionToLastSearch(publisher);
    }
    
    public boolean validatePublisher(Publisher publisher) {
        if (publisher.getName() == null || publisher.getName().isEmpty()) {
            return false;
        }
        if (publisher.getActive() == null) {
            return false;
        }
        return true;
    }
}