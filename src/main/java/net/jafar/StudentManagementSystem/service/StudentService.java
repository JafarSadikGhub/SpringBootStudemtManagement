package net.jafar.StudentManagementSystem.service;

import net.jafar.StudentManagementSystem.entity.Student;

import java.util.List;

public interface StudentService  {
    List<Student> getAllStudents();

    Student saveStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Student student);

}
