package com.nix.vyrvykhvost.repository;

import com.nix.vyrvykhvost.configs.SessionFactoryUtil;
import com.nix.vyrvykhvost.model.Subject;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubjectRepository {

    /*private final EntityManager entityManager;

    public SubjectRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Subject subject) {
        entityManager.getTransaction().begin();
        entityManager.persist(subject);
        entityManager.flush();
        entityManager.getTransaction().commit();
    }

    public void subjectScores() {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("""
                SELECT avg(gr.value) as averageValue, s.name from
                Grade gr LEFT JOIN Subject s on gr.subjectName = s.id
                Group by s.name
                ORDER by averageValue DESC
                """);
        List<Object[]> groups = query.getResultList();
        int worstGrades = groups.size() - 1;
        System.out.println(groups.get(0)[0] + " " + groups.get(0)[1]);
        System.out.println(groups.get(worstGrades)[0] + " " + groups.get(worstGrades)[1]);
        entityManager.flush();
        entityManager.getTransaction().commit();
    }*/

    private static SubjectRepository instance;

    private final SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();

    public SubjectRepository() {
    }

    public static SubjectRepository getInstance(){
        if (instance==null){
            instance = new SubjectRepository();
        }
        return instance;
    }

    public Map<Subject, Double> findBestSubject() {
        Session session = sessionFactory.openSession();
        List resultList = session.createQuery("select avg(s.grade),s.lesson.id, l " +
                "from Grade s, Lesson l " +
                "where s.lesson.id = l.id " +
                "group by s.lesson.id, l.id " +
                "order by avg(s.grade) desc").getResultList();
        Object [] best = (Object[]) resultList.get(0);
        Map<Subject, Double> bestSubject = new HashMap<>();
        bestSubject.put((Subject) best[2], (Double) best[0]);
        return bestSubject;
    }

    public Map<Subject, Double> findWorstSubject() {
        Session session = sessionFactory.openSession();
        List resultList = session.createQuery("select avg(s.grade),s.lesson.id, l " +
                "from Grade s, Lesson l " +
                "where s.lesson.id = l.id " +
                "group by s.lesson.id, l.id " +
                "order by avg(s.grade)").getResultList();
        Object [] worst = (Object[]) resultList.get(0);
        Map<Subject, Double> worstSubject = new HashMap<>();
        worstSubject.put((Subject) worst[2], (Double) worst[0]);
        return worstSubject;
    }
}
