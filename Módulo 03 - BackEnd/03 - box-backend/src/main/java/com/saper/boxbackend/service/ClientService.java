package com.saper.boxbackend.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.saper.boxbackend.dto.ClientRequestDTO;
import com.saper.boxbackend.dto.ClientResponseDTO;
import com.saper.boxbackend.model.Client;
import com.saper.boxbackend.repository.ClientRepository;

import jakarta.transaction.Transactional;

@Service
public class ClientService {

    @Autowired
    ClientRepository clientRepository;

    public Object getAllByName(String name){

        if (name.equals("")) {
            return clientRepository.findAll().stream().map((client -> new ClientResponseDTO(client)));
        } else {
            return clientRepository.findAllByNameContaining(name).stream().map((client -> new ClientResponseDTO(client)));
        }
    }

    public ResponseEntity<Object> findById(Long id) {
        Optional<Client> optionalClient = clientRepository.findById(id);

        if (optionalClient.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não Encontrado");
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(new ClientResponseDTO(optionalClient.get()));
        }
    }

    @Transactional
    public Object save(ClientRequestDTO clientRequestDTO){
        Client client = new Client(clientRequestDTO); //CRIANDO UM CLIENTE

        client = clientRepository.save(client); //SALVANDO O CLIENTE

        ClientResponseDTO clientResponseDTO = new ClientResponseDTO(client);

        return clientResponseDTO; //RETORNANDO OS DADOS DO CLIENTE, SEM A SENHA
    }

    @Transactional
    public Object update(Long id, ClientRequestDTO clientRequestDTO) {
        Optional<Client> optionalClient = clientRepository.findById(id);

        if (optionalClient.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não Encontrado");
        } else {
            Client client = optionalClient.get();

            if (clientRequestDTO.name != null) {
                client.setName((clientRequestDTO.name));
            }

            if (clientRequestDTO.password != null) {
                client.setPassword((clientRequestDTO.password));
            }

            return ResponseEntity.status(HttpStatus.OK).body(new ClientResponseDTO(clientRepository.save(client)));
        }
    }

    @Transactional
    public ResponseEntity<Object> delete(Long id) {
        Optional<Client> optionalClient = clientRepository.findById(id);

        if (optionalClient.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente não Encontrado");
        } else {
            clientRepository.delete(optionalClient.get());

            return ResponseEntity.status(HttpStatus.OK).build();
        }
    }
}