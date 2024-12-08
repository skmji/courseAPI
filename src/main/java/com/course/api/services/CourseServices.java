package com.course.api.services;

import com.course.api.Entities.Course;
import com.course.api.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServices {

    @Autowired
    private CourseRepo courseRepo;


    public List<Course>  getAllCourse(){
        List<Course> allcourse = new ArrayList<>();
     Iterable<Course> it=   courseRepo.findAll();
     it.forEach(x->allcourse.add(x));


        return  allcourse;
    }


    public  void addCourse(Course course){
        courseRepo.save(course);
    }

    public Course getCourseById(int id){
        return courseRepo.findById(id).get();
    }
    public void updateCourse( int id,Course course){
        if(id== course.getId()){
            courseRepo.save(course);
        }
        return;
    }

    public void deleteCourse(int id){
        courseRepo.deleteById(id);
    }
}
