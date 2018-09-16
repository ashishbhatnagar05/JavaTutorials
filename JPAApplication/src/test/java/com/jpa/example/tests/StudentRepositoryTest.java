package com.jpa.example.tests;


import com.jpa.example.DemoApplication;
import com.jpa.example.StudentRepository.StudentRepository;

import com.jpa.example.model.Address;
import com.jpa.example.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class StudentRepositoryTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    @Qualifier("studentRepositoryHibernateImpl")
    StudentRepository studentRepositoryHibernateImpl;

    @Test
    public void testStudentRepository() {
        Long id = 10001L;

        Student student = studentRepositoryHibernateImpl.findById(id);
        assertNotNull(student);
        assertEquals("Aman", student.getName());
        List<String> books = new ArrayList<String>();
        books.add("Head first java");
        Student student1=new Student("Ashish",new Address("a-503","atalanta","pune"),books);
        assertTrue(studentRepositoryHibernateImpl.save(student1));

        student = studentRepositoryHibernateImpl.findById(1L);
        if (student != null)
            System.out.println(student.getName());

        System.out.println("city:"+student.getAddress().getCity());
        assertTrue(studentRepositoryHibernateImpl.deleteById(1L));

        student = studentRepositoryHibernateImpl.findById(1L);
        assertNull(student);

    }

}
