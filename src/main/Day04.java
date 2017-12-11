package main;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Day04 extends BaseDay<List<String>> {
    private List<String> input = getInput();

    @Override
    public int resultFirst() {
        int count = 0;
        for (String passphrase : input) {
            Set<String> words = new HashSet<>();
            String[] pass = passphrase.split("\\s+");
            boolean valid = true;
            for (String x : pass) {
                if (!words.add(x)) {
                    valid = false;
                    break;
                }
            }
            if(valid) count++;
        }
        return count;
    }

    @Override
    public int resultSecond() {
        int count = 0;
        for (String passphrase : input) {
            Set<String> words = new HashSet<>();
            String[] pass = passphrase.split("\\s+");
            boolean valid = true;
            for (String x : pass) {
                if (!words.add(sort(x))) {
                    valid = false;
                    break;
                }
            }
            if(valid) count++;
        }
        return count;
    }

    private String sort(String string) {
        char[] array = string.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }

    @Override
    List<String> getInput() {
        return FileReader.getInputString("input04.txt");
    }
}