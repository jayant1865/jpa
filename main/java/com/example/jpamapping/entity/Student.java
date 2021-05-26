package com.example.jpamapping.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

	@Entity
	@Table(name="student")
	public class Student {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="name")
		private String name;
		
		@ManyToMany(fetch=FetchType.LAZY,cascade= {CascadeType.PERSIST, CascadeType.MERGE,
				  CascadeType.REFRESH})
		@JoinTable(
				name="student_course",
				joinColumns=@JoinColumn(name="student_id"),
				inverseJoinColumns=@JoinColumn(name="course_id")
				)	
		private List<Course> courses;

		
		public Student() {
			
		}

		public Student(String name) {
			this.name = name;
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public List<Course> getCourses() {
			return courses;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setCourses(List<Course> courses) {
			this.courses = courses;
		}

		public void addCourse(Course course) {
			if(courses==null) {
				courses=new ArrayList<Course>();
			}
			courses.add(course);
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name +"]";
		}	
}
