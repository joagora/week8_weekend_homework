import db.DBActor;
import db.DBFilm;
import db.DBHelper;
import models.*;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Actor actorRoberts = new Actor("Julia Roberts", 1000.00);
        DBHelper.save(actorRoberts);
        Actor actorWood = new Actor("Elijah Wood", 2000.00);
        DBHelper.save(actorWood);
        Actor actorBloom = new Actor("Orleando Bloom", 43000.00);
        DBHelper.save(actorBloom);

        Director directorJackson = new Director("Peter Jackson", 20000.00);
        DBHelper.save(directorJackson);
        Director directorSchreiber = new Director("Liev Schreiber", 2030300.00);
        DBHelper.save(directorSchreiber);

        Studio studioBross = new Studio("Warner Bross");
        DBHelper.save(studioBross);

        Film filmHobbit = new Film("Hobbit", 2000000.00, directorJackson, studioBross, GenreType.ACTION);
        DBHelper.save(filmHobbit);
        Film filmIlluminated = new Film("Everything is illuminated", 3000000.00, directorSchreiber, studioBross, GenreType.DRAMA);
        DBHelper.save(filmIlluminated);

        Award award = new Award(AwardType.BRITISH_ACADEMY, CategoryType.BEST_ACTRESS);
        DBHelper.save(award);

        DBActor.addActorToFilm(filmHobbit, actorRoberts);
        DBActor.addActorToFilm(filmHobbit, actorWood);
        DBActor.addActorToFilm(filmHobbit, actorBloom);
        DBActor.addActorToFilm(filmIlluminated, actorWood);

        List<Film> foundFilms = DBActor.getFilmsForActor(actorWood);
        List<Actor> foundActors = DBFilm.getActorsForFilm(filmHobbit);
    }
}


