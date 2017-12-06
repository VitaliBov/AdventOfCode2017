package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day01 extends BaseClass {

    public static void main(String[] args) {
        Scanner inputScanner = getInputScanner();
        assert inputScanner != null;
        char[] chars = inputScanner.nextLine().toCharArray();
        int firstSum = getFirstSum(chars);
        int secondSum = getSecondSum(chars);
        print("Answer 1", firstSum);
        print("Answer 2", secondSum);
    }

    private static Scanner getInputScanner() {
        try {
            return new Scanner(new File(FILES_DIRECTORY + "input01.1.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static int getFirstSum(char[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == input[(i + 1) % input.length]) {
                sum += (input[i] - '0');
            }
        }
        return sum;
    }

    private static int getSecondSum(char[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == input[(i + (input.length/2)) % input.length]) {
                sum += (input[i] - '0');
            }
        }
        return sum;
    }
}