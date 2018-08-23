package adapterModel;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioPlayer objAutoPlayer = new AudioPlayer();
		
		objAutoPlayer.play("mp3", "beyond horizon.mp3");
		objAutoPlayer.play("mp4", "alone.mp4");
		objAutoPlayer.play("vlc", "far far away.vlc");
		objAutoPlayer.play("avi", "mind me.avi");

	}

}
