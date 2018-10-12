package com.company;

/**
 * Created by Daniel_D'AGE on 11.10.2018.3
 * #05 INSTRUKCJE WARUNKOWE
 * pętla for, while - zaczyna od sprawdzania warunku
 * if
 * switch case- alternatywa dla if else
 */
public class ConditionalStatements_05 {
    public static void main(String[] args) {


        String name = "Jan";
        String name2 = "Kasia";

        if (name.equals("Jan")) {
            System.out.println("Cześć " + name);
            if (name != "Kasia") {
                System.out.println("Niepoprawne imię.");
            }
            if (name.equals("Jan") && name2.equals("Kasia") || name.equals(null)) {
                System.out.println("Cześć " + name + " " + name2);
            } else {
                System.out.println("Niepoprawne imię, ACCES DENIED");
            }
            if (name.equals("Jan") || name2.equals("Kasia")){
                System.out.println("Cześć " + name + " " + name2 + "!");

            }

        }

        int x = 6;

        /* if (x == 4) {
            System.out.println("x=4");
        }else if (x == 6) {
            System.out.println("x=6");
        }else if (x == 7) {
            System.out.println("x=7");
        }else{
            System.out.println("X nie ma żądanej wartości.");
        }
        System.out.println("Koniec");*/

       /* switch (x) {
            case 4:
                System.out.println("x=4");
                break;
            case 5:
                System.out.println("x=5");
                break;
            case 6:
                System.out.println("x=6");
                break;
            case 7:
                System.out.println("x=7");
                break;

            default:
                System.out.println(" X nie ma wymaganej wartości.");
                break;
        }
        System.out.println("Koniec");*/
        //druga opcja

        switch (x) {
            case 4:
                showNumber(x);
                break;
            case 5:
                showNumber(x);
                break;
            case 6:
                showNumber(x);
                break;
            case 7:
                showNumber(x);
                break;

            default:
                System.out.println(" X nie ma wymaganej wartości.");
                break;
        }
        System.out.println("Koniec");
    }

    public static void showNumber(int x) {
        System.out.println("x =" + x);

    }
}
