package com.kodewala.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kodewala.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // simple JpaRepository gives you save(), findById(), findAll(), deleteById() etc.
	
	
	List<Student> findByNameContainingIgnoreCase(String name);

}
