package com.1234.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class DataIntegrity {
 
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
 
   private String branch;
 
   private String publication;
 
   private boolean dataEntry;
 
   private Date date;
 
   private boolean complete;
 
   private boolean missing;
 
   public Integer getId() {
      return id;
   }
 
   public void setId(Integer id) {
      this.id = id;
   }
 
   public String getBranch() {
      return branch;
   }
 
   public void setBranch(String branch) {
      this.branch = branch;
   }
 
   public String getPublication() {
      return publication;
   }
 
   public void setPublication(String publication) {
      this.publication = publication;
   }
 
   public boolean isDataEntry() {
      return dataEntry;
   }
 
   public void setDataEntry(boolean dataEntry) {
      this.dataEntry = dataEntry;
   }
 
   public Date getDate() {
      return date;
   }
 
   public void setDate(Date date) {
      this.date = date;
   }
 
   public boolean isComplete() {
      return complete;
   }
 
   public void setComplete(boolean complete) {
      this.complete = complete;
   }
 
   public boolean isMissing() {
      return missing;
   }
 
   public void setMissing(boolean missing) {
      this.missing = missing;
   }
}