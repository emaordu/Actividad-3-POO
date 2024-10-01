package Ejercicios.Segundo;

import Ejercicios.Segundo.Interfaces.Frecuencia;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Vehiculo implements Frecuencia {
    private String tipoVehiculo;
    private String matricula;
    private int millas;
    private Date fechaUltimoViaje;
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    public Vehiculo(String tipoVehiculo, String matricula) {
        this.tipoVehiculo = tipoVehiculo;
        this.matricula = matricula;
        this.millas = 0;
        this.fechaUltimoViaje = null;
    }

    @Override
    public int millas() {
        return millas;
    }

    @Override
    public Date ultimoViaje() {
        return fechaUltimoViaje;
    }

    public void actualizarViaje(int distancia) {
        this.millas += distancia;
        this.fechaUltimoViaje = new Date();
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getUltimoViajeFormatted() {
        return fechaUltimoViaje != null ? DATE_FORMAT.format(fechaUltimoViaje) : "No registrado";
    }
}
