import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Publisher {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(max=50)
    private String name;
    
    @NotNull
    private boolean active;
    
    public Publisher() {
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public boolean isActive() {
        return active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }
    
    public void downloadDataAsCsvFormat() {
        //Download data as .csv format
    }
    
    public void addOrEditPublisher(Publisher publisher) {
        // Add/Edit the publication
    }
    
    public void resetSelectionToLastSearch(Publisher publisher) {
        // Reset selection to last search
    }
    
}