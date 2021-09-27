package com.example.tp_prueba.services;

import com.example.tp_prueba.models.Student;
import com.example.tp_prueba.repositories.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private IStudentRepository iStudentRepository;

    public Student saveStudent(Student student){
        return iStudentRepository.save(student);
    }

    public List<Student> getAllStudents(){
        return iStudentRepository.findAll();
    }


}
