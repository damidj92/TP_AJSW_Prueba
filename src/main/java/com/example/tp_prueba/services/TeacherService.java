package com.example.tp_prueba.services;

import com.example.tp_prueba.models.Teacher;
import com.example.tp_prueba.repositories.ITeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private ITeacherRepository iTeacherRepository;

    public Teacher saveTeacher(Teacher teacher){
        return iTeacherRepository.save(teacher);
    }

    public List<Teacher> getAllTeachers(){
        return iTeacherRepository.findAll();
    }
}
