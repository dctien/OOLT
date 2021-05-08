package hust.soict.hedspi.aims.media.disc;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{

	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();

	public String getArtist() {
		return artist;
	}

	// Constructor
	public CompactDisc(String id, String title, String category, String artist, float cost) {
		super(id, title, cost);
		this.artist = artist;
		this.category = category;
	}

	public void addTrack(Track track) {
		if(tracks.contains(track)) {
			System.err.println("Track has been existed");
		}else {
			tracks.add(track);
		}
	}

	public void removeTrack(Track track) {
		if(tracks.contains(track)) {
			tracks.remove(track);
		}else {
			System.err.println("Track don't existeds");
		}
	}

	public int getLenght() {
		int sum = 0;
		for(Track track: tracks) {
			sum += track.getLength();
		}
		super.length = sum;
		return sum;
	}
	
	public void play() {
		System.out.println("Playing CD: " + this.getTitle());
		System.out.println("CD length: " + this.getLength());
		for(Track track: tracks) {
			track.play();
		}
	}
}