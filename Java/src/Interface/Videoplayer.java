package Interface;

public class Videoplayer extends Audioplayer implements Mediaplayer 
{
	 
	private int bright;
	 

	@Override
	public void play() {
		 System.out.println("Play the video..");
	}

	@Override
	public void pause() {
		 System.out.println("Video paused..");
	}

	@Override
	public void stop() {
		 System.out.println("Video Stopping.");
	}

	@Override
	public void setVolume(int volume) {
		 if (volume>=minvol && volume<=maxvol) {
			 System.out.println("Volume is in the range of Headphones..");
		} 
		 else {
             System.out.println("Volume is in out of the range.");
		}
	}
	
	

}
