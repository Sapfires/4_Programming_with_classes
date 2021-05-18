package com.epam.intro.subtask13;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class State {
    private List<District> districts = new ArrayList<>();
    private City center;
    private String name;

    public State() {
        this.districts = IntStream.range(1, 3).boxed().map(it -> new District()).collect(Collectors.toList());
        this.center = new City();
        this.name = UUID.randomUUID().toString().substring(1, 5);
    }

    public State(List<District> districts, City center, String name) {
        this.districts = districts;
        this.center = center;
        this.name = name;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public City getCenter() {
        return center;
    }

    public String getName() {
        return name;
    }

    public double getSquare() {
        return districts.stream().map(District::getSquare).mapToDouble(it -> it).sum();
    }

    @Override
    public String toString() {
        return "State{" +
                "districts=" + districts +
                ", center=" + center +
                ", name='" + name + '\'' +
                '}';
    }
}
