package com.nix.vyrvykhvost.commands;

import com.nix.vyrvykhvost.configs.HibernateUtil;
import com.nix.vyrvykhvost.model.Group;
import com.nix.vyrvykhvost.repository.GroupRepository;
import com.nix.vyrvykhvost.service.GroupService;

import java.util.List;

public class GroupName implements Command{

    private final static GroupService GROUP_SERVICE = new GroupService(new GroupRepository(HibernateUtil.getEntityManager()));
    @Override
    public void execute() {
        System.out.println("Enter the group name");
        String name = SCANNER.next();
        List<Group> groupList = GROUP_SERVICE.findByName(name);
        groupList.forEach(System.out::println);
        Menu.printMenu(Commands.values());
    }
}
