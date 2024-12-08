package com.course.api.controller;

import com.course.api.Entities.Student;
import com.course.api.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class Studentcontrller {
    @Autowired
    StudentServices studentServices;

    @GetMapping
    public List<Student> getStudents(){
       return studentServices.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id){
        return studentServices.getStudentById(id);
    }

    @PostMapping
    public void  addStudent(@RequestBody Student student){
        studentServices.addStudent(student);
    }
    @PutMapping
    public void updateStudent(@RequestBody Student student){
        studentServices.updateStudent(student);
    }
}
