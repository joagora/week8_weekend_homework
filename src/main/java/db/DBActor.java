package db;

import models.Actor;
import models.Film;
import models.GenreType;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBActor {
    private static Session session;

    public static void addActorToFilm(Film film, Actor actor) {
        actor.addFilmToActor(film);
        DBHelper.update(actor);
    }

    public static List<Film> getFilmsForActor(Actor actor) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Film> results = null;
        try {
            Criteria cr = session.createCriteria(Film.class);
            cr.createAlias("actors", "actor");
            cr.add(Restrictions.eq("actor.id", actor.getId()));
            results = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }

        return results;

    }





}
