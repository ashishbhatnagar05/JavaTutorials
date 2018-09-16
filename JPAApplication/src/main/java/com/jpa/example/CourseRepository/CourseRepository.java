package com.jpa.example.CourseRepository;

import com.jpa.example.model.Course;

public interface CourseRepository {

    public Course findById(Long id);

    public boolean deleteById(Long id);

    public boolean save(Course course);

    public boolean updateNameById(Long id);
}
