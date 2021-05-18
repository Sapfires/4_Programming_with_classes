package com.epam.intro.subtask13;

import java.util.UUID;

public class City {
    private String name;

    public City() {
        this.name = UUID.randomUUID().toString().substring(1, 5);
    }

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }
}
