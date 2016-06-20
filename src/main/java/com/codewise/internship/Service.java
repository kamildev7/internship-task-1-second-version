package com.codewise.internship;

/**
 * Created by Kamil on 2016-06-20.
 */
public interface Service {
    void put(ID clientId, double money);
    double get(ID clientId);
}
