package models;

import java.util.ArrayList;
import java.util.List;

public class Studio {

    private int id;
    private String name;
    private List<Film> productions;

    public Studio(String name) {
        this.name = name;
        this.productions = new ArrayList<Film>();
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

    public List<Film> getProductions() {
        return productions;
    }

    public void setProductions(List<Film> productions) {
        this.productions = productions;
    }
}
