package operationsOnStrings_24;

/**
 * Created by Daniel_D'AGE on 06.11.2018.
 * Operacje na łańcuchach
 */
public class Chains {
    public static void main(String[] args) {

        String string = "andrzej";
        String string1 = "programista";
        String string2 = "Java:to:fajny:język:programowania";
        String string3 = " Testowanie metody trim";


        String tab1[] = null;
        String tab2[] = null;

        System.out.println("Długośc łańcucha znaków: " + string.length()); //długość łańcucha

        System.out.println(string.charAt(2)); //zwraca nam znak znajdujący się na konkrentym miejscu łańcucha

        System.out.println(string.equals(string1)); // porównuje zawartość znaków w łańcuchów, mając na uwadze wielkośc znaków - boolean

        System.out.println(string.equalsIgnoreCase(string1)); // porównuje zawartość znaków w łańcuchów, ignorując wielkośc znaków - boolean

        System.out.println(string.substring(2)); // bierze rzeczywistą długośc łańcucha, licząc od wskazanego znaku, tzw. podłańcuch, po 2 literze

        System.out.println(string.substring(2, 5));// bierze rzeczywistą długośc łańcucha, licząc od wskazanego znaku do kolejnego wskazanego znaku

        System.out.println(string + " " + string1);// łączenie łańcuchów znaków lub

        System.out.println(string.concat(string1)); // łączenie łańcuchów znaków poprzez metodą concat, metoda przeciążoną

        System.out.println(string.replace("a", "y"));//podmiana znaków w stringu


        //splitowanie łańcucha znaków, metoda split jest metodą przeciążoną, dzieli łańcuch znaków
        tab1 = string2.split(":");
        tab2 = string2.split(":", 2); //splitowanie łańcucha znaków, na dwie linijki

        for (int i = 0; i <tab1.length ; i++) {
            System.out.println(tab1[i]);
        }
        System.out.println("------------");

        for (int i = 0; i <tab2.length ; i++) {
            System.out.println(tab2[i]);
        }

        //usuwanie białych znaków w łańcuchu znaków, na jego początku i końcu, metoda trim

        System.out.println(string3);
        System.out.println(string3.trim());


        // metoda, która zamienia wszystkie znaki małe na duże (1) i duże na małe (2)

        System.out.println(string1.toUpperCase());
        System.out.println(string2.toLowerCase());

        System.out.println("-----------");

        System.out.println(firstToUpperCase(string));
    }

    public static String firstToUpperCase(String string){

        String newString = null;

        String first = String.valueOf(string.charAt(0)).toUpperCase();
        String rest = string.substring(1);
        newString = first.concat(rest);


        return newString;

    }
}
