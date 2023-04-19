·       Ability to access the sub screens like edit, view and download.·       Ability to download the branches as format of .csv file.·       User able to find the sub functionalities when he clicks publications functionality.·       User able to access the sub functionalities like edit, view and download.·       User name should not be empty; username should be unique.·       In days at least one day of the week must be selected over the day option.·       The Publisher field should not be empty.·       Clicking on Download Data then it will allow user to view the results in Excel format.·       User should be allows to add/edit publication also user must have to enter the data in the fields of Name.·       If publication is active User can select Active check box.·       User should have the option of filtering the data using the drop down menu.·       Publisher - This drop down menu will allowing User to select the publisher User wish to add/edit.·       Day - This drop down menu will allowing User to select the Day User wish to add/edit.·       The Submit and Reset buttons are given on this screen.·       Once user click on Submit button it will add/edit the publication and or click on Reset button to reset the selections to the last search.

package com.1234.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.1234.model.Publications;

public interface PublicationsRepository extends JpaRepository<Publications, Long> {
	
	@Query("SELECT p FROM Publications p WHERE p.name = ?1")
	Publications findByName(String name);
	
	@Query("SELECT p FROM Publications p WHERE p.publisher = ?1")
	Publications findByPublisher(String publisher);
	
	@Query("SELECT p FROM Publications p WHERE p.day = ?1")
	Publications findByDay(String day);

}