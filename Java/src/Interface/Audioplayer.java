package Interface;

public class Audioplayer implements Mediaplayer 
{
	
	private int volume;
	private int bright;

	@Override
	public void play() {
		 System.out.println("Playing audio..");
	}

	@Override
	public void pause() {
		 System.out.println("Audio paused..");
	}

	@Override
	public void stop() {
		 System.out.println("Stop the audio.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume >= minvol && volume <= maxvol) {
            this.volume = volume;
            System.out.println("Setting audio volume to: " + volume);
        } else {
            System.out.println("Volume out of range.");
        }
	}
	
	public void setBrightness(int bright)
	{
		if (bright<minbright) {
			System.out.println("Increase the brightness of screen.It's very low!!");
		}
		else if (bright>=minbright && bright<=50) {
			System.out.println("Our mobile screen brightness is sufficient to see video. ");
		} 
		else if (bright>50 && bright<=maxbright) {
			System.out.println("Screen brightness is very hight.It's harmful to our eyes.");
		}
		else{
             System.out.println("Mobile brighness is out of the range.");
		}
	}

}
