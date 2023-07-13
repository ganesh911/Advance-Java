package spring.ioc.setter_object;

public class Car {
	Music_Player musicPlayer ;	
	
	public void setMusicPlayer(Music_Player musicPlayer) {
		this.musicPlayer = musicPlayer;
	}
	public void run() {
		musicPlayer.play();
	}
}
