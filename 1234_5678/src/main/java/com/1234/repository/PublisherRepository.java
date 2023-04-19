·       Validations should be done for all the fields.·       Download button should be present to download the data in .csv.·       User should be able to add/edit the publication.·       Clicking on Download Data will allow User to view the results in Excel format.

import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {

    public Publisher findByName(String name);
    
    public Publisher findByActive(boolean active);
    
    public List<Publisher> findAllByOrderByNameAsc();
    
    public void downloadDataAsCsvFormat();
    
    public void addOrEditPublisher(Publisher publisher);
    
    public void resetSelectionToLastSearch(Publisher publisher);
    
}