·       User should have the option of filtering the data using the drop down menu.·       User should able to access the sub screens like edit, view and download.·       Ability to download the publications as .csv file.·       User should be allows to add/edit publication also user must have to enter the data in the fields of Name.·       If publication is active User can select Active check box.·       The Submit and Reset buttons are given on this screen.

import org.springframework.data.jpa.repository.JpaRepository;

public interface PublicationsRepository extends JpaRepository<Publications, Long> {
    List<Publications> findByName(String name);
    List<Publications> findByDays(String days);
    List<Publications> findByPublisher(String publisher);
    Publications save(Publications publications);
    void delete(Publications publications);
    void downloadData(String data);
    List<Publications> findByActive(boolean active);
    List<Publications> filterByDropdownMenu(String selection); 
    void resetSelectionToLastSearch();
}