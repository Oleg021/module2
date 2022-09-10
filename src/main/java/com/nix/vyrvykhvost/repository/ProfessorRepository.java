package com.nix.vyrvykhvost.repository;

import com.nix.vyrvykhvost.model.Professor;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class ProfessorRepository implements CrudeRepository<Professor> {
    private final EntityManager entityManager;

    public ProfessorRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Professor professor) {
        entityManager.getTransaction().begin();
        entityManager.persist(professor);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void saveAll(List<Professor> professors) {
        entityManager.getTransaction().begin();
        for (Professor teacher : professors) {
            entityManager.persist(teacher);
        }
        entityManager.getTransaction().commit();
    }

    public List<Professor> findByLastName(String name) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("from Professor with lastName =: i ");
        query.setParameter("i", name);
        List<Professor> professors = query.getResultList();
        entityManager.flush();
        entityManager.getTransaction().commit();
        return professors;

    }
}
