package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "actors")
public class Actor extends FilmArtist{

    public Actor(String name, double cash) {
        super(name, cash);
    }

    public Actor() {
    }
}
