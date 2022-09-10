package com.nix.vyrvykhvost.repository;

import com.nix.vyrvykhvost.model.Mark;

import javax.persistence.EntityManager;

public class MarkRepository {

    private final EntityManager entityManager;

    public MarkRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Mark mark) {
        entityManager.getTransaction().begin();
        entityManager.persist(mark);
        entityManager.flush();
        entityManager.getTransaction().commit();
    }
}
