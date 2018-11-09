package threads_25_26_27;

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



        /*NewThread nt1 = new NewThread("JEDEN");
        NewThread nt2 = new NewThread("DWA");
        NewThread nt3 = new NewThread("TRZY");

        System.out.println("WĄTEK " + nt1.thread.getName() + "" + nt1.thread.isAlive()); //metoda do sprawdzania czy wątek żyje, sprawdza jego stan
        System.out.println("WĄTEK " + nt2.thread.getName() + "" + nt1.thread.isAlive());
        System.out.println("WĄTEK " + nt3.thread.getName() + "" + nt1.thread.isAlive());

        try{
            System.out.println(nt1.thread.isAlive());
            System.out.println(nt2.thread.isAlive());
            System.out.println(nt3.thread.isAlive());


            nt1.thread.join();
            nt2.thread.join();
            nt1.thread.join();


        }catch(InterruptedException e){
            System.out.println("Przerwano wątek główny! ");
        }
        System.out.println("Zakończono wykonwanie wyjątku! ");*/

    }
}
