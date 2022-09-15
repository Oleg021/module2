package com.nix.vyrvykhvost;

import com.nix.vyrvykhvost.commands.*;
import com.nix.vyrvykhvost.configs.FlywayConfig;
import com.nix.vyrvykhvost.configs.SessionFactoryUtil;
import org.flywaydb.core.Flyway;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Program program = new Program();
        program.run();

    }

}
