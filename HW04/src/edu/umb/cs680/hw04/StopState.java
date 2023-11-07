package edu.umb.cs680.hw04;

public class StopState implements YoutubeMusicMode{
        @Override
    public void PlayMusic(Youtubemusic music) {
        System.out.println("The music started playing");
        music.setState(new PlayState());
    }

    @Override
    public void PauseMusic(Youtubemusic music) {
        System.out.println("Youtube music paused");
        music.setState(new PauseState());
    }

    @Override
    public void StopMusic(Youtubemusic music) {
       System.out.println("Youtube music is stopped");
    
    }
}