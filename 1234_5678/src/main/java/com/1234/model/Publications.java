@Entity
package com.1234.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "Publications")
public class Publications {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @NotEmpty
  @Column(name = "name")
  private String name;
  
  @Column(name = "publisher")
  private String publisher;
  
  @Column(name = "day")
  private String day;
  
  @Column(name = "active")
  private boolean active;
  
  public Publications(){
    
  }
  
  public Publications(String name, String publisher, String day, boolean active){
    this.name = name;
    this.publisher = publisher;
    this.day = day;
    this.active = active;
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
  
  public String getPublisher() {
    return publisher;
  }
  
  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }
  
  public String getDay() {
    return day;
  }
  
  public void setDay(String day) {
    this.day = day;
  }
  
  public boolean isActive() {
    return active;
  }
  
  public void setActive(boolean active) {
    this.active = active;
  }
  
  @Override
  public String toString() {
    return "Publications [id=" + id + ", name=" + name + ", publisher=" + publisher + ", day=" + day + ", active="
        + active + "]";
  }
}