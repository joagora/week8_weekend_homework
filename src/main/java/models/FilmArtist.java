package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "film_artists")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class FilmArtist {

    private int id;
    private String name;
    private double cash;
    private List<Award> awards;

    public FilmArtist(String name, double cash) {
        this.name = name;
        this.cash = cash;
        this.awards = new ArrayList<Award>();
    }

    public FilmArtist() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "cash")
    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    @OneToMany(mappedBy = "artist", fetch = FetchType.LAZY)
    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }
}
