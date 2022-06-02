package net.jafar.StudentManagementSystem;

import net.jafar.StudentManagementSystem.entity.Student;
import net.jafar.StudentManagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Jafar", "Sadik", "jafar@sadik.com");
//		Student student2 = new Student("Amit", "Hasan", "amit@hasan.com");
//		Student student3 = new Student("Shajal", "Islam", "Shajal@islam.com");
//		studentRepository.save(student1);
//		studentRepository.save(student2);
//		studentRepository.save(student3);
	}
}
