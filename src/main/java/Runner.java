import db.DBHelper;
import models.*;

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

        Award award = new Award(AwardType.BRITISH_ACADEMY, CategoryType.BEST_ACTRESS);
        DBHelper.save(award);
    }
}
