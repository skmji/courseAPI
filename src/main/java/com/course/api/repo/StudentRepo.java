package com.course.api.repo;

import com.course.api.Entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
