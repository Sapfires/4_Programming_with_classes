package com.epam.intro.subtask5;

import java.util.Random;

public class Counter {
    private int startValue;
    private int endValue;
    private int count;
    private static Random RANDOM = new Random();

    private Counter(int startValue, int endValue, int count) {
        this.startValue = startValue;
        this.endValue = endValue;
        this.count = count;
    }

    public int getStartValue() {
        return startValue;
    }

    public int getEndValue() {
        return endValue;
    }

    public int getCount() {
        return count;
    }

    public int increment() {
        count++;
        if (count > endValue) {
            throw new IndexOutOfBoundsException("Count exceed max value: " + endValue);
        }
        return count;
    }
    public int decrement() {
        count--;
        if (count < endValue) {
            throw new IndexOutOfBoundsException("Count below min value: " + startValue);
        }
        return count;
    }




    public static Counter getCounter(int startValue, int endValue) {
        return new Counter(startValue, endValue, startValue);
    }
    public static Counter getCounter() {
        int one = RANDOM.nextInt();
        int two = RANDOM.nextInt();
        return getCounter(one, two);
    }

    public static void main(String[] args) {
        exampleOne();
        exampleTwo();
        exampleThree();
        exampleFour();
    }

    private static void exampleOne() {
        Counter counter = getCounter(3, 10);
        int countOfIterations = 0;
        try {
            while (true) {
                countOfIterations++;
                counter.increment();
            }
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Exceed max value within " + countOfIterations + " iterations");
        }
    }
    private static void exampleTwo() {
        Counter counter = getCounter(10, 3);
        int countOfIterations = 0;
        try {
            while (true) {
                countOfIterations++;
                counter.decrement();
            }
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Below min value within " + countOfIterations + " iterations");
        }
    }
    private static void exampleThree() {
        Counter counter = getCounter();
        long countOfIterations = 0;
        try {
            while (true) {
                countOfIterations++;
                counter.increment();
            }
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Exceed max value within " + countOfIterations + " iterations");
        }
    }
    private static void exampleFour() {
        Counter counter = getCounter();
        long countOfIterations = 0;
        try {
            while (true) {
                countOfIterations++;
                counter.decrement();
            }
        }catch (IndexOutOfBoundsException e) {
            System.out.println("Below min value within " + countOfIterations + " iterations");
        }
    }

}
