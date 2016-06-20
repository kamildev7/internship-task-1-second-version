package com.codewise.internship;

/**
 * Created by Kamil on 2016-06-20.
 */
public class Main {
    public static void main(String[] args) {
        Service service = new Allegory();

        Client client1 = new Client(new ID("A"), service);
        Client client2 = new Client(new ID("B"), service);

    }
}
