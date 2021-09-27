package com.example.tp_prueba.repositories;

import com.example.tp_prueba.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<Student, String> {
}
