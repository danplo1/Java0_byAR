package com.company;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 12.10.2018.
 * <p>
 * Scanner & Parsowanie
 */
public class ScannerParsing_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*System.out.println(" Podaje dane: ");

        String word = scanner.nextLine();
        System.out.println("Twoje dane to: " + word);

        try{
            int data = Integer.parseInt(word);
            System.out.println(data);
        } catch (ExceptionMain e){
            System.out.println("Niepoprawna liczba!");
            main (null);
        }*/

        System.out.println("Podaj liczbę: ");
        try {
            String number = scanner.nextLine();

            double d = Double.valueOf(number);
            float f = Float.valueOf(number);
            System.out.println(f);
            System.out.println(d);

            System.out.println(String.valueOf(f)); //parsowanie liczby float na stringa
            System.out.println(String.valueOf(d)); //parsowanie liczby double na stringa

        } catch (Exception e) {


        }


    }
}
