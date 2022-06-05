package net.jafar.StudentManagementSystem.service;

import net.jafar.StudentManagementSystem.entity.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getAllTeachers();
    Teacher getTeacherById(Long teacherId);
    Teacher saveTeacher(Teacher teacher);
    Teacher updateTeacher(Teacher teacher);
    void deleteTeacherById(Long id);
}
