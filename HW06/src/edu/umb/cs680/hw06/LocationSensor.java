package edu.umb.cs680.hw06;



import java.util.LinkedList;
import java.util.List;

public class LocationSensor {
    private LinkedList<LocationObserver<Location>> observers = new LinkedList<> ();

    public void addObserver (LocationObserver<Location> o) {
        observers.add (o);
    }

    public void clearObservers() {
        observers.clear();

    }
    public List<LocationObserver<Location>> getObservers(){
        return observers;
    }

    public int countObservers() {
        return observers.size();

    }
    public void removeObserver(LocationObserver<Location> o) {
        observers.remove(o);
    }

    public void notifyObservers (Location event) {
        for (LocationObserver ob : observers) {
            ob.updatelocation (event);
        }
    }

}
