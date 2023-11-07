package edu.umb.cs680.hw04;

public class PauseState implements YoutubeMusicMode{
    @Override
    public void PlayMusic(Youtubemusic music) {
        System.out.println("Music started playing");
        music.setState(new PlayState());
    }

    @Override
    public void PauseMusic(Youtubemusic music) {
        System.out.println("Youtube music is paused");
        
    }

    @Override
    public void StopMusic(Youtubemusic music) {
       System.out.println("Youtube music stopped");
       music.setState(new StopState());
    }
}
