import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    private ArrayList<Album> albums = new ArrayList<>();


    public  void main(String[] args) {
        Album album = new Album("Sex and love","Enrique Iglesias");
        album.addsong("Somebody's",4.16);
        album.addsong("Tonight",3.56);
        album.addsong("Can You Hear me",4.34);
        album.addsong("Little Girl",5.16);
        album.addsong("Forgiveness",4.56);
        albums.add(album);
         album = new Album("Revival","Eminem");
        album.addsong("Rap god",4.6);
        album.addsong("Monster",3.5);
        album.addsong("Love the way you lie",4.3);
        album.addsong("Mockingbird",5.6);
        album.addsong("Venom",4.6);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Tonight",playList);
        albums.get(0).addToPlaylist("Can You Hear me",playList);
        albums.get(0).addToPlaylist("Forgiveness",playList);
        albums.get(0).addToPlaylist(4,playList);
        albums.get(0).addToPlaylist("Whatever",playList);//does not exist
        albums.get(1).addToPlaylist("Rap god",playList);
        albums.get(1).addToPlaylist(3,playList);
        albums.get(1).addToPlaylist(5,playList);
        albums.get(1).addToPlaylist(4,playList);
        albums.get(1).addToPlaylist(2,playList);
        albums.get(1).addToPlaylist(20  ,playList);//there is not track 20


    }
}
