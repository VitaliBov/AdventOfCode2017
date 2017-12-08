package main;

import java.util.Arrays;
import java.util.List;

public class Day02 extends BaseDay<List<String>> {
    private List<String> input = getInput();

    @Override
    public int resultFirst() {
        int sum = 0;
        for (String line : input) {
            int[] values = Arrays.stream(line.split("\\s+")).mapToInt(Integer::parseInt).sorted().toArray();
            int max = values[values.length - 1];
            int min = values[0];
            sum += max - min;
        }
        return sum;
    }

    @Override
    public int resultSecond() {
        int sum = 0;
        for (String line : input) {
            int[] values = Arrays.stream(line.split("\\s+")).mapToInt(Integer::parseInt).sorted().toArray();
            for (int i = values.length - 1; i >= 0; i--) {
                for (int j = i - 1; j >= 0; j--) {
                    if (values[i] % values[j] == 0) {
                        sum += values[i] / values[j];
                    }
                }
            }
        }
        return sum;
    }

    @Override
    List<String> getInput() {
        return FileReader.getInputString("input02.txt");
    }
}