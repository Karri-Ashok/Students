
package com.example.school.repository;

import java.util.*;

import com.example.school.model.Student;

public interface StudentRepository {

    ArrayList<Student> getStudents();

    Student getStudentById(int studentId);

    Student addStudent(Student student);
    /*List<Student> addMultipleStudents(List<Student> students);*/

    Student updateStudent(int studentId, Student student);

    void deleteStudent(int studentId);
}