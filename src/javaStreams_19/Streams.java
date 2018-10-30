package javaStreams_19;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Daniel_D'AGE on 30.10.2018.
 * Strumienie podstawy podstaw.
 * Strumienie służa tylko i wyłącznie do przetwarzania danych,można je opakowac w kazdy zestaw danych: listy, array listy,
 * mapy, etc..
 * Streamy moga pracowac równolegle, mozna je uzywac do dowolnego zestawu kolekcji
 */
public class Streams {

    public static void main(String[] args) {

        List<Flat> mList = Arrays.asList(
                new Flat("Wrocław", "Fabryczna", "Szkocka", 3, 63.4f,
                        true, 350000),
                new Flat("Gdańsk", "Stare Miasto", "Wyszyńskiego", 4, 88.5f,
                        false, 530000),
                new Flat("Wrocław", "Krzyki", "Powstańców Sląskich", 3, 58.6f,
                        true, 310000),
                new Flat("Poznań", "Sródmieście", "Plac Bema", 4, 79.2f,
                        false, 460000),
                new Flat("Wrocław", "Fabryczna", "Lotnicza", 2, 48.90f,
                        false, 280000)
        );


        //antywzorzec
        /*for (Flat m: mList) {
            if (m.getMiasto().equals("Wrocław")){
                if(m.getPokoje()>2){
                    if (m.getCena()<450000){

                        System.out.println(m.getMiasto() + " " + m.getCena() + " " + m.getPokoje());
                    }
                }
            }

        }*/

        // pierwszy sposób uzycia strumienia
        mList.stream()
                .filter(mieszkanie -> mieszkanie.getMiasto().equals("Wrocław"))
                .filter(mieszkanie -> mieszkanie.getPokoje() > 1)
                .filter(mieszkanie -> mieszkanie.getCena() < 450000)
                .map(mieszkanie -> mieszkanie.getMiasto() + " " + mieszkanie.getDzielnica() + " "
                        + mieszkanie.getUlica() + " " + mieszkanie.getPokoje() + " " + mieszkanie.getCena())
                .forEach(System.out::println);


        // drugi sposób uzycia strumienia z funkcją Predicate

       Predicate<Flat> mName = m -> m.getMiasto().equals("Wrocław");


        List<Flat> list = new ArrayList<>();
        list = mList.stream()
                .filter(mName)
                .collect(Collectors.toList()); //zbieranie wyników do listy

        System.out.println(list);


        Predicate<Flat> mName1 = m-> m.isPiwnica() == true;

        List<Flat> list1 = new ArrayList<>();
        list = mList.stream()
                .filter(mName1)
                .collect(Collectors.toList()); //zbieranie wyników do listy

        System.out.println(list);
    }

}


