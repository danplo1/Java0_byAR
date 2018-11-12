package threads_25_26_27;

/**
 * Created by Daniel_D'AGE on 09.11.2018.
 * Wątki - synchronizacja wątków;
 */

class Write {

    void write(String message) {

        System.out.println("** " + message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Przerwano wątek! ");
        }
        System.out.println(" **");
    }
}

class Writer implements Runnable {

    String message;
    Write write;
    Thread thread;

    public Writer(String message, Write write, Thread thread) {
        this.message = message;
        this.write = write;
        thread = new Thread(this);
        thread.start();
    }


    @Override
    public void run() {
        synchronized (write){ // pozwala nam na kolejkowanie wątków przy uruchomieniu
        write.write(message);
    }
}


public static class Threadss {
    public static void main(String[] args) {

        /*Write writer = new Write();
        Writer writer1 = new Writer(writer, "To jest ");
        Writer writer2 = new Writer(writer, "synchronizacja ");
        Writer writer3 = new Writer(writer, "wątków. ");


        try {
            writer1.thread.join();
            writer2.thread.join();
            writer3.thread.join();

        } catch (InterruptedException ex) {

            System.out.println("Przerwano! ");*/
        }
    }

}

