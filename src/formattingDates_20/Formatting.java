package formattingDates_20;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by Daniel_D'AGE on 30.10.2018.
 * Formatowanie liczb i dat
 * . - poprzez wstawienie kropki oddzielamy łańucha liczb spacją;
   np. ,5f - wyświetla nam 5 liczb po przecinku w w typie prostym float (max 6, 7 znaków)
 */
public class Formatting {
    public static void main(String[] args) {

        int x = 63784934;


        //zamiast
        // System.out.println("Moja liczba to: " + x + " niesformatowana!");

        System.out.println(String.format("Moja liczba to: %,d niesformatowana!", x));

        float f = 12345.678f;
        System.out.println(String.format("Moja liczba %,.10f sformatowana ", f));


        //formatowanie dat

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat formattin = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z"); //Z strefa czasowa
        String stringDate = formattin.format(date);
        System.out.println(stringDate);




    }
}
