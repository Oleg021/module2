package com.nix.vyrvykhvost.service;

import com.nix.vyrvykhvost.model.Human;
import com.nix.vyrvykhvost.repository.CrudeRepository;

import java.util.List;

public abstract class CrudeService<T extends Human> {

    private final CrudeRepository<T> repository;

    public CrudeService(CrudeRepository<T> repository) {
        this.repository = repository;
    }

    protected abstract List<T> createAndSavePeople(int count) ;


}
