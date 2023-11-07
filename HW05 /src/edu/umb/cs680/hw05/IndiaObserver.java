package edu.umb.cs680.hw05;

public class IndiaObserver implements Observer<InstagramUserEvent>{

    @Override
    public void update (Observable<InstagramUserEvent> sender, InstagramUserEvent event) {
        System.out.println ("The India update:"+ event.getUpdate ());
    }
}
