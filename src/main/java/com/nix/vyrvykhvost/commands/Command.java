package com.nix.vyrvykhvost.commands;

import java.util.Scanner;

public interface Command {

    void execute();

    Scanner SCANNER = new Scanner(System.in);
}
