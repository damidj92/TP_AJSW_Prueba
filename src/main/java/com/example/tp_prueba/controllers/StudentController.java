package com.example.tp_prueba.controllers;

import com.example.tp_prueba.models.Student;
import com.example.tp_prueba.services.PersonaService;
import com.example.tp_prueba.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/colegio")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private PersonaService personService;

    @PostMapping("/estudiante")
    public Student createStudent(Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping("/estudiantes")
    public List<Student> readStudents(){
        return studentService.getAllStudents();
    }

    @PutMapping("/estudiante/{id}")
    public Student updateStudent(@PathVariable String id, @Validated @RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/estudiante/{id}")
    public void deleteStudent(@PathVariable String id){
        personService.deletePerson(id);
    }
}
