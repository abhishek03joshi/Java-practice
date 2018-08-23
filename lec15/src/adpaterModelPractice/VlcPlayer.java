package adpaterModelPractice;

public class VlcPlayer implements AdvancedMediaPlayer{
	
	public void playVlc(String strFileName) {
		System.out.println("Playing VLC file.name : "+strFileName);
	}
	
	public void playMp4(String strFileName) {		
		System.out.println("No Action");
	}

}
