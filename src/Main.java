/**
 * Clase main donde ejecutamos el programa
 * @author cristian
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {


        //creamos un hilo e introducimos el numero de hilos y su maximo
        Thread hilo = new Thread(new EscrituraHilosJoin(1));

        //iniciamos el hilo
        hilo.start();



        //instanciamos 2 hilos y los iniciamos
        Thread hilo2 = new Thread(new EscrituraConPriority(1));
        Thread hilo3 = new Thread(new EscrituraConPriority(2));


        //le damos a uno prioridad alta y a otro baja
        hilo2.setPriority(Thread.MAX_PRIORITY);
        hilo3.setPriority(Thread.MIN_PRIORITY);

        //iniciamos los hilos
        hilo2.start();
        hilo3.start();




    }
}