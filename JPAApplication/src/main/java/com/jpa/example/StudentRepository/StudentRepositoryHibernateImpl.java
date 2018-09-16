package com.jpa.example.StudentRepository;

import com.jpa.example.model.Student;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class StudentRepositoryHibernateImpl implements StudentRepository {

    @Autowired
    EntityManager em;

    @Override
    public Student findById(Long id) {
        Session session = em.unwrap(Session.class);
        return getStudent(session, id);
    }

    @Override
    public boolean deleteById(Long id) {
        Session session = em.unwrap(Session.class);
        Student student = getStudent(session, id);
        if (student != null) {
            session.delete(student);
            return true;
        }
        return false;
    }

    @Override
    public boolean save(Student student) {
        Session session = em.unwrap(Session.class);
        session.save(student);
        return true;
    }

    @Override
    public boolean updateNameById(Long id) {
        Session session = em.unwrap(Session.class);
        Student student = getStudent(session, id);
        if (student != null) {
            session.update(student);
            return true;
        }
        return false;
    }

    private Student getStudent(Session session, Long id) {
        return session.get(Student.class, id);
    }
}
