package db;

import models.Actor;
import models.Film;
import models.GenreType;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBFilm {

    private static Session session;

    public static List<Actor> getActorsForFilm(Film film) {
        session = HibernateUtil.getSessionFactory().openSession();
        List<Actor> results = null;
        try {
            Criteria cr = session.createCriteria(Actor.class);
            cr.createAlias("films", "film");
            cr.add(Restrictions.eq("film.id", film.getId()));
        results = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        } finally {
            session.close();
        }

        return results;

    }
}
