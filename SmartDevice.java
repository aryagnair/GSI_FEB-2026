package assignment;

interface Camera
{
	void takePhoto();
}
interface MusicPlayer
{
	void playMusic();
}
interface SmartFeatures
{
	void connectToWifi();
}

class SmartPhone implements Camera,MusicPlayer,SmartFeatures
{
	public void takePhoto()
	{
		System.out.println("Photo captured successfully");
	}
	public void playMusic()
	{
		System.out.println("Playing music...");
	}
   public	void connectToWifi()
	{
		System.out.println("Connected to WiFi");
	}
}
public class SmartDevice {

	public static void main(String[] args) {
	
		SmartPhone ph=new SmartPhone();
		ph.takePhoto();
		ph.playMusic();
		ph.connectToWifi();
	}

}
