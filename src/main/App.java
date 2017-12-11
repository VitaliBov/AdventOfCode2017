package main;

public class App {

    public static void main(String[] args) {
        Day01 day01 = new Day01();
        print(1, day01.resultFirst(), day01.resultSecond());

        Day02 day02 = new Day02();
        print(2, day02.resultFirst(), day02.resultSecond());

        Day03 day03 = new Day03();
        print(3, day03.resultFirst(), day03.resultSecond());
    }

    private static void print(int dayNumber, int inputFirst, int inputSecond) {
        System.out.println("Day " + dayNumber + ":");
        System.out.println("1: " + inputFirst);
        System.out.println("2: " + inputSecond);
    }
}