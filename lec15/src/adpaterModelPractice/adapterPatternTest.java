package adpaterModelPractice;

public class adapterPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AudioPlayer ap = new AudioPlayer();
		
		ap.play("mp3", "The Nights");
		ap.play("mp4", "Hotline Bling - Drake");
		ap.play("vlc","Wild Thoughts");
		ap.play("avi","Major and Minor");

	}

}
