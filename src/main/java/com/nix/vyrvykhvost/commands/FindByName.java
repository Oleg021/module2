package com.nix.vyrvykhvost.commands;

import com.nix.vyrvykhvost.model.Group;
import com.nix.vyrvykhvost.service.GroupService;


import java.util.List;

public class FindByName implements Command{

    private static final GroupService GROUP_SERVICE = GroupService.getInstance();

    @Override
    public void execute() {
        System.out.println("Enter name of group");
        String userInput = SCANNER.nextLine();
        List<Group> groupList = GROUP_SERVICE.findByName(userInput);
        System.out.println(groupList);
    }
}
