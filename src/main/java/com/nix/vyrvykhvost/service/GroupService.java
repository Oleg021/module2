package com.nix.vyrvykhvost.service;

import com.nix.vyrvykhvost.model.Group;
import com.nix.vyrvykhvost.repository.GroupRepository;
import com.nix.vyrvykhvost.repository.StudentRepository;

import java.util.List;

public class GroupService {

    private final GroupRepository repository;

    public GroupService(GroupRepository repository) {
        this.repository = repository;
    }

    public void saveGroup(Group group) {
        repository.save(group);
    }

    public List<Group> findByName(String name){
        return repository.findByName(name);
    }

    public void studentQuantity(){
        repository.studentQuantity();
    }
    public void studentAverageGrades(){
        repository.averageGrade();
    }


}
