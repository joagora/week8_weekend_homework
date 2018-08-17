package models;

import java.util.ArrayList;
import java.util.List;

public abstract class FilmArtist {

    private int id;
    private String name;
    private double cash;
    private List<Film> films;
    private List<Award> awards;

    public FilmArtist(String name, double cash) {
        this.name = name;
        this.cash = cash;
        this.awards = new ArrayList<Award>();
        this.films = new ArrayList<Film>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }
}
