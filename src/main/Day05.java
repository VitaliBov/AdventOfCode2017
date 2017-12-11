package main;

import java.util.List;

public class Day05 extends BaseDay<List<String>> {
    private List<String> input = getInput();

    @Override
    public int resultFirst() {
        int count = 0;
        int[] values = input.stream().mapToInt(Integer::parseInt).toArray();
        int step = 0;
        while (step < input.size()) {
            int oldStep = step;
            step += values[step];
            values[oldStep]++;
            count++;
        }
        return count;
    }

    @Override
    public int resultSecond() {
        int count = 0;
        int[] values = input.stream().mapToInt(Integer::parseInt).toArray();
        int step = 0;
        while (step < input.size()) {
            int oldStep = step;
            step += values[step];
            if (values[oldStep] >= 3) {
                values[oldStep]--;
            } else {
                values[oldStep]++;
            }
            count++;
        }
        return count;
    }

    @Override
    List<String> getInput() {
        return FileReader.getInputString("input05.txt");
    }
}