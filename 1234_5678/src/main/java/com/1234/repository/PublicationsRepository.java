·       User should be allowed to view the data in Excel format.·       User should be allowed to filter the data using the drop down menu.·       User should be allowed to add/edit publication.·       User name should not be empty; username should be unique.

@Repository
package com.1234.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.1234.entity.Publications;

public interface PublicationsRepository extends JpaRepository<Publications, Long> {

  List<Publications> findByName(String name);

  List<Publications> findByPublisher(String publisher);

  List<Publications> findByDay(String day);

  @Query("SELECT p FROM Publications p WHERE p.name = :name AND p.publisher = :publisher AND p.day = :day")
  List<Publications> findByNameAndPublisherAndDay(String name, String publisher, String day);

  @Query("SELECT p FROM Publications p WHERE p.active = true")
  List<Publications> findAllActivePublications();
  
  @Query("SELECT p FROM Publications p WHERE p.active = false")
  List<Publications> findAllInActivePublications();
  
  @Query("SELECT p FROM Publications p WHERE p.name = :name AND p.active = true")
  List<Publications> findActivePublicationsByName(String name);
  
  @Query("SELECT p FROM Publications p WHERE p.name = :name AND p.publisher = :publisher AND p.active = true")
  List<Publications> findActivePublicationsByNameAndPublisher(String name, String publisher);
  
  @Query("SELECT p FROM Publications p WHERE p.name = :name AND p.day = :day AND p.active = true")
  List<Publications> findActivePublicationsByNameAndDay(String name, String day);
}