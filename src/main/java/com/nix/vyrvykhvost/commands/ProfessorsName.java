package com.nix.vyrvykhvost.commands;

import com.nix.vyrvykhvost.configs.HibernateUtil;
import com.nix.vyrvykhvost.model.Professor;
import com.nix.vyrvykhvost.repository.ProfessorRepository;
import com.nix.vyrvykhvost.service.ProfessorService;

import java.util.List;

public class ProfessorsName implements Command{

    private final static ProfessorService TEACHER_SERVICE = new ProfessorService(new ProfessorRepository(HibernateUtil.getEntityManager()));
    @Override
    public void execute() {
        System.out.println("Enter teacher's last name");
        String lastName = SCANNER.next();
        List<Professor> teacherList = TEACHER_SERVICE.findByLastName(lastName);
        teacherList.forEach(System.out::println);
        Menu.printMenu(Commands.values());
    }
}
