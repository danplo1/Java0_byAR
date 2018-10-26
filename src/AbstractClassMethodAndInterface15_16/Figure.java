package AbstractClassMethodAndInterface15_16;

/**
 * Created by Daniel_D'AGE on 26.10.2018.
 * metoda abstrakcyjna słuzy tylko i wyłącznie do zadeklarowania i podobnie jak metoda w interfejsie nie ma ciała,
 * mówi nam co można zrobić, ale nie mówi jak to zrobić. musimy ją przesłonić w miejscu, gdzie tej meody będziemy używać
 * Zgodnie z dziedziczeniem w klasie abstrakcyjnej mogę mieć metody nieabstrakcyjne
 */
abstract public class Figure {


    int side;

    public abstract void draw();

    public abstract void calculateTheField();

    public String statement(String string) {
        return string;
    }


}
