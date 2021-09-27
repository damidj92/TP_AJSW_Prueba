package com.example.tp_prueba.repositories;

import com.example.tp_prueba.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITeacherRepository extends JpaRepository<Teacher, String> {
}
