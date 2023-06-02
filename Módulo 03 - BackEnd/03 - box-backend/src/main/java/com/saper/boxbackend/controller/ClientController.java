package com.saper.boxbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.saper.boxbackend.dto.ClientRequestDTO;
import com.saper.boxbackend.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService clientService;
    
    @GetMapping
    public Object getAllByName(@RequestParam(name = "name", defaultValue = "") String name) {
        return clientService.getAllByName(name);
    }

    @GetMapping("/{id}")
    public Object getOne(@PathVariable(name = "id") Long id) {
        return clientService.findById(id);
    }

    @PostMapping
    public Object save(@RequestBody ClientRequestDTO clientRequestDTO) {
        
        return clientService.save(clientRequestDTO);
    }

    @PutMapping("/{id}")
    public Object update(@PathVariable(name = "id") Long id,
                         @RequestBody ClientRequestDTO clientRequestDTO) {
        
        return clientService.update(id, clientRequestDTO);
    }

    @DeleteMapping("/{id}")
    public Object delete(@PathVariable(name = "id") Long id) {

        return clientService.delete(id);
    }
}
