interface MediaPlayer {
  void play(String audioType, String fileName);
}

class VlcPlayer implements MediaPlayer {
  @Override
  public void play(String audioType, String fileName) {
    // code to play VLC file
  }
}

class Mp4Player implements MediaPlayer {
  @Override
  public void play(String audioType, String fileName) {
    // code to play MP4 file
  }
}

class AudioPlayer implements MediaPlayer {
  MediaPlayer mediaPlayer;

  @Override
  public void play(String audioType, String fileName) {
    if (audioType.equalsIgnoreCase("vlc")) {
      mediaPlayer = new VlcPlayer();
      mediaPlayer.play(audioType, fileName);
    } else if (audioType.equalsIgnoreCase("mp4")) {
      mediaPlayer = new Mp4Player();
      mediaPlayer.play(audioType, fileName);
    } else {
      System.out.println("Invalid audio type.");
    }
  }
}

public class Adapter {
	public static void main(String[] args)
	{
		MediaPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("vlc", "beyond the horizon.vlc");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("avi", "mind me.avi");
	}
}
