package models;

import org.hibernate.annotations.Cascade;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "actors")
public class Actor extends FilmArtist{

    private List<Film> films;

    public Actor(String name, double cash) {
        super(name, cash);
        this.films = new ArrayList<Film>();
    }

    public Actor() {
    }

    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToMany
    @JoinTable(
            name = "actors_films",
            joinColumns = {@JoinColumn(name = "actor_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "film_id", nullable = false, updatable = false)})
    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public void addFilmToActor(Film film){
        this.films.add(film);
    }
}
