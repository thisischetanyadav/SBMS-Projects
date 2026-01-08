package com.kodewala.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.kodewala.entity.Student;
import com.kodewala.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repo;

    @Override
    @Transactional
    public Student addStudent(Student student) {
        return repo.save(student);
    }

    @Override
    public Student getById(int id) {
        return repo.findById(id).orElse(null);
    }
    
    @Override
    public List<Student> getByNameLike(String name) {
        return repo.findByNameContainingIgnoreCase(name);
    }
    
    @Override
    public List<Student> getAllStudents() {
        return repo.findAll(); // fetches all students
    }

    
    @Override
    @Transactional
    public void deleteById(int id) {
        repo.deleteById(id);
    }

}
