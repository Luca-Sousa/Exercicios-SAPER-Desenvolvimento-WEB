package com.saper.boxbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saper.boxbackend.model.Box;

@Repository
public interface BoxRepository extends JpaRepository<Box, Long> {
}
