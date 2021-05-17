package com.epam.intro.subtask12;

import java.util.UUID;

public class Wheel {
    private String id;

    public Wheel() {
        id = UUID.randomUUID().toString().substring(1, 5);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "id='" + id + '\'' +
                '}';
    }
}
