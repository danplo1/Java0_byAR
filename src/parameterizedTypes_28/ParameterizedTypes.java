package parameterizedTypes_28;

/**
 * Created by Daniel_D'AGE on 12.11.2018.
 * typy (generyczne) sparametryzowane - to szablony dzieki którym możemy unikać nieotrzebnego rzutowania
 * przy ich pomocy kompilator jest w stanie sprawdzić zgodnośc typów na etapie kommpilacji, co oznacza, że możemy
 * wykryć więcej błędów na etrapie komilacji a nie na etapie wykonywania samego programu. Dzieki nim korzystamy z
 * ze scisłego typowanie w kontekscie danej sytuacji
 */
public class ParameterizedTypes {


    //przykład z zastosowaniem rzutowania, wadliwe rozwiązanie
    public static void main(String[] args) {

        TypeN typeN = new TypeN(new String("Typ obiekt"));


        typeN.showType();
        String string = (String) typeN.getObject(); //rzutowanie, wadliwe rozwiązanie
        System.out.println(string);

        TypeN typeN2 = new TypeN(new Integer(10));

        typeN2.showType();
        Integer integer = (Integer) typeN2.getObject();
        System.out.println(integer);

    }
}

class TypeN {
    Object object;

    public TypeN(Object object) {
        this.object = object;
    }

    void showType() {
        System.out.println(object.getClass().getName());

    }

    public Object getObject() {
        return object;
    }
}
