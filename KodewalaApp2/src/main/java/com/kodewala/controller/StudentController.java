package com.kodewala.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.kodewala.entity.Student;
import com.kodewala.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // show form to add student
    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "studentForm"; // /WEB-INF/views/studentForm.jsp
    }

    // add student and show saved id
    @PostMapping("/add")
    public String addStudent(@ModelAttribute Student student, Model model) {
        Student saved = studentService.addStudent(student);
        model.addAttribute("id", saved.getId());
        return "studentResult"; // /WEB-INF/views/studentResult.jsp
    }

    
    @GetMapping("/{id}")
    public String getStudent(@PathVariable("id") int id, Model model) {
        Student s = studentService.getById(id);
        if (s == null) {
            model.addAttribute("message", "Student not found with id: " + id);
            return "notFound";
        }
        model.addAttribute("student", s);
        return "studentDetail";
    }
    
    @GetMapping("/search/result")
    public String searchStudent(@RequestParam("id") int id, Model model) {
        Student s = studentService.getById(id);
        if (s == null) {
            model.addAttribute("message", "Student not found with id: " + id);
            return "notFound"; // /WEB-INF/views/notFound.jsp
        }
        model.addAttribute("student", s);
        return "studentDetail"; // /WEB-INF/views/studentDetail.jsp
    }
    
    @GetMapping("/searchByName")
    public String searchByName(@RequestParam("name") String name, Model model) {
        List<Student> students = studentService.getByNameLike(name); // service me method banao
        model.addAttribute("students", students);
        return "studentList"; // /WEB-INF/views/studentList.jsp
    }

    
 // View all students
    @GetMapping("/all")
    public String viewAllStudents(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "studentList"; // /WEB-INF/views/studentList.jsp
    }
    
 // Delete student by ID
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") int id, Model model) {
        studentService.deleteById(id); // service me method banao
        return "redirect:/student/all"; // delete ke baad all students page pe redirect
    }





}



