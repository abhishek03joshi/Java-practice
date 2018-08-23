package adapterModel;

public class VlcPlayer implements AdvancedMediaPlayer{
	public void playVlc(String strFileName) {
		System.out.println("Playing vlc file.Name :"+strFileName);
	}
	public void playMp4(String strFileName) {
		System.out.println("No action");
	}

}
