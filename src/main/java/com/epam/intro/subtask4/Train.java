package com.epam.intro.subtask4;

import java.time.ZonedDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Train {
    private Destination destination;
    private String number;
    private ZonedDateTime departure;

    public Train(Destination destination, String number, ZonedDateTime departure) {
        this.destination = destination;
        this.number = number;
        this.departure = departure;
    }

    public Destination getDestination() {
        return destination;
    }

    public String getNumber() {
        return number;
    }

    public ZonedDateTime getDeparture() {
        return departure;
    }

    @Override
    public String toString() {
        return "Train{" +
                "destination=" + destination +
                ", number='" + number + '\'' +
                ", departure=" + departure +
                '}';
    }

    private enum Destination {
        ZYABAROUKA, PATAPAUKA;
    }


    public static void main(String[] args) {
        String trainNumber = readVariable("Train Number: ");
        Random random = new Random();
        List<Train> trains = IntStream.range(0, 5)
                .boxed()
                .map(it -> new Train(random.nextBoolean() ? Destination.ZYABAROUKA : Destination.PATAPAUKA,
                        "m-" + it, ZonedDateTime.now().minusMinutes(3 * it)))
                .collect(Collectors.toList());
        trains.stream()
                .filter(train -> trainNumber.equals(train.getNumber()))
                .findAny()
                .ifPresentOrElse(System.out::println, () -> {
                    System.out.println("Train is not found");
                });
        System.out.println("------------------------------------");
        trains.stream().sorted(Comparator.comparing(Train::getNumber)).forEach(System.out::println);
        System.out.println("------------------------------------");
        trains.stream().sorted((o1, o2) -> o1.getDestination().compareTo(o2.getDestination()) == 0
                ? o1.getDeparture().compareTo(o2.getDeparture())
                : o1.getDestination().compareTo(o2.getDestination())).forEach(System.out::println);
    }

    public static String readVariable(String variableName) {
        System.out.println("Please input " + variableName);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

}
