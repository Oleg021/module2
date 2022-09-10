package com.nix.vyrvykhvost.commands;

import com.nix.vyrvykhvost.configs.HibernateUtil;
import com.nix.vyrvykhvost.repository.SubjectRepository;
import com.nix.vyrvykhvost.service.SubjectService;

public class SummaryGrades implements Command{

    private final static SubjectService SUBJECT_SERVICE = new SubjectService(new SubjectRepository(HibernateUtil.getEntityManager()));
    @Override
    public void execute() {
        SUBJECT_SERVICE.subjectScores();
        Menu.printMenu(Commands.values());
    }
}
