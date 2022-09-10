package com.nix.vyrvykhvost;

import com.nix.vyrvykhvost.commands.Commands;
import com.nix.vyrvykhvost.commands.Menu;
import com.nix.vyrvykhvost.configs.FlywayConfig;
import org.flywaydb.core.Flyway;

public class Main {
    public static void main(String[] args) {
        Flyway flyway = FlywayConfig.configure();
        flyway.migrate();
        Menu.printMenu(Commands.values());
    }
}
