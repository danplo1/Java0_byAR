package abstractClassMethodAndInterface15_16;

/**
 * Created by Daniel_D'AGE on 26.10.2018.
 * Klasy abstrakcyjne i metody abstrakcyjne
 * <p>
 * Klasta abstrakyjna pozwala na dziedzieczenie, ale nie pozwala na tworzenie obiektów na bazie klasy abstrakcyjnej,
 * wówczas trzeba przed definicją klasy dodac słowo abstract. Klasy abstrakcyjne służą do rozszerzania, dziedziczenia
 * po niej samej jako po klasie bazowej. jeżeli pojawi się metoda abstrakcyjna, to cała klasa musi być zadeklarowan jako
 * abstrakcyjna. metody abstrakcyjne musimy przesłonić @Override.
 *
 * Róznice między klasą abstrakcyjna a interfejsem
 * W javie nie ma wielokrotnego odziedziczenia klas, jest tylko wielokrotne dziedziczenie interfaceów!!
 * Metoda z klasy ma pierwszeństwo przed metodą z interfejsu przy wywołaniu
 */
public class Abstractions {
    public static void main(String[] args) {


        Figure figure1 = new Triangle();
        figure1.side = 5;
        figure1.draw();
        figure1.calculateTheField();
        System.out.println(figure1.statement("Trójkąt"));
        System.out.println("Wymiary boku: " + figure1.side + " cm");

        Square figure2 = new Square();
        figure2.side = 8;
        figure2.draw();
        figure2.calculateTheField();
        System.out.println(figure2.statement("Kwadrat"));
        System.out.println("Wymiary boku: " + figure2.side + " cm");





    }
}
