package main;

public class App {

    public static void main(String[] args) {
        Day01 day01 = new Day01();
        print(1, day01.resultFirst(), day01.resultSecond());

        Day02 day02 = new Day02();
        print(2, day02.resultFirst(), day02.resultSecond());

        Day03 day03 = new Day03();
        print(3, day03.resultFirst(), day03.resultSecond());

        Day04 day04 = new Day04();
        print(4, day04.resultFirst(), day04.resultSecond());

        Day05 day05 = new Day05();
        print(5, day05.resultFirst(), day05.resultSecond());

        Day06 day06 = new Day06();
        print(6, day06.resultFirst(), day06.resultSecond());
    }

    private static void print(int dayNumber, int inputFirst, int inputSecond) {
        System.out.println("Day " + dayNumber + ":");
        System.out.println("1: " + inputFirst);
        System.out.println("2: " + inputSecond);
    }
}