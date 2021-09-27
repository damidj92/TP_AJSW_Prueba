package com.example.tp_prueba.controllers;

import com.example.tp_prueba.models.Course;
import com.example.tp_prueba.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/colegio")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/curso")
    public Course createCourse(Course course){
        return courseService.saveCourse(course);
    }

    @GetMapping("/cursos")
    public List<Course> readCourses(){
        return courseService.getAllCourses();
    }

    @PutMapping("/curso/{id}")
    public Course updateCourse(@PathVariable Long id, @Validated @RequestBody Course course){
        return courseService.saveCourse(course);
    }

    @DeleteMapping("/curso/{id}")
    public void deleteCourse(@PathVariable Long id){
        courseService.deleteCourse(id);
    }
}
