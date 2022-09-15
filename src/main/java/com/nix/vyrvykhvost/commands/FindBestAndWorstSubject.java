package com.nix.vyrvykhvost.commands;



import com.nix.vyrvykhvost.model.Subject;
import com.nix.vyrvykhvost.service.SubjectService;

import java.util.Map;

public class FindBestAndWorstSubject implements Command{

    private static final SubjectService SUBJECT_SERVICE = SubjectService.getInstance();

    @Override
    public void execute() {
        Map<Subject, Double> bestSubject = SUBJECT_SERVICE.findBestSubject();
        Map<Subject, Double> worstSubject = SUBJECT_SERVICE.findWorstSubject();
        System.out.println("best subject: " + bestSubject);
        System.out.println("worst subject: " + worstSubject);
    }
}
