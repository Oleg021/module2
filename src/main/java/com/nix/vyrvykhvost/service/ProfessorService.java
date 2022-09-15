package com.nix.vyrvykhvost.service;

import com.nix.vyrvykhvost.model.Professor;
import com.nix.vyrvykhvost.repository.ProfessorRepository;

import java.util.List;


public class ProfessorService {

    private static ProfessorService instance;
    private ProfessorRepository repository;

    public ProfessorService(ProfessorRepository repository) {
        this.repository = repository;
    }

    public static ProfessorService getInstance(){
        if (instance == null){
            instance = new ProfessorService(ProfessorRepository.getInstance());
        }
        return instance;
    }

    public List<Professor> findByLastName(String name){
        return repository.findByLastName(name);
    }
}
