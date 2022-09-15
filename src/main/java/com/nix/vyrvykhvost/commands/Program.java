package com.nix.vyrvykhvost.commands;

import com.nix.vyrvykhvost.configs.FlywayConfig;
import com.nix.vyrvykhvost.configs.SessionFactoryUtil;
import org.flywaydb.core.Flyway;

import java.util.List;

public class Program {

    public void run(){
        SessionFactoryUtil.getSessionFactory();
        Flyway flyway = FlywayConfig.configure();
        flyway.clean();
        flyway.migrate();

        boolean exit = false;
        final Commands[] values = Commands.values();
        final List<String> names = UserInputUtil.getNamesOfType(values);
        do {
            int commandIndex = UserInputUtil.getUserInput(values.length, names);
            switch (values[commandIndex]) {
                case FIND_GROUP_BY_NAME -> new FindByName().execute();
                case STUDENT_QUANTITY_IN_GROUP -> new StudentQuantity().execute();
                case AVERAGE_MARKS -> new AverageMarks().execute();
                case FIND_PROFESSOR -> new FindProfessor().execute();
                case BEST_AND_WORST_SUBJECT -> new FindBestAndWorstSubject().execute();
                case FIND_STUDENTS_BY_MARKS -> new FindStudentsByMarks().execute();
            }

        } while (!exit);
    }
}
