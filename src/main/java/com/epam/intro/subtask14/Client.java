package com.epam.intro.subtask14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Client {
    private List<Account> accounts = new ArrayList<>();
    private String name;

    public Client(List<Account> accounts, String name) {
        this.accounts = accounts;
        this.name = name;
    }

    public Client() {
        Random random = new Random();
        this.accounts = IntStream.range(1, 2 + random.nextInt(3))
                .boxed()
                .map(it -> new Account())
                .collect(Collectors.toList());
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public String getName() {
        return name;
    }
    public void addAccount(Account extraAccount) {
        accounts.add(extraAccount);
    }
    public void removeAccount (Account accountForRemove) {
        accounts.remove(accountForRemove);
    }

    @Override
    public String toString() {
        return "Client{" +
                "accounts=" + accounts +
                ", name='" + name + '\'' +
                '}';
    }
}
