package com.nix.vyrvykhvost.service;

import com.nix.vyrvykhvost.model.Mark;
import com.nix.vyrvykhvost.repository.MarkRepository;


public class MarkService {

    private final MarkRepository repository;


    public MarkService(MarkRepository repository){
        this.repository = repository;
    }

    public void saveGrade(Mark mark){
        repository.save(mark);
    }
}