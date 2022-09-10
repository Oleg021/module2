package com.nix.vyrvykhvost.service;

import com.nix.vyrvykhvost.model.Professor;
import com.nix.vyrvykhvost.model.Subject;
import com.nix.vyrvykhvost.repository.ProfessorRepository;

import java.util.List;
import java.util.Random;

public class ProfessorService {

    private final ProfessorRepository repository;


    public ProfessorService(ProfessorRepository repository) {
        this.repository = repository;
    }

    private final Random random = new Random();

    protected Professor createTeacher(Subject subject) {
        return new Professor(
                NameGenerator.generateName(),
                NameGenerator.generateName(),
                random.nextInt(18,65),
                subject

        );
    }

    public List<Professor> findByLastName(String name){
        return repository.findByLastName(name);
    }
}
