package com.nix.vyrvykhvost.commands;

import com.nix.vyrvykhvost.configs.HibernateUtil;
import com.nix.vyrvykhvost.model.Student;
import com.nix.vyrvykhvost.repository.StudentRepository;
import com.nix.vyrvykhvost.service.StudentService;

import java.util.List;

public class StudentsWithHighPerformance implements Command {

    private final static StudentService STUDENT_SERVICE = new StudentService(new StudentRepository(HibernateUtil.getEntityManager()));
    @Override
    public void execute() {
        System.out.println("Enter a number to show a Student with high marks");
        try {
            int value = SCANNER.nextInt();
            List<Student> studentList = STUDENT_SERVICE.findByGrade(value);
            studentList.forEach(System.out::println);

        }
        catch (Exception e) {
            throw new ArithmeticException("try enter again");
        }
        Menu.printMenu(Commands.values());
    }
}
