package com.system.registration;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*")
public class StudentController {

    // This ArrayList stores your data while the server is running
    private List<Student> studentList = new ArrayList<>();

    @PostMapping
    public String registerStudent(@RequestBody Student student) {
        studentList.add(student);
        return "Registration successful for: " + student.getFullName();
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentList;
    }
}