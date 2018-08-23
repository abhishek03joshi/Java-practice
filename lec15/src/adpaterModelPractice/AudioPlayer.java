package adpaterModelPractice;

public class AudioPlayer implements MediaPlayer{
	
	MediaAdapter imediaadapter;
	public void play(String strAudioType, String strFileName) {
		if(strAudioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing MP3 filename : "+strFileName);
		}
		else if(strAudioType.equalsIgnoreCase("vlc")||strAudioType.equalsIgnoreCase("mp4")){
			imediaadapter = new MediaAdapter(strAudioType);
			imediaadapter.play(strAudioType, strFileName);			
		}
		else {
			System.out.println("Invalid audio file : "+strAudioType+" format not supported");
		}
	}

}
