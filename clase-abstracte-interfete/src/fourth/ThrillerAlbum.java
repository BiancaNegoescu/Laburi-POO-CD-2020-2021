package fourth;

import java.util.ArrayList;

public class ThrillerAlbum extends Album{
    public void addSong(Song song) {
        if (song.getComposer().equals("Michael Jackson") && song.getId() % 2 == 0)
            songs.add(song);
    }

    @Override
    public String toString() {
        return "ThrillerAlbum{" +
                "songs=" + songs +
                '}';
    }
}
