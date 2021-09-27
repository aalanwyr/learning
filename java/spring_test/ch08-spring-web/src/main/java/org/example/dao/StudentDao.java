package org.example.dao;

import org.example.domain.Student;

import java.util.List;//用链表来存储

public interface StudentDao {
    //数据访问层
    int insertStudent(Student student);
    int updateStudent(Student student);
    int deleteStudentById( int id);
    List<Student> selectStudentbyId(int id);
    List<Student> selectAllStudents();
}
