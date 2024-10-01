package Ejercicio2;

public class Cronometro {
    private long empieza;
    private long termina;
    private boolean activo;

    void empezar() {
        empieza = System.currentTimeMillis();
        activo = true;
    };

    void finalizar() {
        if(activo) {
            termina = System.currentTimeMillis();
            activo = false;
        }      
    };

    void reset() {
       empieza = 0;
       termina = 0;
       activo = false;
    };

    void tiempoQueTarda() {
        var tiempo = termina - empieza;
        System.out.println("El programa tardo " + tiempo + " milisegundos en ordenar los numeros.");
    }
    
}
