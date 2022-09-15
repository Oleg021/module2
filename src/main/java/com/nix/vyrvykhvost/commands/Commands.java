package com.nix.vyrvykhvost.commands;

import lombok.Getter;

@Getter
public enum Commands {
    FIND_GROUP_BY_NAME("Find group by name" , new FindByName()),
    STUDENT_QUANTITY_IN_GROUP("Count of students in groups", new StudentQuantity()),
    AVERAGE_MARKS("Average grade of every gropu", new AverageMarks()),
    FIND_PROFESSOR("Find ltctor by first name or last name", new FindProfessor()),
    BEST_AND_WORST_SUBJECT("The best and the worst lessons", new FindBestAndWorstSubject()),
    FIND_STUDENTS_BY_MARKS("Find students, who has average grade greater than we print",new FindStudentsByMarks());

    private final String name;
    private final Command command;

    Commands(String name, Command command) {
        this.name = name;
        this.command = command;
    }
}
