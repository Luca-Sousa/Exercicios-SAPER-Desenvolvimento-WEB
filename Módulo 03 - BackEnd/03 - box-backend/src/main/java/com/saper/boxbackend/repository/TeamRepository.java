package com.saper.boxbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saper.boxbackend.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long>{
    
}
