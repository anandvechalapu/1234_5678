·       Ability to access the sub screens like edit, view and download.·       Ability to download the branches as format of .csv file.·       User able to find the sub functionalities when he clicks publisher’s functionality.·       User able to access the sub functionalities like edit, view and download.·       If user has permission then user should able to access this page.·       If user didn’t have permission then redirect to login page.·       User name should not be empty; username should be unique.·       Clicking on Download Data will allow User to view the results in Excel format.·       User should be allows to add/edit publication also user must have to enter the data in the fields of Name.·       If publication is active User can select Active check box.·       User should have Submit and Reset buttons on this screen.·       Once User have made User selections click on Submit it will add/edit the publication, or click on Reset to reset the selections to the last search.

package com.1234.repository;

import com.1234.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PublishersRepository extends JpaRepository<Publisher, Long> {

    @Query("SELECT p FROM Publisher p WHERE p.name=:name")
    List<Publisher> findByName(@Param("name") String name);

    @Query("SELECT p FROM Publisher p WHERE p.active=:active")
    List<Publisher> findByActive(@Param("active") boolean active);
}