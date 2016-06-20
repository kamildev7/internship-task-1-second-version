package com.codewise.internship;

import java.util.Random;

/**
 * Created by Kamil on 2016-06-20.
 */
public class Client implements Runnable{
    private Thread thread;
    private ID clientId;
    private Service service;
    private Random rand;
    private double min = 0.01;
    private double max = 1000.0;

    public Client(ID clientId, Service service) {
        this.clientId = clientId;
        this.service = service;
        thread = new Thread(this);
        rand = new Random();
        thread.start();
    }


    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            double randomValue = min + (max - min) * rand.nextDouble();
            System.out.println(randomValue);
            randomValue = randomValue*100;
            randomValue = Math.round(randomValue);
            randomValue = randomValue/100;

            service.put(clientId, randomValue);

            if(i%2 == 0) {
                System.out.println("srednia: " + service.get(clientId));
            }
        }
    }
}
