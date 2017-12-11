package main;

public class Day03 extends BaseDay<Integer> {
    private int input = getInput();
    private int arraySize = 11;
    private int arrayCenter = arraySize/2;

    @Override
    public int resultFirst() {
        int result;
        int number = 3; //for number 3, the coordinates x = 1, y = 1
        int x = 1;
        int y = 1;
        int angle = 2;
        int angleStartNextRow;
        while (number < input) {
            switch (angle % 4) {
                case 0:
                    angleStartNextRow = -x + 1;
                    number += Math.abs(angleStartNextRow - x);
                    x = angleStartNextRow;
                    if (number > input) {
                        x -= (number - input);
                    }
                    break;
                case 1:
                    angleStartNextRow = -y + 1;
                    number += Math.abs(angleStartNextRow - y);
                    y = angleStartNextRow;
                    if (number > input) {
                        y -= (number - input);
                    }
                    break;
                case 2:
                    angleStartNextRow = -x;
                    number += Math.abs(angleStartNextRow - x);
                    x = angleStartNextRow;
                    if (number > input) {
                        x += (number - input);
                    }
                    break;
                case 3:
                    angleStartNextRow = -y;
                    number += Math.abs(angleStartNextRow - y);
                    y = angleStartNextRow;
                    if (number > input) {
                        y += (number - input);
                    }
                    break;
            }
            angle++;
        }
        result = (Math.abs(x) + Math.abs(y));
        return result;
    }

    @Override
    public int resultSecond() {
        int[][] array = new int[arraySize][arraySize];
        int x = 0;
        int y = 0;
        array[arrayCenter][arrayCenter] = 1; //central cell of the array
        int angle = 0;
        int angleStartNextRow;
        while (true) {
            switch (angle % 4) {
                case 0:
                    angleStartNextRow = -x + 1;
                    for (int j = x + 1; j <= angleStartNextRow; j++) {
                        array[y + arrayCenter][j + arrayCenter] = calcValue(j, y, array);
                        if (checkLargerValue(array[y + arrayCenter][j + arrayCenter])) {
                            return array[y + arrayCenter][j + arrayCenter];
                        }
                    }
                    x = angleStartNextRow;
                    break;
                case 1:
                    angleStartNextRow = -y + 1;
                    for (int j = y + 1; j <= angleStartNextRow; j++) {
                        array[j + arrayCenter][x + arrayCenter] = calcValue(x, j, array);
                        if (checkLargerValue(array[y + arrayCenter][j + arrayCenter])) {
                            return array[y + arrayCenter][j + arrayCenter];
                        }
                    }
                    y = angleStartNextRow;
                    break;
                case 2:
                    angleStartNextRow = -x;
                    for (int j = x - 1; j >= angleStartNextRow; j--) {
                        array[y + arrayCenter][j + arrayCenter] = calcValue(j, y, array);
                        if (checkLargerValue(array[y + arrayCenter][j + arrayCenter])) {
                            return array[y + arrayCenter][j + arrayCenter];
                        }
                    }
                    x = angleStartNextRow;
                    break;
                case 3:
                    angleStartNextRow = -y;
                    for (int j = y - 1; j >= angleStartNextRow; j--) {
                        array[j + arrayCenter][x + arrayCenter] = calcValue(x, j, array);
                        if (checkLargerValue(array[y + arrayCenter][j + arrayCenter])) {
                            return array[y + arrayCenter][j + arrayCenter];
                        }
                    }
                    y = angleStartNextRow;
                    break;
            }
            angle++;
        }
    }

    private boolean checkLargerValue(int l) {
        return l > input;
    }

    private int calcValue(int x, int y, int[][] values) {
        return values[y + 1 + arrayCenter][x - 1 + arrayCenter] + values[y + arrayCenter][x - 1 + arrayCenter] +
                values[y - 1 + arrayCenter][x - 1 + arrayCenter] + values[y + 1 + arrayCenter][x + arrayCenter] +
                values[y - 1 + arrayCenter][x + arrayCenter] + values[y + 1 + arrayCenter][x + 1 + arrayCenter] +
                values[y + arrayCenter][x + 1 + arrayCenter] + values[y - 1 + arrayCenter][x + 1 + arrayCenter];
    }

    @Override
    Integer getInput() {
        return 289326;
    }
}