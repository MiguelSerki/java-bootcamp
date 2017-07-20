package topic1;

public class AudioPlayer implements AudioPlayerState {

	private AudioPlayerState state;
	
	@Override
	public String myState() {

		return state.myState();
	}

	public AudioPlayerState getState() {
		return state;
	}

	public void setState(AudioPlayerState state) {
		this.state = state;
	}

}
