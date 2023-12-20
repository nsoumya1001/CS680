package edu.umb.cs680.hw11;

import java.util.List;

public class Cosine implements DistanceMetric{
    @Override
    public double distance (List<Double> p1, List<Double> p2) {
        double dot = 0;
        double mP1 = 0;
        double mP2 = 0;

        for (int i = 0; i < p1.size(); i++) {
            mP1 += Math.pow(p1.get(i), 2);
            mP2 += Math.pow(p2.get(i), 2);
            dot += p1.get(i) * p2.get(i);
        }

        double mProduct = Math.sqrt(mP1) * Math.sqrt(mP2);

        double result;
        if (mProduct == 0) {
            result = 0;
        } else {
            result = 1 - dot / mProduct;
        }

        return result;
    }
}
