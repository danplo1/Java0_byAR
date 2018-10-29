package pseudoRandomNumbers_17;

import java.util.Random;

/**
 * Created by Daniel_D'AGE on 29.10.2018.
 *
 * Generowanie kodu autoryzacyjnego!!!
 *
 */
public class RandomNumber {
    public static void main(String[] args) {

        Random ran = new Random();

        String string = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int lenghtString = string.length();
        System.out.println("Długość łańcucha znaków: " + lenghtString);

        String str = "";
        for (int i = 0; i < 12 ; i++) {
            int position = ran.nextInt(62);
            str = str + string.charAt(position);
        }
        System.out.println("Wygenerowany kod: " + str);
    }
}
