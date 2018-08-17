package models;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "directors")
public class Director extends FilmArtist{
    public Director(String name, double cash){
        super(name, cash);
    }

    public Director() {
    }
}
