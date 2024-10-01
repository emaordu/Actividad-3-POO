package Ejercicios.Tercer.ObjetosSonadores;

import Ejercicios.Tercer.Interfaces.Hablador;

public class Campana implements Hablador {
    public void hablar() {
        System.out.println("'La campana hace: ¡Ding-ding!");
    }
}
