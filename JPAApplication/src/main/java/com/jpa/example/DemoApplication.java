package com.jpa.example;

import com.jpa.example.CourseRepository.CourseRepository;
import com.jpa.example.StudentRepository.StudentRepository;
import com.jpa.example.model.Address;
import com.jpa.example.model.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpa.example.model.Course;
import com.jpa.example.CourseRepository.CourseRepositoryJPAImpl;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    StudentRepository studentRepository;

    @Autowired
    @Qualifier("courseRepositoryHibernateImpl")
    CourseRepository courseRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... arg0) throws Exception {

        insertStudentDetails();
        insertCourseDetails();

    }

    private void insertCourseDetails() {
        courseRepository.save(new Course("machine learning"));
        courseRepository.save(new Course("neural network"));
        courseRepository.save(new Course("dev ops"));
        courseRepository.save(new Course("microservices"));
        courseRepository.save(new Course("computer laguages: java"));
        courseRepository.save(new Course("natural language processing"));
    }

    private void insertStudentDetails() {
        List<String> books = new ArrayList<String>();
        books.add("Head first java");
        books.add("algorithm analysis");
        studentRepository.save(new Student("Akhil",
                new Address("a-503", "atalanta", "pune"), books));
        studentRepository.save(new Student("Aman",
                new Address("a-504", "atalanta", "pune"), books));
        studentRepository.save(new Student("Sagar",
                new Address("a-503", "atalanta", "pune"),books));
        studentRepository.save(new Student("Varsha",
                new Address("a-503", "atalanta", "pune"), books));
        studentRepository.save(new Student("Jai",
                new Address("a-503", "atalanta", "pune"), books));
        Student student = studentRepository.findById(1L);
        logger.info("student: {}", student.getName());
    }
}
