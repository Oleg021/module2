package com.nix.vyrvykhvost.repository;

import com.nix.vyrvykhvost.configs.SessionFactoryUtil;
import com.nix.vyrvykhvost.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class StudentRepository  {

    private final SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
    private static StudentRepository instance;

    public StudentRepository() {
    }

    public static StudentRepository getInstance(){
        if (instance == null){
            instance = new StudentRepository();
        }
        return instance;
    }


    public List<Student> findStudentWithHighestGrades(double expectedGrade) {
        Session session = sessionFactory.openSession();
        List<Student> result = session.createQuery("select * from Student s " +
                        "where (select avg(g.grade) " +
                        "from Grade g " +
                        "where g.student.id = s.id) > :expectedGrade", Student.class)
                .setParameter("expectedGrade", expectedGrade)
                .list();
        return result;
    }
}
