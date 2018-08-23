package adapterModel;

public class MediaAdapter implements MediaPlayer {
	AdvancedMediaPlayer advanceMusicPlayer;
	public MediaAdapter(String straudioType) {
		if(straudioType.equalsIgnoreCase("Vlc")) {
			advanceMusicPlayer = new VlcPlayer();
		}
		else if (straudioType.equalsIgnoreCase("Mp4")) {
			advanceMusicPlayer = new Mp4Player();
		}
	}
	
	public void play(String strAudioType, String strFileName) {
		if(strAudioType.equalsIgnoreCase("Vlc")) {
			advanceMusicPlayer.playVlc(strFileName);
		}
		else if(strAudioType.equalsIgnoreCase("mp4")) {
			advanceMusicPlayer.playMp4(strFileName);
		}
	}

}
