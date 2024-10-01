package Ejercicio1;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class NumerosAleatorios {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>(1000);
        
        while(numerosAleatorios.size() != 1000) {
            numerosAleatorios.add(ThreadLocalRandom.current().nextInt(1000, 5000));
        } 

        int numeroMin = numerosAleatorios.get(0);
        int numeroMax = numerosAleatorios.get(0);

        System.out.println("Tamanio del ArrayList: " + numerosAleatorios.size());
        System.out.println("Primer elemento: " + numerosAleatorios.get(0));
        System.out.println("Ultimo elemento: " + numerosAleatorios.get(numerosAleatorios.size() - 1));
        //System.out.println("Todos: " + numerosAleatorios);

        for(int i = 0; i < numerosAleatorios.size(); i++ ) {
            int numActual = numerosAleatorios.get(i);
            if(numActual < numeroMin) {
                numeroMin = numActual;
            }
            if(numActual > numeroMax) {
                numeroMax = numActual;
            }
        }

        System.out.println("El numero mas chico es: " + numeroMin + " y se encuentra en la posicion " + numerosAleatorios.indexOf(numeroMin));
        System.out.println("El numero mas grande es: " + numeroMax + " y se encuentra en la posicion " + numerosAleatorios.indexOf(numeroMax));
    }
}
