package com.epam.intro.subtask15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TourVoucherCompany {
    private List<TourVoucher> tourVouchers = new ArrayList<>();

    public TourVoucherCompany(List<TourVoucher> tourVouchers) {
        this.tourVouchers = tourVouchers;
    }

    public List<TourVoucher> getTourVouchers() {
        return tourVouchers;
    }
    public List<TourVoucher> getTourVouchersByFilter(TourVoucherFilter filter) {
        return tourVouchers.stream()
                .filter(it -> filter.getDuration() == null || filter.getDuration().equals(it.getDuration()))
                .filter(it -> filter.getFood() == null || filter.getFood().equals(it.getFood()))
                .filter(it -> filter.getTransportation() == null || filter.getTransportation().equals(it.getTransportation()))
                .filter(it -> filter.getType() == null || filter.getType().equals(it.getType()))
                .sorted(Comparator.comparing(TourVoucher::getPrice))
                .collect(Collectors.toList());
    }
}
