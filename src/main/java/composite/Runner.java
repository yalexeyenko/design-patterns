package composite;

public class Runner {
	public static void main(String[] args) {
		SongComponent industrialMusic = new SongGroup("Industrial",
				"Style of experimantal music that draws in transgressive and provocative themes");
		SongComponent heavyMetalMusic = new SongGroup("Heavy Metal",
				"Genre of rock that developed in the late 1960s, largely in the UK and in the US");
		SongComponent dubStepMusic = new SongGroup("Dubstep",
				"Genre of electronic dance music that originated in South London, England");
		
		SongComponent playlist = new SongGroup("Playlist 2000", "White Party");
		
		playlist.add(industrialMusic);
		
		industrialMusic.add(new Song("Head Like a Hole", "NIN", 1990));
		industrialMusic.add(new Song("Headhunter", "Front 242", 1988));

		industrialMusic.add(dubStepMusic);
		
		dubStepMusic.add(new Song("Centipede", "Knife Party", 2012));
		dubStepMusic.add(new Song("Tetris", "Doctor P", 2011));

		playlist.add(heavyMetalMusic);
		
		heavyMetalMusic.add(new Song("War Pigs", "Black Sabath", 1970));
		heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));

		DiscJockey discJockey = new DiscJockey(playlist);
		discJockey.printPlaylist();
	}
}
