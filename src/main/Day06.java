package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day06 extends BaseDay<List<Integer>> {
    private List<Integer> input = getInput();

    @Override
    public int resultFirst() {
        Set<List<Integer>> sum = new HashSet<>();
        while (!sum.contains(input)) {
            sum.add(new ArrayList<>(input));
            int max = 0;
            for (int i = 0; i < input.size(); i++) {
                if (input.get(i) > input.get(max)) {
                    max = i;
                }
            }
            int num = input.get(max);
            input.set(max, 0);
            while (num > 0) {
                input.set(++max % input.size(), input.get(max % input.size()) + 1);
                num--;
            }
        }
        return sum.size();
    }

    @Override
    public int resultSecond() {
        int sum = 0;

        return sum;
    }

    @Override
    List<Integer> getInput() {
        return FileReader.getInputInteger("input06.txt");
    }
}