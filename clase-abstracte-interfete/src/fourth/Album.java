package fourth;

import java.util.ArrayList;

public abstract class Album {

    ArrayList<Song> songs = new ArrayList<>();

    abstract void addSong(Song song);

    public void removeSong(){

    }

    @Override
    public String toString() {
        return "Album{" +
                "songs=" + songs +
                '}';
    }
}
