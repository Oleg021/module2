package com.nix.vyrvykhvost.commands;

import com.nix.vyrvykhvost.model.Student;
import com.nix.vyrvykhvost.service.StudentService;

import java.util.List;

public class FindStudentsByMarks implements Command{

    private static final StudentService STUDENT_SERVICE = StudentService.getInstance();

    @Override
    public void execute() {
        Double userInput = SCANNER.nextDouble();
        List<Student> studentWithHighestGrades = STUDENT_SERVICE.findStudentWithHighestGrades(userInput);
        System.out.println(studentWithHighestGrades);
    }
}
