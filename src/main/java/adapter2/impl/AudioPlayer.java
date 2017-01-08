package adapter2.impl;

import adapter2.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
	private MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		if ("mp3".equals(audioType)) {
			System.out.println("Playing MP3 file: " + fileName);
		} else if ("vlc".equals(audioType) || "mp4".equals(audioType)) {
			this.mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		} else {
			System.out.println("Invalid media. Cannot support '" + audioType + "' format");
		}
	}

}
