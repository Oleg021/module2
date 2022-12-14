package com.nix.vyrvykhvost.commands;

import com.nix.vyrvykhvost.service.GroupService;

import java.util.Map;

public class StudentQuantity implements Command{
    private static final GroupService GROUP_SERVICE = GroupService.getInstance();

    @Override
    public void execute() {
        Map<String, Integer> result = GROUP_SERVICE.studentQuantity();
        System.out.println("Count students in group: ");
        System.out.println(result);
    }
}
