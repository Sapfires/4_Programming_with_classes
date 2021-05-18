package com.epam.intro.subtask15;

public class TourVoucher {
    private Type type;
    private Transportation transportation;
    private Food food;
    private Duration duration;
    private double price;
    private String country;
    private String city;
    private String name;
    public enum Type {
        REST, EXCURSION, TREATMENT, SHOPPING, CROISE, ETC;
    }
    public enum Transportation {
        BUS, PLANE, SHIP, HORSE, BY_FOOT, HELICOPTER, CAR;
    }
    public enum Food {
        NO_MEAL, BREAKFAST, ALL_INCLUSIVE;
    }
    public enum Duration {
        ONE_DAY, WEEKENDS, WEEK, TEN_DAYS, BI_WEEK, FOREVER;
    }

    public TourVoucher(Type type, Transportation transportation, Food food, Duration duration, double price, String country, String city, String name) {
        this.type = type;
        this.transportation = transportation;
        this.food = food;
        this.duration = duration;
        this.price = price;
        this.country = country;
        this.city = city;
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Transportation getTransportation() {
        return transportation;
    }

    public void setTransportation(Transportation transportation) {
        this.transportation = transportation;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TourVoucher{" +
                "type=" + type +
                ", transportation=" + transportation +
                ", food=" + food +
                ", duration=" + duration +
                ", price=" + price +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
