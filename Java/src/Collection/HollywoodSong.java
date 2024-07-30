package Collection;

public class HollywoodSong {
    private String song;
    private String movie;
    private String album;
    private int rating;
    private String artist;
    private int releaseYear;
    private double duration;
    private String lyricist;

    // Constructor
    public HollywoodSong(String song, String movie, String album, int rating, String artist, int releaseYear, double duration, String lyricist) {
        this.song = song;
        this.movie = movie;
        this.album = album;
        this.rating = rating;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.duration = duration;
        this.lyricist = lyricist;
    }

    // Override toString method
    @Override
    public String toString() {
        return "HollywoodSong{" +
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
}
