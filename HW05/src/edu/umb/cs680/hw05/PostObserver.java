package edu.umb.cs680.hw05;

public class PostObserver implements Observer<InstagramUserEvent>{

    @Override
    public void update (Observable<InstagramUserEvent> sender, InstagramUserEvent event) {
        System.out.println ("The Post update:"+ event.getUpdate ());
    }
}
