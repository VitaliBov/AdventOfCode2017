package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

abstract class BaseClass {
    private static final String FILES_DIRECTORY = "/home/vitali/IdeaProjects/AdventOfCode2017/input/";

    static void print(String desc, int input) {
        System.out.println(desc + ": " + input);
    }

    static char[] getInput(String name) {
        Scanner inputScanner = getInputScanner(name);
        assert inputScanner != null;
        return inputScanner.nextLine().toCharArray();
    }

    private static Scanner getInputScanner(String name) {
        try {
            return new Scanner(new File(FILES_DIRECTORY + name));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}