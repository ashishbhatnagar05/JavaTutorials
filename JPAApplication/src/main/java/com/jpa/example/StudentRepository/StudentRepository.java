package com.jpa.example.StudentRepository;

import com.jpa.example.model.Student;

public interface StudentRepository {

    public Student findById(Long id);

    public boolean deleteById(Long id);

    public boolean save(Student course);

    public boolean updateNameById(Long id);
}
