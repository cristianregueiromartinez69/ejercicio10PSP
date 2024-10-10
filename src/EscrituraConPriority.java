/**
 * Clase EscrituraConPriority donde establecemos hilos por prioridad
 * @author cristian
 * @version 1.0
 */
public class EscrituraConPriority implements Runnable{

    //el numero del hilo
    private int numeroHilo;

    /**
     * Contructor de la clase
     * @param numeroHilo el hilo que se va a ejecutar
     */
    public EscrituraConPriority(int numeroHilo) {
        this.numeroHilo = numeroHilo;
    }

    @Override
    public void run() {

        //metemos el hilo en bucle para comprobar si la prioridad funciona mas o menos ya que no es seguro que se ejecute uno antes que otro
        for(int i = 0; i < 20; i++){
            if(numeroHilo == 1){
                System.out.println("Hola, soy el hilo numero: " + numeroHilo + " y uso prioridad");
            } else if (numeroHilo == 2) {
                System.out.println("Hola, soy el hilo numero: " + numeroHilo + " y uso prioridad");
            }
        }


    }
}
