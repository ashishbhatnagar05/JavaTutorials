package com.jpa.example.CourseRepository;

import com.jpa.example.model.Course;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Repository
@Transactional
public class CourseRepositoryHibernateImpl implements CourseRepository {
    @Autowired
    EntityManager em;

    @Override
    public Course findById(Long id) {
        Session session = em.unwrap(Session.class);
        return getCourse(session, id);
    }

    @Override
    public boolean deleteById(Long id) {
        Session session = em.unwrap(Session.class);
        Course course = getCourse(session, id);
        if (course != null) {
            session.delete(course);
            return true;
        }
        return false;
    }

    @Override
    public boolean save(Course course) {
        Session session = em.unwrap(Session.class);
        session.save(course);
        return true;
    }

    @Override
    public boolean updateNameById(Long id) {
        Session session = em.unwrap(Session.class);
        Course course = getCourse(session, id);
        if (course != null) {
            session.update(course);
            return true;
        }
        return false;
    }

    private Course getCourse(Session session, Long id) {
        return session.get(Course.class, id);
    }
}
