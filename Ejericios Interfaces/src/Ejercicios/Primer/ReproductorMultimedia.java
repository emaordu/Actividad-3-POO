package Ejercicios.Primer;

import Ejercicios.Primer.Interfaces.VideoClip;

public class ReproductorMultimedia implements VideoClip {
    private boolean reproduciendo;
    private boolean enBucle;
    private Thread hiloBucle;

    public ReproductorMultimedia() {
        reproduciendo = false;
        enBucle = false;
    }

    @Override
    public void play() {
        if (!reproduciendo) {
            enBucle = false;
            reproduciendo = true;
            System.out.println("Reproduciendo el video..");
        } else {
            System.out.println("El video ya esta reproduciendose..");
        }
    }

    @Override
    public void bucle() {
        if (!reproduciendo) {
            System.out.println("Antes de poner el video en bucle tiene que estar reproduciendose...");
        } else {
            if (!enBucle) {
                enBucle = true;
                System.out.println("Reproduciendo el video en bucle..");

                // Crear un hilo para el bucle
                hiloBucle = new Thread(() -> {
                    while (enBucle) {
                        System.out.println("Video reiniciando...");
                        try {
                            Thread.sleep(1000); // Simula un pequeño retraso entre repeticiones
                        } catch (InterruptedException e) {
                            System.out.println("El hilo del bucle fue interrumpido.");
                        }
                    }
                });
                // Iniciar el hilo del bucle
                hiloBucle.start();
            } else {
                System.out.println("El video ya está en bucle.");
            }
        }
    }

    @Override
    public void stop() {
        if (reproduciendo) {
            reproduciendo = false;
            enBucle = false;
            System.out.println("Deteniendo el video...");

            // Interrumpir el hilo del bucle si está en ejecución
            if (hiloBucle != null && hiloBucle.isAlive()) {
                hiloBucle.interrupt();
            }
        } else {
            System.out.println("El video ya está detenido.");
        }
    }

}
