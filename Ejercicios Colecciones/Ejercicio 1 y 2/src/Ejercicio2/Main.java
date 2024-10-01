package Ejercicio2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Cronometro cronometro = new Cronometro();

        System.out.println("Probando con 100 numeros: ");
        pruebaConNumeros(100, cronometro);

        System.out.println("Probando con 1000 numeros: ");
        pruebaConNumeros(1000, cronometro);

        System.out.println("Probando con 10000 numeros: ");
        pruebaConNumeros(10000, cronometro);

        System.out.println("Probando con 100000 numeros: ");
        pruebaConNumeros(100000, cronometro);
    }

    public static void pruebaConNumeros(int cantElementos, Cronometro cronometro) {
        ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>(cantElementos);

        for (int i = 0; i < cantElementos; i++) {
            numerosAleatorios.add(ThreadLocalRandom.current().nextInt());
        }

        cronometro.empezar();
        Collections.sort(numerosAleatorios);
        cronometro.finalizar();

        cronometro.tiempoQueTarda();
        
        cronometro.reset();
    }
}
