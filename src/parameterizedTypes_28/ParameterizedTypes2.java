package parameterizedTypes_28;

/**
 * Created by Daniel_D'AGE on 12.11.2018.
 *
 * <T> oznacza, że wszytsko (każdy typ obiektu) co przeslemy do konstruktora, podmieni nam literke T na konkretny typ obiektu
 *
 *
 */
public class ParameterizedTypes2 {
    public static void main(String[] args) {

        TypedGen <Integer> typedGen;
        typedGen=new TypedGen<Integer>(10);

        int i = typedGen.getObject();
        System.out.println(i);

        TypedGen <String> typedGen2 = new TypedGen<String>("Test");

        String string = typedGen2.getObject();
        System.out.println(string);

    }
}

class TypedGen <T>{

    T object;

    TypedGen(T object){
        this.object =object;
    }
    void showType(){

        System.out.println(object.getClass().getName());
    }

    public T getObject() {
        return object;
    }
}
