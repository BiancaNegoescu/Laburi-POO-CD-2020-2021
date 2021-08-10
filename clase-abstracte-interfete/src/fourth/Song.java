package fourth;

import java.util.Objects;

public class Song {
    private String name;
    private int id;
    private String composer;

    public Song(String name, int id, String composer){
        this.name = name;;
        this.id = id;
        this.composer = composer;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getComposer() {
        return composer;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", composer='" + composer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        Song song = (Song) o;
        return getId() == song.getId() &&
                Objects.equals(getName(), song.getName()) &&
                Objects.equals(getComposer(), song.getComposer());
    }


    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId(), getComposer());
    }
}
