package com.epam.intro.subtask1;

public class Test1 {
    private int one;
    private int two;

    public void setOne(int one) {
        this.one = one;
    }

    public void setTwo(int two) {
        this.two = two;
    }

    public void printToConsole() {
        System.out.println(one + ", " + two);
    }
    public int sum() {
        return one + two;
    }
    public int max() {
        return Math.max(one, two);
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.setOne(5);
        test1.setTwo(12);
        System.out.println(test1.sum());
        System.out.println(test1.max());
        test1.printToConsole();
    }
}
