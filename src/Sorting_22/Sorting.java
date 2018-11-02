package Sorting_22;

import java.util.*;

/**
 * Created by Daniel_D'AGE on 02.11.2018.
 * Sortowanie w Javie: kiedy sięgamy po zawartośc w kolekcji treeset, otrzymujemy juz posortowane elementy. Zamiast
 * Seta lub HashSeta uzywamy Treeseta i otrzymuje elementy posortowane.
 * ThreeMap
 */
public class Sorting {
    public static void main(String[] args) {




        /*HashSet<String> words = new HashSet<>();
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


        Map<String, String> words4 = new HashMap<>();
        words4.put("one", "jeden");
        words4.put("two", "dwa");
        words4.put("three", "trzy");
        words4.put("four", "cztery");
        words4.put("five", "pięć");
        for (Map.Entry<String, String> entry : words4.entrySet()) {
            System.out.println("K: " + entry.getKey() + " V " + entry.getValue());
        }

        System.out.println("-----------------------");

        Map<String, String> words3 = new TreeMap<>(words4);
        for (Map.Entry<String, String> entry2 : words3.entrySet()) {
            System.out.println("K: " + entry2.getKey() + " V " + entry2.getValue());

            System.out.println("-----------------------");*/


        List<String> words4 = new ArrayList<>();
        words4.add("jeden");
        words4.add("dwa");
        words4.add("trzy");
        words4.add("cztery");
        words4.add("pięć");
        words4.add("sześć");
        words4.add("siedem");
        words4.add("osiem");
        words4.add("dziewięć");

        System.out.println(words4);

        Collections.sort(words4, new Comparator<String>() { // comparator to jest interfejs,
            @Override
            public int compare(String o1, String o2) {

                //przesłonieta metoda compare przyjmuje jako  argumenty dwa łancuchy znaków, które bedą prównywane i tak
                // długo dopóki nie osiagniemy końca listy i tym samym wszystkie elementy nie zostana porównane  i posortowane

                return o1.compareTo(o2);
            }
        });

        System.out.println(words4);

    }

        /**
         * Poniżej rzadko uzywana Metoda która pierw skonweruje nam mapę do tablicy [do listy], nast epnie wykon na
         * niej sortowanie, po czym znów przekonwertujemy posrtowana listę na mape i zwrócimy mapę; obiekt pozwalający
         * na sekwencyjny dostęp do
         * wszystkich elementów lub części zawartych w innym obiekcie
         */



    /*/unchecked/

    private static HashMap sortByValues(Map map) {
        List list = new LinkedList(map.entrySet());

        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) (Map.Entry) (o1)).getValue()) //zwracamy to co jest porównane
                .compareTo((Map.Entry) (o2).getValue());

            }
        });

        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext(); ) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());

        }
        return sortedHashMap;*/


    }










