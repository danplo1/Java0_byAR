package com.company;

/**
 * Lekcja 2 Tablice i Pętle
 */

public class TablicePętle_02 {

    public static void main(String[] args) {
        // write your code here

        int x = 0;
        int y = 0;

        int tab01[] = new int[5];
        tab01[0] = 1;
        tab01[1] = 2;
        tab01[2] = 3;
        tab01[3] = 4;
        tab01[4] = 5;

        int tab02[] = {5, 6, 7, 8, 9};

        char tab03[] = new char[5];

        tab03[0] = 'a';

        char tab04[] = {'a', 'b', 'c'}; //char - znaki przetrzmujemy w apostrofach

        String tab05[] = new String[3];
        String tab06[] = {"jeden", "dwa", "trzy", "cztery"};

        for (int i = 0; i < tab01.length; i++) {
            System.out.println(i + " : " + tab01[i]);
        }
        System.out.println(" ");

        for (int j = 0; j < tab02.length; j++) {
            System.out.println(j + " : " + tab02[j]);
        }
        System.out.println(" ");

        while (x < tab01.length) {

            System.out.println(x + " : " + tab01[x]);
            x++;
        }
        //pętla while -  wykona się tylko wtedy gdy warunek jest prawdziwy
        System.out.println(" ");

        do {
            System.out.println(y + " : " + tab01[y]);
            y++;
        } while (y < tab01.length);
        // pętla do while - wykona się  przynajmniej jeden raz, ponieważ wykona sie na końcu
    }


}
