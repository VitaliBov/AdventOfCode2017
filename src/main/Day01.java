package main;

public class Day01 extends BaseClass {

    public static void main(String[] args) {
        char[] input = getInput("input01.1.txt");
        int firstSum = getFirstSum(input);
        int secondSum = getSecondSum(input);
        print("Answer 1", firstSum);
        print("Answer 2", secondSum);
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