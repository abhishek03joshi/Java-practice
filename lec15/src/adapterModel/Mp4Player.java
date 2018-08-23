package adapterModel;

public class Mp4Player implements AdvancedMediaPlayer{
	public void playVlc(String strFileName) {		
		System.out.println("No action");
	}
	public void playMp4(String strFileName) {
		System.out.println("Playing mp4 file.Name :"+strFileName);
	}

}
