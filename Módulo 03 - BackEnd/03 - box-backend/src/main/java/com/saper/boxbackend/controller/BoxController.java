package com.saper.boxbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saper.boxbackend.dto.BoxRequestDTO;
import com.saper.boxbackend.service.BoxService;

@RestController
@RequestMapping("/box")
public class BoxController {

    @Autowired
    BoxService boxService;

    @GetMapping
    public Object getAll(){

        return boxService.getAll();
    }

    @GetMapping("/{id}")
    public Object getOne(@PathVariable(name = "id") Long id) {

        return boxService.findById(id);
    }

    @PostMapping
    public Object save(@RequestBody BoxRequestDTO boxRequestDTO){

        return boxService.save(boxRequestDTO);
    }

    @PutMapping("/{id}")
    public Object update(@PathVariable(name = "id") Long id,
                         @RequestBody BoxRequestDTO boxRequestDTO) {
        
        return boxService.update(id, boxRequestDTO);
    }

    @DeleteMapping("/{id}")
    public Object delete(@PathVariable(name = "id") long id) {

        return boxService.delete(id);
    }
}