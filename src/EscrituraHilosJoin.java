/**
 * Clase para la escritura de hilos con join
 * @author cristian
 * @version 1.0
 */
public class EscrituraHilosJoin implements Runnable{

    //variables con el numero minimo y maximo de hilos
    private int numHilo;

    /**
     * contructor de la clase
     * @param numHilo el numero de hilos
     */
    public EscrituraHilosJoin(int numHilo) {
        this.numHilo = numHilo;
    }

    @Override
    public void run() {

        /**
         * si el hilo es 1, ejecutaqmos el 2 primero
         */
        try{
        if (numHilo == 1) {
            Thread hilo2 = new Thread(new EscrituraHilosJoin(2));
            hilo2.start();
            hilo2.join();
        }
        System.out.println("Hola, soy el hilo número " + numHilo + " y uso el join");
    } catch (InterruptedException e) {
        System.out.println("Error en la ejecución del hilo");
    }
    }
}
