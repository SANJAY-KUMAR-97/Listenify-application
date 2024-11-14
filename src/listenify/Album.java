package listenify;
import java.util.List;
import java.util.ArrayList;
public class Album {
    private  String singerName;
    private  List<Song> songList;  //it's a list of object.

    public Album(String singerName) {
        this.singerName = singerName;
        this.songList = new ArrayList<>();
    }

    public Album(String singerName, List<Song> songList) {
        this.singerName = singerName;
        this.songList = songList;
    }

    public boolean findSongInAlbum(String songName){
       for(Song s: songList){
           if(s.getSongName().equals(songName)){
               return true;
           }
       }
        return false;
    }

    //Add song to Album
    public String addSongToAlbum(String songName, double duration){
        if(findSongInAlbum(songName)){
            return "Song is already present in Album";
        }
        Song newSong= new Song(songName, duration);
        songList.add(newSong);
        return "New Song has been added";
    }

    public String addSongToPlaylist(int songNo,List<Song> playlist) {
      int index=songNo-1;
      if(index>=0 && index<songList.size()){
          Song songObj=songList.get(index);
          playlist.add(songObj);
          return "Song has been added to the Playlist";
      }
      return "Song no entered is invalid";
    }
    public String addSongToPlaylist(String songName,List<Song> playlist) {
        //we r adding the Song to playlist from album

        for(Song song: songList) {
            if (song.getSongName().equals(songName)) {
                playlist.add(song);
                return "Song added to Playlist";
            }
        }
            return "No Song with this songName existed in the album songList";

    }

}
