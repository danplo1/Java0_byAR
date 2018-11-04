package Sorting_22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Daniel_D'AGE on 04.11.2018.
 */
public class Sorting2 {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jan", "Kowalski"));
        persons.add(new Person("Tadeusz", "Nowak"));
        persons.add(new Person("Zygmunt", "Iksiński"));
        persons.add(new Person("Anna", "Nowakowska"));
        persons.add(new Person("Antoni", "Frankowski"));
        persons.add(new Person("Juliusz", "Malinowski"));

        for (Person p : persons) {
            System.out.println(p);
        }

        //sortowanie po imieniu
        Collections.sort(persons, (Person p1, Person p2) -> p1.getName().compareTo(p2.getName()));

        System.out.println("-----------------");

        for (Person p : persons) {
            System.out.println(p);
        }

        System.out.println("-----------------");

        //wersja krótsza

        persons.sort(Comparator.comparing(Person::getName));
        for (Person p : persons) {
            System.out.println(p);
        }

        System.out.println("-----------------");

        // sortowanie po nazwisku

        Collections.sort(persons, (Person p1, Person p2) -> p1.getSurname().compareTo(p2.getSurname()));

        for (Person p : persons) {
            System.out.println(p);
            }

        System.out.println("-----------------");

        //lub
        persons.sort(Comparator.comparing(Person::getSurname));
        for (Person p : persons) {
            System.out.println(p);

        }
    }
}
