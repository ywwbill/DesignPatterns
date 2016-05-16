package yang.weiwei.structural.adapter;

import yang.weiwei.structural.adapter.advancedPlayers.AdvancedMediaPlayer;
import yang.weiwei.structural.adapter.advancedPlayers.Mp4Player;
import yang.weiwei.structural.adapter.advancedPlayers.VlcPlayer;

public class MediaAdapter implements MediaPlayer
{
	AdvancedMediaPlayer advancedMusicPlayer;
	
	public MediaAdapter(String audioType)
	{
		if (audioType.equalsIgnoreCase("vlc"))
		{
			advancedMusicPlayer=new VlcPlayer();
		}
		if (audioType.equalsIgnoreCase("mp4"))
		{
			advancedMusicPlayer=new Mp4Player();
		}
	}
	
	@Override
	public void play(String audioType, String fileName)
	{
		if (audioType.equalsIgnoreCase("vlc"))
		{
			advancedMusicPlayer.playVlc(fileName);
		}
		if (audioType.equalsIgnoreCase("mp4"))
		{
			advancedMusicPlayer.playMp4(fileName);
		}
	}
}
