·       Ability to find the sub functionalities when data entry functionality clicked.·       Ability to access the options when I data integrity and the options are: Data Integrity, Data missing, manual edit, upload, upload error, Branch volume upload.

package com.1234.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DataEntryRepository extends JpaRepository<DataEntry, Long> {
   
   List<DataEntry> findByDataIntegrity();

   List<DataEntry> findByDataMissing();

   List<DataEntry> findByManualEdit();

   List<DataEntry> findByUpload();

   List<DataEntry> findByUploadError();

   List<DataEntry> findByBranchVolumeUpload();

}