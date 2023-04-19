package com.1234.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.1234.model.Publications;
import com.1234.repository.PublicationsRepository;

@Service
public class PublicationsService {
    @Autowired
    private PublicationsRepository publicationsRepository;

    public List<Publications> findByName(String name) {
        return publicationsRepository.findByName(name);
    }

    public List<Publications> findByDays(String days) {
        return publicationsRepository.findByDays(days);
    }

    public List<Publications> findByPublisher(String publisher) {
        return publicationsRepository.findByPublisher(publisher);
    }

    public Publications save(Publications publications) {
        return publicationsRepository.save(publications);
    }

    public void delete(Publications publications) {
        publicationsRepository.delete(publications);
    }

    public void downloadData(String data) {
        publicationsRepository.downloadData(data);
    }

    public List<Publications> findByActive(boolean active) {
        return publicationsRepository.findByActive(active);
    }

    public List<Publications> filterByDropdownMenu(String selection) {
        return publicationsRepository.filterByDropdownMenu(selection);
    }

    public void resetSelectionToLastSearch() {
        publicationsRepository.resetSelectionToLastSearch();
    }
}