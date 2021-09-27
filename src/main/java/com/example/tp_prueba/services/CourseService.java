package com.example.tp_prueba.services;

import com.example.tp_prueba.models.Course;
import com.example.tp_prueba.repositories.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private ICourseRepository iCourseRepository;

    public Course saveCourse(Course course){
        return iCourseRepository.save(course);
    }

    public List<Course> getAllCourses(){
        return iCourseRepository.findAll();
    }

    public void deleteCourse(Long id){
        iCourseRepository.deleteById(id);
    }
}
