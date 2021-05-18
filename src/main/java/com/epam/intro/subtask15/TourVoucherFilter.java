package com.epam.intro.subtask15;

public class TourVoucherFilter {
    private TourVoucher.Type type = null;
    private TourVoucher.Transportation transportation = null;
    private TourVoucher.Food food = null;
    private TourVoucher.Duration duration = null;

    public TourVoucherFilter(TourVoucher.Type type, TourVoucher.Transportation transportation, TourVoucher.Food food, TourVoucher.Duration duration) {
        this.type = type;
        this.transportation = transportation;
        this.food = food;
        this.duration = duration;
    }

    public TourVoucher.Type getType() {
        return type;
    }

    public TourVoucher.Transportation getTransportation() {
        return transportation;
    }

    public TourVoucher.Food getFood() {
        return food;
    }

    public TourVoucher.Duration getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "TourVoucherFilter{" +
                "type=" + type +
                ", transportation=" + transportation +
                ", food=" + food +
                ", duration=" + duration +
                '}';
    }
}
