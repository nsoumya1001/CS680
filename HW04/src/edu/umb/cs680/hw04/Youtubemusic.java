package edu.umb.cs680.hw04;

public class Youtubemusic {
    private YoutubeMusicMode state;


    public Youtubemusic() {
        this.state = new StopState(); 
    }

    public void setState(YoutubeMusicMode state) {
        this.state = state;
    }

    public void PlayButton() {
        state.PlayMusic(this);
    }

    public void PauseButton() {
        state.PauseMusic(this);
    }

    public void StopButton() {
        state.StopMusic(this);
    }

    public YoutubeMusicMode getState(){
        return this.state;
    }

    public static void main (String[] args) {

    }
}

