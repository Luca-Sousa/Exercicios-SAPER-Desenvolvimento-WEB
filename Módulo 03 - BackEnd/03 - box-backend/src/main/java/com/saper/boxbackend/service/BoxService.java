package com.saper.boxbackend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.saper.boxbackend.dto.BoxRequestDTO;
import com.saper.boxbackend.dto.BoxResponseDTO;
import com.saper.boxbackend.model.Box;
import com.saper.boxbackend.repository.BoxRepository;

import jakarta.transaction.Transactional;

@Service
public class BoxService {

    @Autowired
    BoxRepository boxRepository;

    public Object getAll() {
        return boxRepository.findAll().stream().map((box)-> new BoxResponseDTO(box));
    }

    public ResponseEntity<Object> findById(Long id) {
        Optional<Box> optionalBox = boxRepository.findById(id);

        if (optionalBox.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Box não Encontrado");
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(new BoxResponseDTO(optionalBox.get()));
        }
    }

    @Transactional
    public Object save(BoxRequestDTO boxRequestDTO) {
        Box box = new Box(boxRequestDTO);

        return new BoxResponseDTO(boxRepository.save(box));
    }

    @Transactional
    public ResponseEntity<Object> update(Long id, BoxRequestDTO boxRequestDTO) {
        Optional<Box> optionalBox = boxRepository.findById(id);

        if (optionalBox.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Box não Encontrado");
        } else {
            Box box = optionalBox.get();

            if (boxRequestDTO.name != null) {
                box.setName(boxRequestDTO.name);
            }

            if (boxRequestDTO.capacity != null) {
                box.setCapacity(boxRequestDTO.capacity);
                
            }

            return ResponseEntity.status(HttpStatus.OK).body(new BoxResponseDTO(boxRepository.save(box)));
        }
    }

    @Transactional
    public Object delete(long id) {
        Optional<Box> optionalBox = boxRepository.findById(id);

        if (optionalBox.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Box não Encontrado");
        } else {
            boxRepository.delete(optionalBox.get());

            return ResponseEntity.status(HttpStatus.OK).build();
        }
    }
}