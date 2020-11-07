package model;

public abstract class SharedPl extends Playlist{

	//constant
	public final static int MAX_PL_SHARES = 5;
	public final static int MAX_SONG_SHARES = 30;

	//attributes
	private boolean visible;

	public SharedPl(String name){
		super(name);
	}

}