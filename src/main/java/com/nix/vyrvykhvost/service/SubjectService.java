package com.nix.vyrvykhvost.service;

import com.nix.vyrvykhvost.model.Subject;
import com.nix.vyrvykhvost.repository.SubjectRepository;

public class SubjectService {
    private final SubjectRepository repository;


    public SubjectService(SubjectRepository repository){
        this.repository = repository;
    }

    public void saveSubject(Subject subject){
        repository.save(subject);
    }

    public void subjectScores(){
        repository.subjectScores();
    }
}
