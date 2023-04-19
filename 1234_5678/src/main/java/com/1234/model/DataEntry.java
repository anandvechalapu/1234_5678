package com.1234.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="data_entry")
public class DataEntry {

   private Long id;
   private String dataIntegrity;
   private String dataMissing;
   private String manualEdit;
   private String upload;
   private String uploadError;
   private String branchVolumeUpload;
   
   //getters and setters

}