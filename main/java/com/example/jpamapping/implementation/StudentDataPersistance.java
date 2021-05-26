package com.example.jpamapping.implementation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpamapping.Repository.StudentCourseRepository;
import com.example.jpamapping.Repository.StudentRepository;
import com.example.jpamapping.entity.Course;
import com.example.jpamapping.entity.Student;

@Transactional
@Component
public class StudentDataPersistance {
	@Autowired
	StudentRepository studentRepository;

	@Autowired
	StudentCourseRepository studentCourseRepository;

	public void addData() {
		Course course1 = new Course("English");
		Course course2 = new Course("Physics");
		Course course3 = new Course("Math");
		Course course4 = new Course("Computer");

		Student student = new Student("John");
		Student student1 = new Student("tom");
		Student student2 = new Student("jerry");

		student.addCourse(course1);
		student.addCourse(course2);

		student1.addCourse(course2);
		student1.addCourse(course3);

		student2.addCourse(course4);

		studentRepository.save(student);
		studentRepository.save(student1);
		studentRepository.save(student2);

		studentRepository.delete(student2);

		List<String> name = studentCourseRepository.findAllByCourseId(course2.getId()).stream()
				.map(courseStudent -> courseStudent.getStudent().getName()).sorted().collect(Collectors.toList());
		System.out.println(name);
	}
}
