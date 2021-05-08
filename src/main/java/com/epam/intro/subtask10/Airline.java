package com.epam.intro.subtask10;

import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Airline {
    private static Random RANDOM = new Random();
    private Destination destination;
    private int number;
    private PlaneType planeType;
    private DepartureTime departure;
    private List<DayOfWeek> dayOfWeeks;
    public enum Destination {
        ZYABAROUKA(0), PATAPAUKA(1);
        private int id;

        Destination(int id) {
            this.id = id;
        }

        public static Destination getRandom() {
            int id = RANDOM.nextInt(2);
            return Arrays.stream(values()).filter(it -> it.id == id).findAny().get();
        }
    }
    public enum DayOfWeek {
        MONDAY(0), TUESDAY(1), WEDNESDAY(2), THURSDAY(3), FRIDAY(4), SATURDAY(5), SUNDAY(6);
        private int id;

        DayOfWeek(int id) {
            this.id = id;
        }
        public static DayOfWeek getById(int id) {
            return Arrays.stream(values()).filter(it -> it.id == id).findAny().get();
        }
        public static DayOfWeek getRandom() {
            int id = RANDOM.nextInt(7);
            return Arrays.stream(values()).filter(it -> it.id == id).findAny().get();
        }
    }
    public enum PlaneType{
        HELICOPTER(0), TANK(1), VACUUM_CLEANER(2), BMW(3);
        private int id;

        PlaneType(int id) {
            this.id = id;
        }
        public static PlaneType getRandom() {
            int id = RANDOM.nextInt(4);
            return Arrays.stream(values()).filter(it -> it.id == id).findAny().get();
        }
    };
    public enum DepartureTime {
        MORNING(0), AFTERNOON(1), EVENING(2);
        private int id;

        DepartureTime(int id) {
            this.id = id;
        }
        public static DepartureTime getRandom() {
            int id = RANDOM.nextInt(3);
            return Arrays.stream(values()).filter(it -> it.id == id).findAny().get();
        }
        public int compare(DepartureTime departureTime) {
            return id - departureTime.id;
        }
    }

    public Airline() {
    }

    public Airline(Destination destination, int number, PlaneType planeType, DepartureTime departure, List<DayOfWeek> dayOfWeeks) {
        this.destination = destination;
        this.number = number;
        this.planeType = planeType;
        this.departure = departure;
        this.dayOfWeeks = dayOfWeeks;
    }
    public static Airline getRandomStub(int number) {
        return new Airline(Destination.getRandom(), number, PlaneType.getRandom(), DepartureTime.getRandom(),
                IntStream.range(0, 7).boxed().map(DayOfWeek::getById).filter(it -> RANDOM.nextBoolean()).collect(Collectors.toList()));
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public DepartureTime getDeparture() {
        return departure;
    }

    public void setDeparture(DepartureTime departure) {
        this.departure = departure;
    }

    public List<DayOfWeek> getDayOfWeeks() {
        return dayOfWeeks;
    }

    public void setDayOfWeeks(List<DayOfWeek> dayOfWeeks) {
        this.dayOfWeeks = dayOfWeeks;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", number=" + number +
                ", planeType=" + planeType +
                ", departure=" + departure +
                ", dayOfWeeks=" + dayOfWeeks +
                '}';
    }
}
