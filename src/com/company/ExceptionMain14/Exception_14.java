package com.company.ExceptionMain14;

import com.company.ExceptionMain14.MyException.MyException;

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


    public void loadChar() throws MyException {


        Scanner scanner = new Scanner(System.in);
        System.out.println(" Wprowadz liczbę: ");

        String sc = scanner.nextLine();

        if (sc.length() == 0) {
            System.out.println(new MyException("Pusty ciąg znaków!"));
            loadChar();
        }

        int i = 0;

        try {
            i = Integer.parseInt(sc);

            System.out.println("Liczba " + i);
        } catch (Exception ex) {
            System.out.println(new MyException("Pusty ciąg znaków!"));
            ex.printStackTrace();
            loadChar();

        }
    }

}


