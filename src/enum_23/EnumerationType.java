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

   // public static final String MERCEDES = "Merecedes";


    public static void main(String[] args) {



        //Cars cars = Cars.VOLVO_V50;
        //System.out.println(cars);

        for (Cars cars1 : Cars.values()) {
            System.out.println(cars1.getYear() + ", " + cars1.getDrive());

        }

        System.out.println("----------------");

        int year = Cars.VOLVO_V50.getYear();
        System.out.println(year);

        if (Cars.VOLVO_V50.getYear()==2012){
            System.out.println("Auto jest młodsze.");
        }

        switch (Cars.TOYOTA_PRIUS.getYear()){
            case 2001:
                System.out.println("Trochę wiekowy");
                break;
            case 2005:
                System.out.println(" Młodszy");
                break;
            case 2010:
                System.out.println("Całkiem, całkiem");
                break;
            case 2017:
                System.out.println("Nowe super auto");
                break;
        }

        //System.out.println(EnumerationType.MERCEDES);

        System.out.println("---------------------------");

        //nowy obiket z wykorzystaniem typu wyliczeniowego

        //Car car = new Car(Cars.RENAULT_TALISMAN.getYear(), Cars.RENAULT_TALISMAN.getDoors());
        //System.out.println(car.getYear());
        //System.out.println(car.getDoors());





}
}
