package com.example.tp_prueba.repositories;

import com.example.tp_prueba.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRepository extends JpaRepository<Person, String> {
}
