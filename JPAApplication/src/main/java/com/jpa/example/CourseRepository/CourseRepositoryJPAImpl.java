package com.jpa.example.CourseRepository;

import javax.persistence.EntityManager;

import com.jpa.example.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepositoryJPAImpl implements CourseRepository {

    @Autowired
    EntityManager em;

    public Course findById(Long id) {
        return em.find(Course.class, id);
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public boolean save(Course course) {
        return false;
    }

    @Override
    public boolean updateNameById(Long id) {
        return false;
    }


}
