package model;
public class MCS{
	//constantes
	private static int MAX_USERS = 10;
	private static int MAX_PLAYLISTS = 20;
	//atributos
	private int numUsers;
	private int numSongs;
	private int numPlaylists;

	//relations
	private User[] users;
	private Song[] songs;
	private Playlist[] playlists;

	//metodos
	public MCS(){

	}

	/*se le otorga una categoria al usuario
	*/
	public String userCategory(){
		if (sharedSongs()>=3) {
		this.category = Category.valueOf("LITTLE_CONTRIBUTOR");
		} 
		if (sharedSongs()>=10) {
		this.category = Category.valueOf("MILD_CONTRIBUTOR");
		} 
		if (sharedSongs()>=30) {
		this.category = Category.valueOf("STAR_CONTRIBUTOR");
		} 
	}

	/*cuenta la cantidad de canciones que ha compartido el usuario
	*/
	public int sharedSongs(){
		int sharedSongs = 0;
		
		for (int i=0; i<playlists.length; i++) {
			if (playlists[i] instanceof SharePl||playlists[i] instanceof Private) {
				shared Songs = playlists[i].getSongs().length;
			}	
		}
	return sharedSongs;
	}
}
