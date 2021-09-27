package org.example.service;

import org.example.domain.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    int modifyStudent(Student student);
    int removeStudent(int id);
    List<Student> findStudentById(int id);
    List<Student> findAllStudent();
}
