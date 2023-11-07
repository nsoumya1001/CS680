package edu.umb.cs680.hw04;

public class PlayState implements YoutubeMusicMode  {

    @Override
    public void PlayMusic(Youtubemusic music) {
        System.out.println("The music is playing");
    }

    @Override
    public void PauseMusic(Youtubemusic music) {
        System.out.println("Youtube music paused");
        music.setState(new PauseState());
    }

    @Override
    public void StopMusic(Youtubemusic music) {
       System.out.println("Youtube music stopped");
       music.setState(new StopState());
    }
    
}
