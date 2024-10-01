package Ejercicios.Tercer;

import Ejercicios.Tercer.Animales.Animal;
import Ejercicios.Tercer.Interfaces.Hablador;

public class TalkAdmin {
    public void hacerHablar(Hablador sujeto) {
        if (sujeto instanceof Animal) {
            // Casting de sujeto a Animal
            Animal animal = (Animal) sujeto;
            animal.mostrarInformacion();
        } else {
            
        }

        sujeto.hablar();
    }
}
