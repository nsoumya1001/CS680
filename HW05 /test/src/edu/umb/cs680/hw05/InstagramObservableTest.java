package edu.umb.cs680.hw05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InstagramObservableTest {

    InstagramObservable insta = new InstagramObservable ();
    IndiaObserver ind= new IndiaObserver ();
    PostObserver post=  new PostObserver ();
    StoryObserver story = new StoryObserver ();



    @Test
    public void CountObservers(){
        insta.addObserver (ind);
        insta.addObserver (post);
        insta.addObserver (story);
        Assertions.assertEquals (3,insta.countObservers ());
    }

    @Test
    public void CheckUpdateTest(){
        insta.addObserver (ind);
        insta.addObserver (post);
        insta.addObserver (story);

        insta.UserUpdate ("Soumya uploaded 1 post");

        String expected= "Soumya uploaded 1 post";

        Assertions.assertEquals (expected,insta.latestUpdate);



    }
    @Test
    public void ClearObserversTest(){
        insta.addObserver (ind);
        insta.addObserver (post);
        insta.addObserver (story);
        insta.clearObservers ();
        Assertions.assertEquals (0,insta.countObservers ());
    }

    @Test
    public void RemoveObserversTest(){
        InstagramObservable insta = new InstagramObservable ();
        IndiaObserver ind= new IndiaObserver ();
        PostObserver post=  new PostObserver ();
        StoryObserver story = new StoryObserver ();


        insta.addObserver (ind);
        insta.addObserver (post);
        insta.addObserver (story);

        insta.removeObserver (story);

        Assertions.assertFalse (insta.getObservers ().contains (story));
    }




}
