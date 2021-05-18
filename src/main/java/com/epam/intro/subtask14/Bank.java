package com.epam.intro.subtask14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bank {
    private List<Client> clients = new ArrayList<>();

    public Account getMax() {
        return clients.stream()
                .flatMap(it -> it.getAccounts().stream()).max(Comparator.comparing(Account::getAmount))
                .get();
    }

    public Account getMin() {
        return clients.stream()
                .flatMap(it -> it.getAccounts().stream()).min(Comparator.comparing(Account::getAmount))
                .get();
    }

    public List<Account> getByClient(Client client) {
        return client.getAccounts();
    }

    public List<Account> getAccountsWithPositiveAmount() {
        return clients.stream()
                .flatMap(it -> it.getAccounts().stream())
                .filter(it -> it.getAmount() > 0)
                .collect(Collectors.toList());
    }

    public List<Account> getAccountsWithNegativeAmount() {
        return clients.stream()
                .flatMap(it -> it.getAccounts().stream())
                .filter(it -> it.getAmount() < 0)
                .collect(Collectors.toList());
    }

    public double getTotalPositiveAmount() {
        return getAccountsWithPositiveAmount().stream().mapToDouble(Account::getAmount).sum();
    }
    public double getTotalNegativeAmount() {
        return getAccountsWithNegativeAmount().stream().mapToDouble(Account::getAmount).sum();
    }
}
