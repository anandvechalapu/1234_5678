Ability to enter details in the fields.Ability to view a list of Branch and Publication files that have been entered.Ability to reset the date and Complete/Missing fields.Ability to download the result in Excel format.

import org.springframework.data.jpa.repository.JpaRepository;

public interface DataIntegrityRepository extends JpaRepository<DataIntegrity, Integer> {
 
   List<DataIntegrity> findByDataEntry(boolean dataEntry);
 
   List<DataIntegrity> findByCompleteAndMissing(boolean complete, boolean missing);
 
   List<DataIntegrity> findByDate(Date date);
 
   void resetDataIntegrity(Date date, boolean complete, boolean missing);
 
   byte[] downloadDataIntegrityInExcelFormat();
}