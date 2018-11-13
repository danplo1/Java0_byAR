package anagrams_29;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

/**
 * Created by Daniel_D'AGE on 12.11.2018.
 */
public class Anagram {
    public static void main(String[] args) throws Exception {

        Anagram anagram = new Anagram();

        List<String> list = new ArrayList<String>();
        List<String> anagramsList = new ArrayList<String>();

        list = anagram.loadTheFile();

        if (list.size() == 0) {
            System.out.println("Nie wczytsano żadnych słów");
        } else {
            System.out.println(String.format("Wczytano %,d unikalnych słów.", list.size()));
            anagramsList = anagram.findAnagrams(list);
            System.out.println(String.format("Znaleziono %,d anagramów.", anagramsList.size()));

            for (String s : anagramsList) {
                System.out.println(s);
            }
        }

    }

    public List<String> loadTheFile() throws Exception {

        List<String> listWords = new ArrayList<String>();
        Set<String> wordsSet = new HashSet<String>();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("anagram.txt")); //otwieranie bufora do odczytu
        try {
            String line; //zmienna która przechowuje aktualnie odczytwaną linię
            while ((line = bufferedReader.readLine()) != null) { //czytanie kolejnych lini i sprawdzenie czy nie ma nulla
                if (!line.equals("")) { // sprawdzenie czy linia nie jest pusta, jesli nie wrzucamy do kolekcji set
                    wordsSet.add(line); // unikanie umieszczania w kolekci duplikatów
                }
            }
            bufferedReader.close();
            listWords.addAll(wordsSet);
        } catch (Exception e) {
            System.out.println("Błąd odczytu pliku");
        }
        return listWords;
    }


    public List<String> findAnagrams(List<String> listWords) {

        Date dateStart = new Date();

        String string = "Wyszukiwanie anagramów";
        long totalComp = 0;

        List<String> list = new ArrayList<String>();
        System.out.print(string);

        for (int i = 0; i < listWords.size(); i++) {
            for (int j = i + 1; j < listWords.size(); j++) {

                String string1 = listWords.get(i).toString();
                String string2 = listWords.get(j).toString();

                totalComp++;

                if (compareWords(string1, string2)) {
                    if ((i % 20) == 0) {
                        System.out.println(".");
                    }
                    listWords.add(string1 + " = " + string2);
                }

            }

        }
        System.out.println(String.format("\n\nLiczba wykonanych porównań %,d", totalComp));

        Date dateEnd = new Date();
        long time = (dateEnd.getTime() - dateStart.getTime()) / 1000;
        System.out.println(String.format("Porównanie trwało %,d sekund", time));

        return list;

    }


    public boolean compareWords(String string1, String string2) {
        String pString1 = string1.toLowerCase();
        String pString2 = string2.toLowerCase();

        char[] ch1 = pString1.toCharArray(); //metoda do zamiany łańcucha znaków na tablice znaków
        char[] ch2 = pString2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String sorted1 = new String(ch1);
        String sorted2 = new String(ch2);

        return sorted1.equals(sorted2);


    }
}
