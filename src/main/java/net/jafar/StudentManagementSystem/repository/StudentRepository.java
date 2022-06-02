package net.jafar.StudentManagementSystem.repository;

import net.jafar.StudentManagementSystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {
}
