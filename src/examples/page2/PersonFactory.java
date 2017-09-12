package examples.page2;

/**
 * Created by Roman_v on 11.09.2017.
 */
    interface PersonFactory<P extends Person>{
        P create(String firstName, String lastName);
    }



