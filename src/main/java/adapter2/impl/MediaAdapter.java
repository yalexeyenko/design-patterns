package adapter2.impl;

import adapter2.AdvancedMediaPlayer;
import adapter2.MediaPlayer;

public class MediaAdapter implements MediaPlayer {
	private AdvancedMediaPlayer advancedMediaPlayer;

	public MediaAdapter(String audioType) {
		super();
		if ("mp4".equals(audioType)) {
			this.advancedMediaPlayer = new Mp4Player();
		} else if ("vlc".equals(audioType)) {
			this.advancedMediaPlayer = new VlcPlayer();
		} else {
			this.advancedMediaPlayer = null;
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if ("mp4".equals(audioType)) {
			advancedMediaPlayer.playMp4(fileName);
		} else if ("vlc".equals(audioType)) {
			advancedMediaPlayer.playVlc(fileName);
		}
	}

}
