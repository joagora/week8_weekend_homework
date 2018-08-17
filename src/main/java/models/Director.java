package models;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "directors")
public class Director extends FilmArtist{

    private List<Film> directedFilms;

    public Director(String name, double cash){
        super(name, cash);
        this.directedFilms = new ArrayList<Film>();
    }

    public Director() {
    }

    @OneToMany(mappedBy = "director", fetch = FetchType.LAZY)
    public List<Film> getDirectedFilms() {
        return directedFilms;
    }

    public void setDirectedFilms(List<Film> directedFilms) {
        this.directedFilms = directedFilms;
    }
}
