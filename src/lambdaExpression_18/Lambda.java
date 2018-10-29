package lambdaExpression_18;

/**
 * Created by Daniel_D'AGE on 29.10.2018.
 * * Wyrażenia Lambda to funkcje anonimowe, nienazwane, nie mają żadnej dekalracji, a srosuje sie je po to aby móc
 * skorzystać z metody abstrakcyjnej, nie przesłaniająć jej. ->
 * Jeżeli inicjujemy wyrażenie lambda na bazie interfejsu, to w tym interfejsie nie moze znajdować sie więcej niż jedna
 * metoda abstrakcyjna!
 * @ Functional Interface - interfejs funkcjonanych
 *
 * Zbyt duza ilośc lambd powoduje spadek czytelnosci kodu
 */
public class Lambda {

    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;
        Calculator subtract = (x, y) -> x - y;
        Calculator multiplication = (a, b) -> a * b;

        System.out.println(add.sum(4, 5));
        System.out.println(subtract.sum(4,2));
        System.out.println(multiplication.sum(4,3));



        // lub (opcja bez lambdy)

        /*Calculator calculator = new Calculator() {
            @Override
            public int addition(int a, int b) {
                return a + b;

            }
        };

        Calculator calculator1 = new Calculator() {
            @Override
            public int addition(int a, int b) {
                return a - b;
            }
        };

        Calculator calculator2 = new Calculator() {
            @Override
            public int addition(int a, int b) {
                return a * b;
            }
        };*/
    }
}
