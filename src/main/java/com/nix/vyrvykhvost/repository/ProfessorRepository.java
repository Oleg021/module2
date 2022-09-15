package com.nix.vyrvykhvost.repository;

import com.nix.vyrvykhvost.configs.SessionFactoryUtil;
import com.nix.vyrvykhvost.model.Professor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class ProfessorRepository  {

    private static ProfessorRepository instance;
    private final SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();

    public ProfessorRepository() {
    }

    public static ProfessorRepository getInstance(){
        if (instance==null){
            instance = new ProfessorRepository();
        }
        return instance;
    }


    public List findByLastName(String name) {
        Session session = sessionFactory.openSession();
        return session.createQuery("select lector from Lector lector where lector.lastName like :lastName", Professor.class)
                .setParameter("lastName", "%" + name + "%")
                .getResultList();
    }

}
