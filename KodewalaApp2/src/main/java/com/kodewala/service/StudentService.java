package com.kodewala.service;

import java.util.List;

import com.kodewala.entity.Student;

public interface StudentService {
	Student addStudent(Student student);

	Student getById(int id);

	List<Student> getByNameLike(String name);
	
	List<Student> getAllStudents();

	void deleteById(int id);


}
