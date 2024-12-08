package com.course.api.controller;

import com.course.api.Entities.Course;
import com.course.api.services.CourseServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
@CrossOrigin(origins = "http://localhost:3000")
public class Allcourse {
    @Autowired
   private CourseServices courseServices;

    @GetMapping
    public List<Course> getAllCourse(){

        return courseServices.getAllCourse();
    }

    @GetMapping("/{id}")
    public Course getCourseById( @PathVariable int id){
        return courseServices.getCourseById(id);
    }
    @PostMapping
    public void  addCourse(@RequestBody Course course){
        courseServices.addCourse(course);
        System.out.println(course);
      //  System.out.println(course.getAuthor());

    }

    @DeleteMapping("/{id}")
    public void deleteCourse(@PathVariable int id){
     courseServices.deleteCourse(id);

    }

    @PutMapping("{id}")
    public void updateCourse( @PathVariable  int id,@RequestBody Course course){
        courseServices.updateCourse(id,course);
    }

}
