package pseudoRandomNumbers_17;

import java.util.Random;

/**
 * Created by Daniel_D'AGE on 29.10.2018.
 */
public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int a = random.nextInt();
        System.out.println(a);

        int b = random.nextInt(11);
        System.out.println(b);

        int c =random.nextInt(10)+1;
        System.out.println(c);

        float e = random.nextFloat();
        System.out.println(e);

        double f = random.nextDouble();
        System.out.println(f);

        boolean g = random.nextBoolean();
        System.out.println(g);

    }
}
