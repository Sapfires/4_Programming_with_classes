package com.epam.intro.subtask3;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Student {
    private String name;
    private String group;
    private int[] marks;

    public Student(String name, String group, int[] marks) {
        this.name = name;
        this.group = group;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int[] getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        Random random = new Random();
        List<Student> students = IntStream.range(0, 20)
                .boxed()
                .map(it -> new Student(UUID.randomUUID().toString().substring(0, 5),
                        "B-" + it,
                        IntStream.range(0, 5)
                                .boxed()
                                .map(o1 -> random.nextInt(3) + 8)
                                .mapToInt(o1 -> o1)
                                .toArray()))
                .collect(Collectors.toList());
        students.stream()
                .filter(it->Arrays.stream(it.marks)
                        .boxed()
                        .noneMatch(it0->it0<9))
                .map(it->it.getName() + " " + it.getGroup())
                .forEach(System.out::println);
    }
}
