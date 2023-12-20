package edu.umb.cs680.hw16;

public class InstagramObservable extends Observable {


    //public String latestUpdate;

    public void UserUpdate(String update) {
        this.latestUpdate = update;
        System.out.println("User posted a new update: " + update);
        notifyObservers(new InstagramUserEvent (update));
    }


}
