package com.saper.boxbackend.model;

import java.util.Set;

import com.saper.boxbackend.dto.BoxRequestDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Box {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Box_id")
    Long id;
    
    String name;

    Integer capacity;

    String created_by;

    @OneToMany(mappedBy = "box")
    Set<Team> teams;

    public Box() {
        
    }

    public Box(BoxRequestDTO boxRequestDTO) {
        this.name = boxRequestDTO.name;
        this.capacity = boxRequestDTO.capacity;
        this.created_by = "Admin";
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

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public Box(Long id, String name, Integer capacity, String created_by) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.created_by = created_by;
    }

    public Set<Team> getTeams() {
        return teams;
    }

    public void setTeams(Set<Team> teams) {
        this.teams = teams;
    }
}
