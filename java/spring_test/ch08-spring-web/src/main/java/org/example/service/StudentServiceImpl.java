package org.example.service;

import org.example.dao.StudentDao;
import org.example.domain.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    //定义dao的引用类型的属性 应用类型 set赋值来注入
    private StudentDao studentDao;//为啥定义了这个接口类型的变量

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        return studentDao.insertStudent(student);
    }

    @Override
    public int modifyStudent(Student student) {

        return studentDao.updateStudent(student);
    }

    @Override
    public int removeStudent(int id) {

        return studentDao.deleteStudentById(id);
    }

    @Override
    public List<Student> findStudentById(int id) {

        return (List<Student>) studentDao.selectStudentbyId(id);
    }

    @Override
    public List<Student> findAllStudent() {

        return (List<Student>) studentDao.selectAllStudents();
    }
}
