package composite;

public class DiscJockey {
	private SongComponent playlist;

	public DiscJockey(SongComponent playlist) {
		super();
		this.playlist = playlist;
	}

	public void printPlaylist() {
		playlist.displayInfo();
	}
	
}
