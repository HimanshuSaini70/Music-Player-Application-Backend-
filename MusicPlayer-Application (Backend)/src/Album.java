import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addsong(String title,double duration){
        if(findsong(title)==null){
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;

    }
    //below we are using for each and checkedSong variable is checking every entry in the songs Arraylist and check for
    //duplicates so that we do not repeat the song twice.
    private Song findsong(String title){
        for (Song checkedSong :this.songs){
            if (checkedSong.getTitle().equals(title)){
                return checkedSong;
            }

        }
        return null;

    }
    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList){
        int index = trackNumber-1;
        if ((index>=0)&&(index<=this.songs.size())){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This song does not have a track  "+ trackNumber);
        return false;
    }
    public boolean addToPlaylist(String title,LinkedList<Song> playList){
        Song checkedSong = findsong(title);
        if (checkedSong!= null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song "+ title+" is not on the album");
        return false;
    }
}
