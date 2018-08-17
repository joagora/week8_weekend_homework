package models;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "actors")
public class Actor extends FilmArtist{

    private List<Film> starredFilms;

    public Actor(String name, double cash) {
        super(name, cash);
        this.starredFilms = new ArrayList<Film>();
    }

    public Actor() {
    }

    @Cascade(CascadeType.SAVE_UPDATE)
    @ManyToMany
    @JoinTable(
            name = "actors_films",
            joinColumns = {@JoinColumn(name = "actor_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "film_id", nullable = false, updatable = false)})
    public List<Film> getStarredFilms() {
        return starredFilms;
    }

    public void setStarredFilms(List<Film> starredFilms) {
        this.starredFilms = starredFilms;
    }
}
