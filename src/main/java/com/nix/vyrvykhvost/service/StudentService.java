package com.nix.vyrvykhvost.service;

import com.nix.vyrvykhvost.model.Student;
import com.nix.vyrvykhvost.repository.StudentRepository;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class StudentService {

    private static StudentService instance;

    private StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public static StudentService getInstance(){
        if (instance==null){
            instance = new StudentService(StudentRepository.getInstance());
        }
        return instance;
    }

    public List<Student> findStudentWithHighestGrades(double expectedGrade){
        return repository.findStudentWithHighestGrades(expectedGrade);
    }
}