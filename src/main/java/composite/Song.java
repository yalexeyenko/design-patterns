package composite;

public class Song extends SongComponent {
	private String songName;
	private String bandName;
	private int releaseYear;
	
	public Song(String songName, String bandName, int releaseYear) {
		super();
		this.songName = songName;
		this.bandName = bandName;
		this.releaseYear = releaseYear;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public String getBandName() {
		return bandName;
	}

	public void setBandName(String bandName) {
		this.bandName = bandName;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	@Override
	public void displayInfo() {
		System.out.println("'" + songName + "' by " + bandName + " " + releaseYear);
	}

}
