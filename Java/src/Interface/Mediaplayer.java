package Interface;

public interface Mediaplayer {

	    int maxvol = 100;
	    int minvol = 0;
	    int minbright = 0;
	    int maxbright = 100;

	    // Methods
	    void play();
	    void pause();
	    void stop();
	    void setVolume(int volume);
}
