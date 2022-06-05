package net.jafar.StudentManagementSystem.repository;

import net.jafar.StudentManagementSystem.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
