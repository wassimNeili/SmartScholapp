package com.example.smartscholapp.Service;


import com.example.smartscholapp.Model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student createStudent(Student student);
    Student updateStudent(Student student);
    void deleteStudent(Long id);

    // Additional methods for Student management can be added here
}
