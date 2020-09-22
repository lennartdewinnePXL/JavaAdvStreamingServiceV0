package be.pxl.ja.streamingservice.model;
import java.time.LocalDate;


public class Movie extends Content implements Playable{
    private String title;
    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;
public Movie(String title, Rating maturityRating) {
        super(title, maturityRating);
        }
public String getTitle () {
        return title;
        }
public void setTitle(String title) {
        this.title = title;
}
public String getDirector () {
        return director;
}
public void setDirector(String director) {
        this.director = director;
}
public LocalDate getReleaseDate () {
        return releaseDate;
        }
public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
        }
public int getDuration () {
        return duration;
        }

    @Override
    public void play() {
        System.out.println("Playing " + this);
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this);
    }

    public void setDuration(int duration) {
        this.duration = duration;
        }
@Override
    public String toString () {
        return title;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Genre getGenre () {
            return genre;
}
}

