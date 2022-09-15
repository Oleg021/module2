package com.nix.vyrvykhvost.service;

import com.nix.vyrvykhvost.model.Subject;
import com.nix.vyrvykhvost.repository.SubjectRepository;

import java.util.Map;

public class SubjectService {
    private static SubjectService instance;

    private SubjectRepository repository;

    public SubjectService(SubjectRepository repository) {
        this.repository = repository;
    }

    public static SubjectService getInstance(){
        if (instance==null){
            instance = new SubjectService(SubjectRepository.getInstance());
        }
        return instance;
    }

    public Map<Subject, Double> findBestSubject(){
        return repository.findBestSubject();
    }
    public Map<Subject, Double> findWorstSubject(){
        return repository.findWorstSubject();
    }

}
