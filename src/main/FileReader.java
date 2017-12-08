package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    private static final String FILES_DIRECTORY = "/home/vitali/IdeaProjects/AdventOfCode2017/input/";

    static char[] getInputChar(String fileName) {
        Scanner inputScanner = getInputScanner(fileName);
        assert inputScanner != null;
        return inputScanner.nextLine().toCharArray();
    }

    static List<String> getInputString(String fileName) {
        try {
            return Files.readAllLines(Paths.get(FILES_DIRECTORY + fileName));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
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