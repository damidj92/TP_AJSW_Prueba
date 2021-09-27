package com.example.tp_prueba.services;

import com.example.tp_prueba.repositories.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {

    @Autowired
    private IPersonRepository iPersonRepository;

    public void deletePerson(String id){
        iPersonRepository.deleteById(id);
    }
}
