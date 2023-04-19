package com.1234.service;

import com.1234.model.Publisher;
import com.1234.repository.PublishersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PublishersService {

    @Autowired
    private PublishersRepository publishersRepository;

    /**
     * Get the list of publishers
     * @return List of publishers
     */
    public List<Publisher> getPublishers() {
        return publishersRepository.findAll();
    }

    /**
     * Get the list of publishers by name
     * @param name The name of the publisher
     * @return List of publishers
     */
    public List<Publisher> getPublishersByName(String name) {
        return publishersRepository.findByName(name);
    }

    /**
     * Get the list of active publishers
     * @return List of active publishers
     */
    public List<Publisher> getActivePublishers() {
        return publishersRepository.findByActive(true);
    }

    /**
     * Add a publisher
     * @param publisher The publisher to add
     */
    public void addPublisher(Publisher publisher) {
        publishersRepository.save(publisher);
    }

    /**
     * Edit a publisher
     * @param publisher The publisher to edit
     */
    public void editPublisher(Publisher publisher) {
        publishersRepository.save(publisher);
    }

    /**
     * Delete a publisher
     * @param publisher The publisher to delete
     */
    public void deletePublisher(Publisher publisher) {
        publishersRepository.delete(publisher);
    }

    /**
     * Download the list of publishers as CSV file
     * @return The CSV file
     */
    public String downloadPublishersAsCSV() {
        // TODO: Implement CSV download
        return "";
    }

}