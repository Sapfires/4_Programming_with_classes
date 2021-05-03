package com.epam.intro.subtask8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Customers {
    private List<Customer> customers = new ArrayList<>();

    public Customers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getSorted() {
        return customers.stream()
                .sorted(Comparator.comparing(Customer::getSurname)
                        .thenComparing(Customer::getName)
                        .thenComparing(Customer::getPatronymic))
                .collect(Collectors.toList());
    }

    public List<Customer> getByCreditCard(int begin, int end) {
        return customers.stream()
                .filter(it -> it.getCardNumber() > begin && it.getCardNumber() < end)
                .collect(Collectors.toList());
    }

    public static Customers getSampleCustomers() {
        Random random = new Random();
        List<Customer> customerList = IntStream.range(0, 100)
                .boxed()
                .map(it -> new Customer(it,
                        UUID.randomUUID().toString().substring(0, 5),
                        UUID.randomUUID().toString().substring(0, 5),
                        UUID.randomUUID().toString().substring(0, 5),
                        UUID.randomUUID().toString().substring(0, 5),
                        random.nextInt(200),
                        random.nextInt(200)))
                .collect(Collectors.toList());
        return new Customers(customerList);
    }

    public static void main(String[] args) {
        Customers customers = getSampleCustomers();
        customers.getSorted().forEach(System.out::println);
    }
}
