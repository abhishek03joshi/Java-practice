package adpaterModelPractice;

public class MediaAdapter implements MediaPlayer{
	
	AdvancedMediaPlayer iadplayer;
	
	public MediaAdapter(String strAudioType) {
		if(strAudioType.equalsIgnoreCase("vlc")) {
			iadplayer = new VlcPlayer();
		}
		else if(strAudioType.equalsIgnoreCase("mp4")) {
			iadplayer = new Mp4Player();
		}
	}
	
	public void play(String strAudioType, String strFileName) {
		if(strAudioType.equalsIgnoreCase("mp4")) {
			iadplayer.playMp4(strFileName);
		}
		else if (strAudioType.equalsIgnoreCase("vlc")) {
			iadplayer.playVlc(strFileName);
		}
	}

}
