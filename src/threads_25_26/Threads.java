package threads_25_26;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Created by Daniel_D'AGE on 08.11.2018.
 * Wątki to podprocesy uruchamiane przez program główny, który jest wątkiem głównym
 * 1
 */

class NewThread implements Runnable {

    private String name;
    Thread thread; //referencja

    NewThread(String name, Thread thread) {
        this.name = name;
        thread = new Thread(this, name); //nowy wątek jeszcze nie uruchomiony, this informuje, że natychmiast
        // po jego uruchomieniu ma zostac przekazany do metody run, ma być uruchomiony
        thread.start();
    }



    @Override
    public void run() {
        System.out.println("Uruchomiony wątek potomny " + name);

        try {
            System.out.println(" Wątek potomny " + name + "jest uśpiony! ");
            Thread.sleep(2000); //uśpienie wyjątku
            System.out.println(" Wątek potomny " + name + "został wznowiony! ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Zakończono działanie wątku potomnego! " + name);


    }
}

public class Threads {
    public static void main(String[] args) {



        new NewThread("JEDEN");
        new NewThread("DWA);



        try{
            System.out.println("Usypiam wątek główny!");
            Thread.sleep(9000);
            System.out.println("Wznawiam wątek główny. ");
        }catch(InterruptedException e){
            System.out.println("Przerwano wątek główny! ");
        }
        System.out.println("Zakończonio wykonwanie wyjątku! ");

    }
}
