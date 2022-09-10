package com.nix.vyrvykhvost.repository;



import com.nix.vyrvykhvost.model.Human;

import java.util.List;

public interface CrudeRepository<T extends Human> {
    public void save(T t);
    public void saveAll(List<T> people);
}
