package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "musicians")
public class Musician extends FilmArtist {

    public Musician(String name, double cash) {
        super(name, cash);
    }
}
