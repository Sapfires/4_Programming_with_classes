package com.epam.intro.subtask13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Country {
    private City capital;
    private List<State> states = new ArrayList<>();
    private String name;

    public Country() {
        Random random = new Random();
        this.capital = new City();
        this.states = IntStream.range(1, 3).boxed().map(it -> new State()).collect(Collectors.toList());
        this.name = UUID.randomUUID().toString().substring(1, 5);
    }

    public Country(City capital, List<State> states, String name) {
        this.capital = capital;
        this.states = states;
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public List<State> getStates() {
        return states;
    }
    public double getSquare() {
        return states.stream().map(State::getSquare).mapToDouble(it -> it).sum();
    }
    public int getStatesCount() {
        return states.size();
    }
    @Override
    public String toString() {
        return "Country{" +
                "capital=" + capital +
                ", states=" + states +
                '}';
    }

    public static void main(String[] args) {
        Country country = new Country();
        System.out.println(country);
        System.out.println(country.getCapital());
        System.out.println(country.getSquare());
        System.out.println(country.getStatesCount());
    }
}
