package com.epam.intro.subtask10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Airport {
    private List<Airline> airlines;

    public Airport(List<Airline> airlines) {
        this.airlines = airlines;
    }

    public Airport() {
        this.airlines = new ArrayList<>();
    }

    public List<Airline> getAirlines() {
        return airlines;
    }

    public void setAirlines(List<Airline> airlines) {
        this.airlines = airlines;
    }

    public static Airport stubAirport() {
        Random random = new Random();
        return new Airport(IntStream.range(0, 10).boxed().map(Airline::getRandomStub).collect(Collectors.toList()));
    }

    public List<Airline> getByDestination(Airline.Destination destination) {
        return airlines.stream().filter(it -> it.getDestination().equals(destination)).collect(Collectors.toList());
    }

    public List<Airline> getByDayOfWeek(Airline.DayOfWeek dayOfWeek) {
        return airlines.stream().filter(it -> it.getDayOfWeeks().contains(dayOfWeek)).collect(Collectors.toList());
    }

    public List<Airline> getByDayOfWeekAndTime(Airline.DayOfWeek dayOfWeek, Airline.DepartureTime departureTime) {
        return airlines.stream()
                .filter(it -> it.getDayOfWeeks().contains(dayOfWeek))
                .filter(it -> it.getDeparture().compare(departureTime) > 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Airport airport = Airport.stubAirport();
        Airline.Destination destination = Airline.Destination.getRandom();
        System.out.println("Random destination: " + destination);
        airport.getByDestination(destination).forEach(System.out::println);
        Airline.DayOfWeek dayOfWeek = Airline.DayOfWeek.getRandom();
        System.out.println("Random day of week: " + dayOfWeek);
        airport.getByDayOfWeek(dayOfWeek).forEach(System.out::println);
        Airline.DepartureTime departureTime = Airline.DepartureTime.MORNING;
        System.out.println("Random departure time: " + Airline.DepartureTime.MORNING);
        airport.getByDayOfWeekAndTime(dayOfWeek, departureTime).forEach(System.out::println);
    }
}
