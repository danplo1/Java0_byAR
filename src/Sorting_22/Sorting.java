package Sorting_22;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Created by Daniel_D'AGE on 02.11.2018.
 *  Sortowanie w Javie: kiedy sięgamy po zawartośc w kolekcji treeset, otrzymujemy juz posortowane elementy. Zamiast
 *  Seta lub HashSeta uzywamy Treeseta i otrzymuje elementy posortowane
 */
public class Sorting {
    public static void main(String[] args) {

        HashSet<String> words = new HashSet<>();
        words.add("Jeden");
        words.add("Dwa");
        words.add("Trzy");
        words.add("Cztery");
        System.out.println("\nSłowa HashSet: " + words);

        TreeSet<String> words2 = new TreeSet<>();
        words2.add("Jeden");
        words2.add("Dwa");
        words2.add("Trzy");
        words2.add("Cztery");
        System.out.println("\nSłowa TreeSet: " + words2);


       /* HashSet<String> words = new HashSet<>();
        words.add("Jeden");
        words.add("Dwa");
        words.add("Trzy");
        words.add("Cztery");
        System.out.println("\nSłowa HashSet: " + words);*/

    }
}
