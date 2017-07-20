package topic1;

public class AudioPlayerDemo {

	public static void main(String[] args) {

		AudioPlayer player = new AudioPlayer();
		player.setState(new AudioPlayState());
		System.out.println(player.myState());
		player.setState(new AudioPauseState());
		System.out.println(player.myState());
		player.setState(new AudioStopState());
		System.out.println(player.myState());
		
	}

}
