package edu.umb.cs680.hw12;

import java.util.Comparator;

public class ParetoComparator implements Comparator<edu.umb.cs680.hw12.Car> {
    @Override
    public int compare(edu.umb.cs680.hw12.Car c1, Car c2) {

        return c1.getDominationcount()-c2.getDominationcount();
    }
}
