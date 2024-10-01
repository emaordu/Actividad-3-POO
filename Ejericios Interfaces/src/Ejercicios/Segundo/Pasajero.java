package Ejercicios.Segundo;

import Ejercicios.Segundo.Interfaces.Frecuencia;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Pasajero implements Frecuencia {
    private String nombre;
    private int millas;
    private Date fechaUltimoViaje;
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    public Pasajero(String nombre) {
        this.nombre = nombre;
        this.millas = 0;
        this.fechaUltimoViaje = null;
    }

    public void actualizarViaje(int distancia) {
        this.millas += distancia;
        this.fechaUltimoViaje = new Date();
    }

    @Override
    public int millas() {
        return millas;
    }

    @Override
    public Date ultimoViaje() {
        return fechaUltimoViaje;
    }

    public void realizarViaje(Vehiculo vehiculo, int distancia) {
        System.out.println(nombre + " está viajando en " + vehiculo.getTipoVehiculo() + " (" + vehiculo.getMatricula()
                + ") por " + distancia + " millas.");

        // Actualizamos las millas conducidas por el pasajero
        actualizarViaje(distancia);

        // Actualizamos las millas del vehículo
        vehiculo.actualizarViaje(distancia);
    }

    public String getNombre() {
        return nombre;
    }

    public String getUltimoViajeFormatted() {
        return fechaUltimoViaje != null ? DATE_FORMAT.format(fechaUltimoViaje) : "No registrado";
    }
}
