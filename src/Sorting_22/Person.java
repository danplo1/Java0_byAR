package Sorting_22;

/**
 * Created by Daniel_D'AGE on 02.11.2018.
 */
public class Person {

    private String name;
    private String surname;

    public Person (String name, String surname){

        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    //konieczna metoda toString, wyświetla łańcuch znaków
    @Override
    public String toString() {
        return  name + " " + surname;
    }
}

