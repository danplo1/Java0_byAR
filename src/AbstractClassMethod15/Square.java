package AbstractClassMethod15;

/**
 * Created by Daniel_D'AGE on 26.10.2018.
 */
public class Square extends Figure{
    @Override
    public void draw() {
        System.out.println("Rysuję kwadrat");
    }

    @Override
    public void calculateTheField() {
        System.out.println("Obliczam pole kwadratu");

    }
}
