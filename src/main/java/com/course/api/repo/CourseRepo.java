package com.course.api.repo;

import com.course.api.Entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends CrudRepository<Course, Integer> {

}
