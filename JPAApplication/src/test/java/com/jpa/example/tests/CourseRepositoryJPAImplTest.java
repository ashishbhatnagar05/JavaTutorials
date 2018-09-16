package com.jpa.example.tests;

import static org.junit.Assert.*;

import com.jpa.example.CourseRepository.CourseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jpa.example.DemoApplication;
import com.jpa.example.model.Course;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class CourseRepositoryJPAImplTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("courseRepositoryHibernateImpl")
    //@Qualifier("courseRepositoryJPAImpl")
    CourseRepository courseRepositoryHibernateImpl;

    @Autowired
    @Qualifier("courseRepositoryJPAImpl")
    CourseRepository courseRepositoryJPAImpl;


    @Test
    public void testCRUDusingHibernate() {
        Long id=10001L;

        Course course = courseRepositoryHibernateImpl.findById(id);
        assertNotNull(course);
        assertEquals("JPA in 50 Steps", course.getName());

        assertTrue(courseRepositoryHibernateImpl.save(new Course("Spring")));

        course = courseRepositoryHibernateImpl.findById(1L);
        if(course!=null)
            System.out.println(course.getName());


        assertTrue(courseRepositoryHibernateImpl.deleteById(1L));

        course = courseRepositoryHibernateImpl.findById(1L);
        assertNull(course);
    }

    @Test
    public void testCRUDusingJPA() {
        Long id=10001L;

        Course course = courseRepositoryJPAImpl.findById(id);
        assertNotNull(course);
    }

}
