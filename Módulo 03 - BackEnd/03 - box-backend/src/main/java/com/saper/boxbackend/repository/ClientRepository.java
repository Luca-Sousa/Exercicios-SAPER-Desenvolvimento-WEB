package com.saper.boxbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saper.boxbackend.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    List<Client> findAllByNameContaining(String name);

}