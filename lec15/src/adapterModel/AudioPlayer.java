package adapterModel;


public class AudioPlayer implements MediaPlayer{
	
	MediaAdapter mediaAdapter;
	public void play(String strAudioType, String strFileName) {
		if(strAudioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file.Name"+strFileName);
		}
		else if(strAudioType.equalsIgnoreCase("Vlc") || strAudioType.equalsIgnoreCase("Mp4")) {
			mediaAdapter = new MediaAdapter(strAudioType);
			mediaAdapter.play(strAudioType, strFileName);
		}
		else {
			System.out.println("Invalid Media "+strAudioType+" format not supported");
		}
	}

}
