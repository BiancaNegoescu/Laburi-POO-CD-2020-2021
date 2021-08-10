package fourth;

import java.util.ArrayList;

public class DangerousAlbum extends Album{ ;
    public void addSong(Song song) {
        if (prim(song.getId()) == 1) {
          songs.add(song);
        }
    }

    public int prim(int id){
        int ok = 1;
        for (int i = 2; i<= id/2; i++){
            if (id%i == 0){
                ok = 0;
                break;
            }
        }
        return ok;
    }

    @Override
    public String toString() {
        return "DangerousAlbum{" +
                "songs=" + songs +
                '}';
    }
}

