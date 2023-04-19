package com.1234.model;

import javax.persistence.*;

@Entity
@Table(name = "publications")
public class Publications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "days")
    private String days;
    
    @Column(name = "publisher")
    private String publisher;
    
    @Column(name = "active")
    private boolean active;
    
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
    
    public String getDays() {
        return days;
    }
    
    public void setDays(String days) {
        this.days = days;
    }
    
    public String getPublisher() {
        return publisher;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public boolean isActive() {
        return active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }
}