package abstractClassMethodAndInterface15_16;

/**
 * Created by Daniel_D'AGE on 26.10.2018.
 */
public class Square extends Figure implements Interface1 {
    @Override
    public void draw() {
        System.out.println("Rysuję kwadrat");

    }


    @Override
    public void method1() {

    }

    @Override
    public String method2() {
        return null;
    }


    @Override
    public void calculateTheField() {
        System.out.println("Obliczam pole kwadratu");

    }


}
