package com.company.ExceptionMain;

import java.util.Scanner;

/**
 * Created by Daniel_D'AGE on 24.10.2018.
 * Gdy nie chcemy obsłuzyć wyjątku dajemy finnaly;
 * gdy chcemy obsłużyć wyjatek dajemy catch
 * rekurencja - wywołanie metody metody przez samą siebie
 */

public class Exception_14 {
    public static void main(String[] args) throws Exception {

        Exception exc = new Exception();
        //exc.loadChar();

    }

    public void loadChar() throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Wprowadz liczbę: ");

        String sc = scanner.nextLine();

        int i = 0;

        try {
            i = Integer.parseInt(sc);

            System.out.println("Liczba " + i);
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Houston mamy błąd!");
            //loadChar();

        }finally{
            loadChar();
        }
    }

}


