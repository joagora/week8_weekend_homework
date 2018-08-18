package db;

import models.Actor;
import models.Film;
import org.hibernate.Session;

public class DBActor {
    private static Session session;

    public static void addActorToFilm(Film film, Actor actor){
        film.addActorToFilm(actor);
        DBHelper.update(film);
    }



}
