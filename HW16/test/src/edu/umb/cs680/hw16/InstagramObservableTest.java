package edu.umb.cs680.hw16;


import edu.umb.cs680.hw16.InstagramObservable;
import edu.umb.cs680.hw16.InstagramUserEvent;
import edu.umb.cs680.hw16.Observable;
import edu.umb.cs680.hw16.Observer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class InstagramObservableTest {

    Observable<InstagramUserEvent> insta = new InstagramObservable ();


    @Test
    public void CountObservers(){
        insta.addObserver((observable, event) -> {
            System.out.println("Update received: " + event.getUpdate());
        });
        insta.addObserver((observable, event) -> {
            System.out.println("The India update:"+ event.getUpdate ());
        });
        insta.addObserver((observable, event) -> {
            System.out.println("The Story update:"+ event.getUpdate ());
        });
        Assertions.assertEquals (3,insta.countObservers ());
    }

    @Test
    public void ClearObserversTest(){
        insta.addObserver((observable, event) -> {
            System.out.println("Update received: " + event.getUpdate());
        });
        insta.addObserver((observable, event) -> {
            System.out.println("The India update:"+ event.getUpdate ());
        });
        insta.addObserver((observable, event) -> {
            System.out.println("The Story update:"+ event.getUpdate ());
        });
        insta.clearObservers ();
        Assertions.assertEquals (0,insta.countObservers ());
    }

    @Test
    public void RemoveObserversTest(){
        Observable<InstagramUserEvent>  insta = new InstagramObservable ();
        Observer<InstagramUserEvent> observer1 = (observable, event) -> {
            System.out.println("Update received: " + event.getUpdate());
        };
        Observer<InstagramUserEvent> observer2 = (observable, event) -> {
            System.out.println("The India update:" + event.getUpdate());
        };
        Observer<InstagramUserEvent> observer3 = (observable, event) -> {
            System.out.println("The Story update:" + event.getUpdate());
        };

        insta.addObserver(observer1);
        insta.addObserver(observer2);
        insta.addObserver(observer3);

        insta.removeObserver(observer2);


        List<Observer<InstagramUserEvent>> currentObservers = insta.getObservers();
        Assertions.assertFalse(currentObservers.contains(observer2));
    }




}
