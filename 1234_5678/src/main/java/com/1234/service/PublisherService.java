package com.1234.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.1234.model.Publisher;
import com.1234.repository.PublisherRepository;

@Service
public class PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;

    // Get a list of all publishers
    public List<Publisher> getAllPublishers() {
        return publisherRepository.findAllPublishers();
    }

    // Add a new publisher
    public void addPublisher(Publisher publisher) {
        publisherRepository.addPublisher(publisher);
    }

    // Edit an existing publisher
    public void editPublisher(Publisher publisher) {
        publisherRepository.editPublisher(publisher);
    }

    // Download data as a csv file
    public List<Object[]> downloadPublishersAsCsv() {
        return publisherRepository.downloadPublishersAsCsv();
    }

    // Find a publisher by name
    public Publisher findPublisherByName(String name) {
        return publisherRepository.findPublisherByName(name);
    }

    // Check if a publisher name is unique
    public int checkIfPublisherNameUnique(String name) {
        return publisherRepository.checkIfPublisherNameUnique(name);
    }

    // Get a list of active publishers
    public List<Publisher> getActivePublishers() {
        return publisherRepository.findActivePublishers();
    }
}