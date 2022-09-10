package com.nix.vyrvykhvost.commands;

import com.nix.vyrvykhvost.configs.HibernateUtil;
import com.nix.vyrvykhvost.repository.GroupRepository;
import com.nix.vyrvykhvost.service.GroupService;

public class GroupPerformance implements Command{

    private final static GroupService GROUP_SERVICE = new GroupService(new GroupRepository(HibernateUtil.getEntityManager()));

    @Override
    public void execute() {
        GROUP_SERVICE.studentAverageGrades();
        Menu.printMenu(Commands.values());
    }
}
