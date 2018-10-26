package com.company.interface_11;

/**
 * Created by Daniel_D'AGE on 16.10.2018.
 * Interfejsy rozszerzają mozliwości klas, interfejs to zbiór definicji metod, które nie posiadają ciała (klasy bez
 * implementacji), aby nie grzebac w klasie bazowej. Metody, które implmentujemy z interfejsu musimy nadpisywać.
 * W interfejsach deklarujemy tylko metody.
 */
public class Interface_11 {
    public static void main(String[] args) {

        Raports raports = new Raports();
        raports.title = "R A P O R T  1.0 ";

        raports.generateReport(raports.title);
        System.out.println(raports.reportGeneratedBy("Daniel"));


        raports.show(raports.title);
        raports.print(raports.title);

        System.out.println(raports.deleteReport(raports.title));

    }

}
