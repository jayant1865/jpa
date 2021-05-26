package com.example.jpamapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpamapping.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
}
