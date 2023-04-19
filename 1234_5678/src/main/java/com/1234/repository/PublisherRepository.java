·       Ability to access the sub screens like edit, view and download.·       Ability to download the publications as format of .csv file·       Ability to find the sub functionalities when he clicks publisher’s functionality.·       Ability to access the sub functionalities like edit, view and download.·       Ability to add/edit/view/download publication.·       User name should not be empty; username should be unique.·       Clicking on Download Data should allow User to view the results in Excel format.·       User should be allowed to add/edit publication also user must have to enter the data in the fields of Name.·       If publication is active User should be able to select Active check box.·       User should have Submit and Reset buttons on this screen.·       Once User have made User selections click on Submit it should add/edit the publication, or click on Reset to reset the selections to the last search.
Solution:

package com.1234.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.1234.model.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {

    // Get a list of all publishers
    @Query("SELECT p FROM Publisher p")
    List<Publisher> findAllPublishers();

    // Add a new publisher
    void addPublisher(Publisher publisher);

    // Edit an existing publisher
    void editPublisher(Publisher publisher);

    // Download data as a csv file
    @Query("SELECT p.name, p.active FROM Publisher p")
    List<Object[]> downloadPublishersAsCsv();

    // Find a publisher by name
    @Query("SELECT p FROM Publisher p WHERE p.name = :name")
    Publisher findPublisherByName(@Param("name") String name);

    // Check if a publisher name is unique
    @Query("SELECT COUNT(p) FROM Publisher p WHERE p.name = :name")
    int checkIfPublisherNameUnique(@Param("name") String name);

    // Get a list of active publishers
    @Query("SELECT p FROM Publisher p WHERE p.active = true")
    List<Publisher> findActivePublishers();
}