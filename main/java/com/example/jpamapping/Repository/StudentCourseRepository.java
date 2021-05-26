package com.example.jpamapping.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpamapping.entity.StudentCourse;

public interface StudentCourseRepository extends JpaRepository<StudentCourse, Integer>{
	
public List<StudentCourse> findAllByCourseId(Integer courseId);
}
