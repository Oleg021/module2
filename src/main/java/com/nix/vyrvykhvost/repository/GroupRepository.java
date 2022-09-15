package com.nix.vyrvykhvost.repository;

import com.nix.vyrvykhvost.configs.HibernateUtil;
import com.nix.vyrvykhvost.configs.SessionFactoryUtil;
import com.nix.vyrvykhvost.model.Group;
import com.nix.vyrvykhvost.model.Mark;
import com.nix.vyrvykhvost.model.Student;
import org.hibernate.SessionFactory;

import org.hibernate.Session;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupRepository {

    private static GroupRepository instance;
    private final SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();

    public GroupRepository() {
    }

    public static GroupRepository getInstance(){
        if (instance == null){
            instance = new GroupRepository();
        }
        return instance;
    }

    public List<Group> findByName(String name) {
        Session session = sessionFactory.openSession();
        List<Group> groupList = session.createQuery("select * from Group group where group.name like :name", Group.class).setParameter("name", "%" + name + "%").getResultList();
        return groupList;
    }

    public Map<String, Integer> studentQuantity() {
        Session session = sessionFactory.openSession();
        Map<String, Integer> result = new HashMap<>();
        List resultList = session.createQuery("select n.group.name, count (n.id) from Student n group by n.group.name").getResultList();
        resultList.forEach(o -> {Object[] object = (Object[]) o;
            result.put((String) object[0], (Integer) object[1]);
        });
        return result;
    }

    public Map<Group, Double> averageGrade() {
        Session session = sessionFactory.openSession();
        List<Mark> grades = session.createQuery("select grade from Grade grade").getResultList();
        grades.size();
        Map<Student, List<Mark>> studentListMap = new HashMap<>();
        Map<Group, List<Student>> groupListMap = new HashMap<>();
        grades.forEach(mark -> {
            studentListMap.putIfAbsent(mark.getStudent(), new ArrayList<>());
            List<Mark> list = studentListMap.get(mark.getStudent());
            list.add(mark);
        });
        studentListMap.forEach((student, marks1) -> {
            groupListMap.putIfAbsent(student.getGroupId(), new ArrayList<>());
            List<Student> studentList = groupListMap.get(student.getGroupId());
            studentList.add(student);
        });
        Map<Group, Double> result = new HashMap<Group, Double>();
        for (Map.Entry<Group, List<Student>> map: groupListMap.entrySet()){
            Group key  = map.getKey();
            int count = 0;
            double sum = 0;
            List<Student> value = map.getValue();
            for (Student student:value){
                List<Mark> marks = studentListMap.get(student);
                for (Mark mark : marks){
                    count++;
                    sum+= mark.getValue();
                }
            }
            result.put(key,(sum / count));
        }
        return result;
    }

}
