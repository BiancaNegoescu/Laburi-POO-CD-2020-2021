package fourth;

public class BadAlbum extends Album {
    public void addSong(Song song){
        if (song.getName().length()==3 && palindrom(song.getId())==1)
            songs.add(song);

    }
    public int palindrom(int id){
        int r, sum = 0, aux;
        aux = id;
        while(id > 0){
            r = id % 10;
            sum = (sum*10) + r;
            id = id/10;
        }
        if (aux == sum)
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "BadAlbum{" +
                "songs=" + songs +
                '}';
    }
}
