package com.nix.vyrvykhvost.commands;

import com.nix.vyrvykhvost.model.Group;
import com.nix.vyrvykhvost.service.GroupService;

import java.util.Map;

public class AverageMarks implements Command{
    private static final GroupService GROUP_SERVICE = GroupService.getInstance();

    @Override
    public void execute() {
        System.out.println("Avrage marks of group: ");
        Map<Group, Double> result = GROUP_SERVICE.averageGrade();
        System.out.println(result);
    }
}
