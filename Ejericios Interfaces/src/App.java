import java.util.Scanner;

import Ejercicios.Primer.ReproductorMultimedia;
import Ejercicios.Segundo.Pasajero;
import Ejercicios.Segundo.Vehiculo;
import Ejercicios.Tercer.TalkAdmin;
import Ejercicios.Tercer.Animales.Gato;
import Ejercicios.Tercer.Animales.Perro;
import Ejercicios.Tercer.ObjetosSonadores.Campana;
import Ejercicios.Tercer.ObjetosSonadores.RelojCuCu;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Ejercicio 1: ReproductorMultimedia");
            System.out.println("2. Ejercicio 2: Pasajero y Vehículo");
            System.out.println("3. Ejercicio 3: Animales y Sonidos");
            System.out.println("0. Salir");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (choice) {
                case 1:
                    menuReproductorMultimedia(scanner);
                    break;
                case 2:
                    menuPasajeroVehiculo(scanner); // Submenú Ejercicio 2
                    break;
                case 3:
                    menuHablador(scanner); // Submenú Ejercicio 3
                    break;
                case 0:
                    exit = true;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }

    // Submenú para el Ejercicio 1 (ReproductorMultimedia)
    private static void menuReproductorMultimedia(Scanner scanner) {
        ReproductorMultimedia reproductor = new ReproductorMultimedia();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Reproductor Multimedia ---");
            System.out.println("1. Reproducir video");
            System.out.println("2. Reproducir video en bucle");
            System.out.println("3. Detener video");
            System.out.println("0. Volver al menú principal");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (choice) {
                case 1:
                    reproductor.play();
                    break;
                case 2:
                    reproductor.bucle();
                    break;
                case 3:
                    reproductor.stop();
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Submenú para el Ejercicio 2 (Pasajero y Vehículo)
    private static void menuPasajeroVehiculo(Scanner scanner) {
        Vehiculo vehiculo = null;
        Pasajero pasajero = null;
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Pasajero y Vehiculo ---");
            System.out.println("1. Crear Vehiculo y Pasajero");
            System.out.println("2. Realizar Viaje");
            System.out.println("3. Obtener Nombre y Vehiculo");
            System.out.println("4. Obtener Millas y Fecha del Ultimo Viaje");
            System.out.println("0. Volver al menú principal");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (choice) {
                case 1:
                    // Crear un vehículo
                    System.out.println("Ingrese el tipo de vehículo (ej. Auto, Moto): ");
                    String tipoVehiculo = scanner.nextLine();
                    System.out.println("Ingrese la matrícula del vehículo: ");
                    String matricula = scanner.nextLine();
                    vehiculo = new Vehiculo(tipoVehiculo, matricula);
                    System.out.println("Vehículo creado exitosamente.");
                    System.out.println("Ingrese el nombre del pasajero: ");
                    String nombrePasajero = scanner.nextLine();
                    pasajero = new Pasajero(nombrePasajero);
                    System.out.println("Pasajero creado exitosamente.");
                    break;
                case 2:
                    // Realizar un viaje
                    if (vehiculo == null || pasajero == null) {
                        System.out.println("Debe crear un vehículo y un pasajero antes de realizar un viaje.");
                    } else {
                        System.out.println("Ingrese la distancia del viaje en millas: ");
                        int distancia = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea
                        pasajero.realizarViaje(vehiculo, distancia);
                    }
                    break;

                case 3:
                    // Obtener nombre del pasajero y tipo de vehículo
                    if (vehiculo == null || pasajero == null) {
                        System.out.println("Debe crear un vehículo y un pasajero antes de consultar esta información.");
                    } else {
                        System.out.println("Pasajero: " + pasajero.getNombre());
                        System.out.println(
                                "Vehículo: " + vehiculo.getTipoVehiculo() + " (" + vehiculo.getMatricula() + ")");
                    }
                    break;

                case 4:
                    // Obtener millas y ultimo viaje del pasajero y del vehículo
                    if (vehiculo == null || pasajero == null) {
                        System.out.println("Debe crear un vehículo y un pasajero antes de consultar esta información.");
                    } else {
                        System.out.println("Millas conducidas en total por el pasajero: " + pasajero.millas());
                        System.out.println("Millas recorridas en total por el vehículo: " + vehiculo.millas());
                        System.out.println("Último viaje del pasajero: " + pasajero.getUltimoViajeFormatted());
                        System.out.println("Último viaje del vehículo: " + vehiculo.getUltimoViajeFormatted());
                    }
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Submenú para el Ejercicio 3 (Gato y Perro)
    private static void menuHablador(Scanner scanner) {
        TalkAdmin talkAdmin = new TalkAdmin();
        Gato gato = new Gato();
        Perro perro = new Perro();
        RelojCuCu relojCuCu = new RelojCuCu();
        Campana campanita = new Campana();
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Animales y Sonidos ---");
            System.out.println("1. Hacer hablar al Gato");
            System.out.println("2. Hacer hablar al Perro");
            System.out.println("3. Hacer sonar al Reloj Cucú");
            System.out.println("4. Hacer sonar Campanita");
            System.out.println("0. Volver al menú principal");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (choice) {
                case 1:
                    talkAdmin.hacerHablar(gato);
                    break;
                case 2:
                    talkAdmin.hacerHablar(perro);
                    break;
                case 3:
                    talkAdmin.hacerHablar(relojCuCu);
                    break;
                case 4:
                    talkAdmin.hacerHablar(campanita);
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
