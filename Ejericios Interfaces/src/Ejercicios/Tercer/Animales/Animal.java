package Ejercicios.Tercer.Animales;

import Ejercicios.Tercer.Interfaces.Hablador;

public abstract class Animal implements Hablador {
    private final Sexo sexo;
    private final int edad;
    private final double pesoKG;

    protected enum Sexo {
        MACHO, HEMBRA
    }

    // Constructor con valores por defecto
    public Animal() {
        this.sexo = Sexo.MACHO; // Valor por defecto
        this.edad = 7; // Valor por defecto
        this.pesoKG = 7; // Valor por defecto
    }

    // Constructor con parámetros
    public Animal(Sexo sexo, int edad, double peso) {
        this.sexo = sexo;
        this.edad = edad;
        this.pesoKG = peso;
    }

    public void mostrarInformacion() {
        // Obtener el nombre de la clase
        String nombreClase = this.getClass().getSimpleName();

        // Imprimir información
        System.out.println("El animal " + nombreClase + " que es " + sexo + " y tiene " + edad + " años y pesa "
                + pesoKG + " KGs dice..");
    }
}
