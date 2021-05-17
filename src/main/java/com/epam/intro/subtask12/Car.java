package com.epam.intro.subtask12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Car {
    private Map<WheelLocation, Wheel> wheels = new HashMap<>();
    private FuelTank fuelTank;
    private Engine engine;
    private String carModel;

    public enum WheelLocation {
        LEFT_FRONT, RIGHT_FRONT, LEFT_REAR, RIGHT_REAR
    }

    private class FuelTank {
        private double maxFuelVolume;
        private double currentFuelVolume;

        public FuelTank(double maxFuelVolume) {
            this.maxFuelVolume = maxFuelVolume;
        }

        private void refuel() {
            currentFuelVolume = maxFuelVolume;
        }

        private void consume(double volume) {
            currentFuelVolume = currentFuelVolume - volume;
        }

        @Override
        public String toString() {
            return "FuelTank{" +
                    "maxFuelVolume=" + maxFuelVolume +
                    ", currentFuelVolume=" + currentFuelVolume +
                    '}';
        }
    }


    public Car(double maxFuelTankVolume, double consumption, String carModel) {
        Arrays.stream(WheelLocation.values()).forEach(it -> wheels.put(it, new Wheel()));
        engine = new Engine(consumption);
        fuelTank = new FuelTank(maxFuelTankVolume);
        this.carModel = carModel;
    }

    public void drive(double distance) {
        fuelTank.consume(engine.getConsumption() * distance);
    }
    public void refuel() {
        fuelTank.refuel();
    }
    public void changeWheel(WheelLocation location, Wheel wheel) {
        wheels.put(location, wheel);
    }
    public void printlnModel() {
        System.out.println(carModel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", fuelTank=" + fuelTank +
                ", engine=" + engine +
                ", carModel='" + carModel + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car car = new Car(50, 0.05, "dryndulet");
        System.out.println(car);
        car.refuel();
        System.out.println(car);
        car.drive(135);
        System.out.println(car);
        car.refuel();
        System.out.println(car);
        car.changeWheel(WheelLocation.RIGHT_REAR, new Wheel());
        System.out.println(car);
    }
}
