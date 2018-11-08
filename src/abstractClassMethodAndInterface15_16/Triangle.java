package abstractClassMethodAndInterface15_16;

/**
 * Created by Daniel_D'AGE on 26.10.2018.
 */
public class Triangle extends Figure implements Interface2 {

    @Override
    public void draw() {
        System.out.println("Rysuję trójkąt");
    }

    @Override
    public void calculateTheField() {
        System.out.println("Obliczam pole trójkąta");
    }

    @Override
    public void method3() {
        System.out.println("Metoda 3 z implementacji");
    }

   /* @Override
    public void method4() {
        System.out.println("Metoda 4 z klasy");

    }
    Nie stosujemy
    */



}
