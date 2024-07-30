package Collection;

import java.util.ArrayList;

public class BollywoodSong {

	String song;
	String movie;
	String album;
	int rating;
	String artist;
	int releaseYear;
	double duration;
	String lyricist;
	
	public BollywoodSong() {
		
	}
	
	public BollywoodSong(String song,String movie,String album,int rating,String artist,int releaseYear,double duration,String lyricist) {
		this.song = song;
		this.movie = movie;
		this.album = album;
		this.rating = rating;
		this.artist = artist;
		this.releaseYear = releaseYear;
		this.duration = duration;
		this.lyricist = lyricist;
	}
	
	public String toString() {
		return "BollywoodSong{" +
                "song='" + song + '\'' +
                ", movie='" + movie + '\'' +
                ", album='" + album + '\'' +
                ", rating=" + rating +
                ", artist='" + artist + '\'' +
                ", releaseYear=" + releaseYear +
                ", duration=" + duration +
                ", lyricist='" + lyricist + '\'' +
                '}';
	}
	
	 public static void main(String[] args) {
		 
	        // Creating an ArrayList of BollywoodSong objects
	        ArrayList<BollywoodSong> songs = new ArrayList<>();

	        // Adding BollywoodSong objects to the list
	        songs.add(new BollywoodSong("Tum Hi Ho", "Aashiqui 2", "Aashiqui 2", 5, "Arijit Singh", 2013, 4.22, "Mithoon"));
	        songs.add(new BollywoodSong("Kabira", "Yeh Jawaani Hai Deewani", "Yeh Jawaani Hai Deewani", 5, "Arijit Singh, Harshdeep Kaur", 2013, 3.42, "Amitabh Bhattacharya"));
	        songs.add(new BollywoodSong("Kal Ho Naa Ho", "Kal Ho Naa Ho", "Kal Ho Naa Ho", 5, "Sonu Nigam", 2003, 5.21, "Javed Akhtar"));
	        songs.add(new BollywoodSong("Chaiyya Chaiyya", "Dil Se", "Dil Se", 5, "Sukhwinder Singh, Sapna Awasthi", 1998, 6.53, "Gulzar"));
	        songs.add(new BollywoodSong("Tera Ban Jaunga", "Kabir Singh", "Kabir Singh", 5, "Akhil Sachdeva, Tulsi Kumar", 2019, 3.56, "Kumaar"));
	        songs.add(new BollywoodSong("Agar Tum Saath Ho", "Tamasha", "Tamasha", 5, "Alka Yagnik, Arijit Singh", 2015, 5.41, "Irshad Kamil"));
	        songs.add(new BollywoodSong("Tujh Mein Rab Dikhta Hai", "Rab Ne Bana Di Jodi", "Rab Ne Bana Di Jodi", 5, "Roop Kumar Rathod", 2008, 4.44, "Jaideep Sahni"));
	        songs.add(new BollywoodSong("Galliyan", "Ek Villain", "Ek Villain", 5, "Ankit Tiwari", 2014, 5.41, "Manoj Muntashir"));
	        songs.add(new BollywoodSong("Dil Diyan Gallan", "Tiger Zinda Hai", "Tiger Zinda Hai", 5, "Atif Aslam", 2017, 4.19, "Irshad Kamil"));
	        songs.add(new BollywoodSong("Senorita", "Zindagi Na Milegi Dobara", "Zindagi Na Milegi Dobara", 5, "Farhan Akhtar, Hrithik Roshan, Abhay Deol, Maria del Mar Fernandez", 2011, 4.56, "Javed Akhtar"));

	        // Printing out each song using the toString method
	        for (BollywoodSong song : songs) {
	            System.out.println(song);
	        }
	    }
}
