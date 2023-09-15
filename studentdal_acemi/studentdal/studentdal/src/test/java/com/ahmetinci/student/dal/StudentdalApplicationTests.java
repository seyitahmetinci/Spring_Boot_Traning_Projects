package com.ahmetinci.student.dal;

import com.ahmetinci.student.dal.entities.Student;
import com.ahmetinci.student.dal.repos.IStudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private IStudentRepository studentRepository;

	@Test
	public void testCreateStudent() {
		Student student1 = new Student();
		student1.setName("John");
		student1.setCourse("Java End to End Spring Boot");
		student1.setFee(30d);

		this.studentRepository.save(student1);
	}

	@Test
	public void findByID() {
		Optional<Student> studentOptional = studentRepository.findById(1L);

		if (studentOptional.isPresent()) {
			Student student = studentOptional.get();
			System.out.println(student);
		} else {
			System.out.println("Student with ID 1 not found.");
		}
	}

	@Test
	public void updateTheStudent() {
		Optional<Student> studentOptional = studentRepository.findById(1L);

		if (studentOptional.isPresent()) {
			Student student2 = studentOptional.get();
			student2.setFee(30d);
			this.studentRepository.save(student2);
		} else {
			System.out.println("Student with ID 1 not found.");
		}
	}

	@Test
	public void deleteById() {
		studentRepository.deleteById(1L);
	}
}
