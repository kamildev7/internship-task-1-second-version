package com.codewise.internship;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Kamil on 2016-06-20.
 */
public class Allegory implements Service {
    private Map<ID, ArrayList<Double>> transactions = new ConcurrentHashMap<>();


    public void put(ID clientId, double money) {
        ArrayList<Double> clientTransactions = transactions.get(clientId);
        if (clientTransactions == null) {
            clientTransactions = new ArrayList<>();
            transactions.put(clientId, clientTransactions);
        }
        clientTransactions.add(money);
    }

    public double get(ID clientId) {
        return transactions.get(clientId).parallelStream().mapToDouble(v -> v).average().getAsDouble();

    }
}
