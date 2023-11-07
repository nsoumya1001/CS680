package edu.umb.cs680.hw04;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class YoutubeMusicTest {


    @Test
    public void InitialStateStopTest(){

        Youtubemusic music = new Youtubemusic ();
        assertTrue(music.getState ()instanceof StopState);

    }

    @Test
    public void PlayStateTest(){

        Youtubemusic music = new Youtubemusic ();
        assertTrue(music.getState ()instanceof StopState);
        music.setState (new PlayState ());
        assertTrue(music.getState ()instanceof PlayState);

    }

    @Test
    public void PauseStateTest(){

        Youtubemusic music = new Youtubemusic ();
        assertTrue(music.getState ()instanceof StopState);
        music.setState (new PauseState ());
        assertTrue(music.getState ()instanceof PauseState);

    }

    @Test
    public void PlayToPauseTest(){
        Youtubemusic music = new Youtubemusic ();
        music.setState (new PlayState ());
        assertTrue(music.getState ()instanceof PlayState);
        music.setState (new PauseState ());
        assertTrue(music.getState ()instanceof PauseState);
    }

    @Test
    public void PauseToPlayTest(){
        Youtubemusic music = new Youtubemusic ();
        music.setState (new PauseState ());
        assertTrue(music.getState ()instanceof PauseState);
        music.setState (new PlayState ());
        assertTrue(music.getState ()instanceof PlayState);
    }
}
