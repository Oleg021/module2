package com.nix.vyrvykhvost.repository;

import com.nix.vyrvykhvost.model.Group;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class GroupRepository {

    private final EntityManager entityManager;

    public GroupRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Group group) {
        entityManager.getTransaction().begin();
        entityManager.persist(group);
        entityManager.getTransaction().commit();
    }


    public List<Group> findByName(String name) {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("from Group where name like :name");
        query.setParameter("name", "%" + name + "%");
        List<Group> groups = query.getResultList();
        entityManager.flush();
        entityManager.getTransaction().commit();
        return groups;
    }

    public void studentQuantity() {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("""
                SELECT count(s.groupId) as count, gr.name
                FROM
                Student as s LEFT JOIN Group as gr ON gr.id = s.groupId
                Group by gr.name
                """);
        List<Object[]>groups = query.getResultList();
        groups.forEach(x -> {
            System.out.println(x[1] + " : " + x[0]);
        });
        entityManager.flush();
        entityManager.getTransaction().commit();

    }

    public void averageGrade(){
        entityManager.getTransaction().begin();
        Query query = entityManager.createNamedQuery("FIND_AVG_GRADE");
        List<Object[]> groups = query.getResultList();
        groups.forEach(x -> {
            System.out.println(x[2] + " : " + x[0]);
        });
        entityManager.flush();
        entityManager.getTransaction().commit();
    }

}
