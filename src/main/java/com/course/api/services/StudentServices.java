package com.course.api.services;

import com.course.api.Entities.Student;
import com.course.api.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentServices {
    @Autowired
    private StudentRepo studentRepo;
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();

        return students;

    }

    public Student getStudentById(int id) {
        return studentRepo.findById(id).get();
    }

    public void addStudent(Student student) {
        studentRepo.save(student);

    }
    public void updateStudent(Student student) {
        studentRepo.save(student);
    }

}
