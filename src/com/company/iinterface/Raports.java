package com.company.iinterface;

/**
 * Created by Daniel_D'AGE on 16.10.2018.
 */
public class Raports extends Raport implements RaportsInterface {

    String title;

    @Override
    public void show(String string) {
        System.out.println("Raport: " + string + "wyświetlony jest na ekranie.");
    }

    @Override
    public void print(String string) {
        System.out.println("Drukowanie raportu: " + string);
    }

    @Override
    public void generateReport(String string) {
        System.out.println("Przygotowanie raportu " + string);
    }

    @Override
    public String deleteReport(String string) {
        return "Raport " + string + " usuniety z systemu. ";



        }
    }




