package com.saper.boxbackend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.saper.boxbackend.dto.TeamRequestDTO;
import com.saper.boxbackend.dto.TeamResponseDTO;
import com.saper.boxbackend.model.Box;
import com.saper.boxbackend.model.Team;
import com.saper.boxbackend.repository.BoxRepository;
import com.saper.boxbackend.repository.TeamRepository;

import jakarta.transaction.Transactional;

@Service
public class TeamService {

    @Autowired
    TeamRepository teamRepository;

    @Autowired
    BoxRepository boxRepository;

    @Transactional
    public ResponseEntity<Object> save(TeamRequestDTO teamRequestDTO) {

        //VERIFICAR SE O BOX EXISTE
        Optional<Box> optionalBox = boxRepository.findById(teamRequestDTO.box_id);

        if (optionalBox.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Box não Encontrado!");
        }

        Team team = new Team();
        team.setSchedule(teamRequestDTO.schedule);
        team.setBox(optionalBox.get());

        teamRepository.save(team);

        return ResponseEntity.status(HttpStatus.CREATED).body(new TeamResponseDTO(team));
    }
}
