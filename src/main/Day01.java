package main;

public class Day01 extends BaseDay<char[]> {
    private char[] input = getInput();

    @Override
    public int resultFirst() {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == input[(i + 1) % input.length]) {
                sum += (input[i] - '0');
            }
        }
        return sum;
    }

    @Override
    public int resultSecond() {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == input[(i + (input.length/2)) % input.length]) {
                sum += (input[i] - '0');
            }
        }
        return sum;
    }

    @Override
    char[] getInput() {
        return FileReader.getInputChar("input01.txt");
    }
}