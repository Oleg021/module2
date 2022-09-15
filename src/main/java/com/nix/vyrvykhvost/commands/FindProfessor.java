package com.nix.vyrvykhvost.commands;

import com.nix.vyrvykhvost.model.Professor;
import com.nix.vyrvykhvost.service.ProfessorService;

import java.util.List;

public class FindProfessor implements Command{
    private static final ProfessorService PROFESSOR_SERVICE = ProfessorService.getInstance();


    @Override
    public void execute() {
        System.out.println("Enter the last name of professor");
        String userInput = SCANNER.nextLine();
        List<Professor> lectorByName = PROFESSOR_SERVICE.findByLastName(userInput);
        System.out.println(lectorByName);

    }
}
