package com.example.tp_prueba.controllers;

import com.example.tp_prueba.models.Teacher;
import com.example.tp_prueba.services.PersonaService;
import com.example.tp_prueba.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/colegio")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private PersonaService personService;

    @PostMapping("/profesor")
    public Teacher createTeacher(Teacher teacher){
        return teacherService.saveTeacher(teacher);
    }

    @GetMapping("/profesores")
    public List<Teacher> readTeachers(){
        return teacherService.getAllTeachers();
    }

    @PutMapping("/profesor/{id}")
    public Teacher updateTeacher(@PathVariable String id, @Validated @RequestBody Teacher teacher){
        return teacherService.saveTeacher(teacher);
    }

    @DeleteMapping("/profesor/{id}")
    public void deleteTeacher(@PathVariable String id){
        personService.deletePerson(id);
    }
}
