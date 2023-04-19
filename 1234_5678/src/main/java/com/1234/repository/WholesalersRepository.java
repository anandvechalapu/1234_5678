Ability to edit, view and download the wholesalers.  ·       Ability to download the branches as format of .csv file  ·       User able to find the sub functionalities when he clicks user’s functionality.  ·       User able to access the sub functionalities like edit, view and download.  ·       If user has access then user able to access this page.  ·       If user didn’t have access then redirect to login page.  ·       User name should not be empty; username should be unique.  ·       Number should not be empty and should be number "/^\d+$/" and should be unique.  ·       Clicking on Download Data will allow User to view the results in Excel format.  ·       User have the option of filtering the data using the drop down menu  ·       Type - This drop down menu will allowing User to select the type User wish to add/edit.  ·       The Submit and Reset buttons are given on this screen.  ·       Once User have made User selections click on Submit it will add/edit the wholesaler, or click on Reset to reset the selections to the last search.

package com.1234.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.1234.model.Wholesalers;

@Repository
public interface WholesalersRepository extends JpaRepository<Wholesalers, Long> {
	
	public Wholesalers findByName(String name);
	
	public Wholesalers findByNumber(String number);
	
	public Wholesalers findByType(String type);
	
	public Wholesalers findByContactName(String contactName);
	
	public Wholesalers findByEmailAddress(String emailAddress);
	
	public Wholesalers findByActive(boolean active);
	
	public Wholesalers findByDateCreated(String dateCreated);
	
	public Wholesalers findByLastModified(String lastModified);
	
	public Wholesalers save(Wholesalers wholesalers);
	
	public void delete(Wholesalers wholesalers);
	
	public Wholesalers downloadData();
	
	public Wholesalers filterData(String type);
	
	public Wholesalers submitData();
	
	public Wholesalers resetData();
	
}