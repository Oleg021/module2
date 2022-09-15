package com.nix.vyrvykhvost.service;

import com.nix.vyrvykhvost.model.Group;
import com.nix.vyrvykhvost.repository.GroupRepository;

import java.util.List;
import java.util.Map;

public class GroupService {
    private static GroupService instance;
    private GroupRepository repository;

    public GroupService(GroupRepository repository) {
        this.repository = repository;
    }

    public static GroupService getInstance(){
        if (instance== null){
            instance = new GroupService(GroupRepository.getInstance());
        }
        return instance;
    }

    public List<Group> findByName(String name){
        return repository.findByName(name);
    }

    public Map<String, Integer> studentQuantity(){
        return repository.studentQuantity();
    }

    public Map<Group, Double> averageGrade(){
        return repository.averageGrade();
    }


}
