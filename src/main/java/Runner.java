import db.DBHelper;
import models.Actor;
import models.Director;
import models.Film;
import models.Studio;

public class Runner {

    public static void main(String[] args) {
        Actor actorRoberts = new Actor("Julia Roberts", 1000.00);
        DBHelper.save(actorRoberts);

        Director directorJackson = new Director("Peter Jackson", 20000.00);
        DBHelper.save(directorJackson);

        Studio studioBross = new Studio("Warner Bross");
        DBHelper.save(studioBross);

        Film filmHobbit = new Film("Hobbit", 2000000.00, directorJackson, studioBross);
        DBHelper.save(filmHobbit);


    }
}
