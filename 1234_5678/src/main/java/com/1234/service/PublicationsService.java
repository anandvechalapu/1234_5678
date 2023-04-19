@Service
package com.1234.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.1234.entity.Publications;
import com.1234.repository.PublicationsRepository;

@Service
public class PublicationsService {

	@Autowired
	private PublicationsRepository publicationsRepository;
	
	public List<Publications> getPublicationsByName(String name) {
		return publicationsRepository.findByName(name);
	}
	
	public List<Publications> getPublicationsByPublisher(String publisher) {
		return publicationsRepository.findByPublisher(publisher);
	}
	
	public List<Publications> getPublicationsByDay(String day) {
		return publicationsRepository.findByDay(day);
	}
	
	public List<Publications> getPublicationsByNameAndPublisherAndDay(String name, String publisher, String day) {
		return publicationsRepository.findByNameAndPublisherAndDay(name, publisher, day);
	}
	
	public List<Publications> getAllActivePublications() {
		return publicationsRepository.findAllActivePublications();
	}
	
	public List<Publications> getAllInActivePublications() {
		return publicationsRepository.findAllInActivePublications();
	}
	
	public List<Publications> getActivePublicationsByName(String name) {
		return publicationsRepository.findActivePublicationsByName(name);
	}
	
	public List<Publications> getActivePublicationsByNameAndPublisher(String name, String publisher) {
		return publicationsRepository.findActivePublicationsByNameAndPublisher(name, publisher);
	}
	
	public List<Publications> getActivePublicationsByNameAndDay(String name, String day) {
		return publicationsRepository.findActivePublicationsByNameAndDay(name, day);
	}
	
	public void addPublication(Publications publication) {
		if (publication.getName() == null || publication.getName().isEmpty()) {
			throw new IllegalArgumentException("Publication name cannot be empty");
		}
		if (publicationsRepository.existsByName(publication.getName())) {
			throw new IllegalArgumentException("Publication with same name already exists");
		}
		publicationsRepository.save(publication);
	}
	
	public void editPublication(Publications publication) {
		if (publication.getName() == null || publication.getName().isEmpty()) {
			throw new IllegalArgumentException("Publication name cannot be empty");
		}
		if (publicationsRepository.existsByName(publication.getName())) {
			throw new IllegalArgumentException("Publication with same name already exists");
		}
		publicationsRepository.save(publication);
	}

}