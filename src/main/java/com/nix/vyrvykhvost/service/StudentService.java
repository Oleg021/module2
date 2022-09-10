package com.nix.vyrvykhvost.service;

import com.nix.vyrvykhvost.model.Student;
import com.nix.vyrvykhvost.repository.CrudeRepository;
import com.nix.vyrvykhvost.repository.StudentRepository;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class StudentService extends CrudeService<Student>{

    private final Random random = new Random();
    private final StudentRepository repository;


    public StudentService(CrudeRepository<Student> repository) {
        super(repository);
        this.repository = (StudentRepository) repository;
    }

    @Override
    public List<Student> createAndSavePeople(int count) {
        {

            if (count <= 0) {
                throw new IllegalArgumentException("Count can't be less then zero");
            }
            List<Student> products = new LinkedList<>();
            for (int i = 0; i < count; i++) {
                final Student student = createPerson();
                products.add(student);
            }
            return products;
        }
    }
    protected Student createPerson() {
        Student student = new Student(
                NameGenerator.generateName(),
                NameGenerator.generateName(),
                random.nextInt(18,60)
        );
        repository.save(student);
        return student;
    }

    public void findStudentWithHighestGrades(){
        repository.findStudentWithHighestGrades();
    }

    public List<Student> findByGrade(double sum){
        return repository.findByGrade(sum);
    }
}