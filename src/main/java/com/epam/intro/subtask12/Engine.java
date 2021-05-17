package com.epam.intro.subtask12;

public class Engine {
    private double consumption;

    public Engine(double consumption) {
        this.consumption = consumption;
    }

    public double getConsumption() {
        return consumption;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "consumption=" + consumption +
                '}';
    }
}
