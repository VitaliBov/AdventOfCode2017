package vitali.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        Scanner inputScanner = getInputScanner();
        assert inputScanner != null;
        String inputString = inputScanner.nextLine();
        int sum = getSum(inputString);
        System.out.println("Answer: " + sum);
    }

    private static Scanner getInputScanner() {
        try {
            return new Scanner(new File(Const.FILES_DIRECTORY + "input01.1.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static int getSum(String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); ++i) {
            sum += input.charAt(i) == input.charAt((i + 1) % input.length()) ?
                    Character.getNumericValue(input.charAt(i)) : 0;
        }
        return sum;
    }
}