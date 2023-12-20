package edu.umb.cs680.hw06;

import java.util.LinkedList;
import java.util.List;

public class StepCounter {
    private LinkedList<StepCounterObserver<StepCount>> observers = new LinkedList<> ();

    public void addObserver (StepCounterObserver<StepCount> o) {
        observers.add (o);
    }

    public void clearObservers() {
        observers.clear();

    }
    public List<StepCounterObserver<StepCount>> getObservers(){
        return observers;
    }

    public int countObservers() {
        return observers.size();

    }
    public void removeObserver(StepCounterObserver<StepCount> o) {
        observers.remove(o);
    }

    public void notifyObservers (StepCount event) {
        for (StepCounterObserver ob : observers) {
            ob.updatestepcounter (event);
        }
    }

    public static void main (String[] args) {

    }
}
