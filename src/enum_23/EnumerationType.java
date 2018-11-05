package enum_23;

/**
 * Created by Daniel_D'AGE on 05.11.2018.
 *
 * Enum typ wyliczeniowy, przchowuje nam stałe oraz stałe z przypisanymi do nich wartościami, stałe oddzielamy przecinkami
 * i piszemy duzymi literami
 * Przy tworzeniu nowego obiektu ( na bazie klasy wyliczeniowej) nie uzywa słowa new, ponieważ jest typ wyliczeniowy,
 * a nie typowa klasa. Aby dopisac kolejne wartości do stałych, należy to zrobić w nawiasach.
 *
 */
public class EnumerationType {

    //public static final String MERCEDES = "Merecedes";


    public static void main(String[] args) {



        //Cars cars = Cars.VOLVO_V50;
        //System.out.println(cars);

        for (Cars cars1 : Cars.values()) {
            System.out.println(cars1.getYear() + ", " + cars1.getDrive());

        }
    }

}
