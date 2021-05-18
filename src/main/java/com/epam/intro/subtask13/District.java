package com.epam.intro.subtask13;

import java.util.Random;
import java.util.UUID;

public class District {
    private double square;
    private String name;

    public District() {
        Random random = new Random();
        this.square = random.nextInt(10);
        this.name = UUID.randomUUID().toString().substring(1, 5);
    }

    public District(double square, String name) {
        this.square = square;
        this.name = name;
    }

    public double getSquare() {
        return square;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "District{" +
                "square=" + square +
                ", name='" + name + '\'' +
                '}';
    }
}
