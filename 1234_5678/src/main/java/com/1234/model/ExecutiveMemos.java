// Model Class
package com.1234.model;

import javax.persistence.*;

@Entity
@Table(name = "executive_memos")
public class ExecutiveMemos {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
 
    @Column(name = "memo")
    private String memo;
 
    @Column(name = "date_created")
    private String dateCreated;
 
    @Column(name = "dow")
    private String dow;
 
    @Column(name = "access")
    private boolean access;
 
    @Column(name = "field_name")
    private String fieldName;
 
    @Column(name = "description_prompt")
    private String descriptionPrompt;
 
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getMemo() {
        return memo;
    }
 
    public void setMemo(String memo) {
        this.memo = memo;
    }
 
    public String getDateCreated() {
        return dateCreated;
    }
 
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
 
    public String getDow() {
        return dow;
    }
 
    public void setDow(String dow) {
        this.dow = dow;
    }
 
    public boolean isAccess() {
        return access;
    }
 
    public void setAccess(boolean access) {
        this.access = access;
    }
 
    public String getFieldName() {
        return fieldName;
    }
 
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
 
    public String getDescriptionPrompt() {
        return descriptionPrompt;
    }
 
    public void setDescriptionPrompt(String descriptionPrompt) {
        this.descriptionPrompt = descriptionPrompt;
    }
 
    @Override
    public String toString() {
        return "ExecutiveMemos{" +
                "id=" + id +
                ", memo='" + memo + '\'' +
                ", dateCreated='" + dateCreated + '\'' +
                ", dow='" + dow + '\'' +
                ", access=" + access +
                ", fieldName='" + fieldName + '\'' +
                ", descriptionPrompt='" + descriptionPrompt + '\'' +
                '}';
    }
}