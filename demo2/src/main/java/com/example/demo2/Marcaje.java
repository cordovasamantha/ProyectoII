package com.example.demo2;

import java.time.LocalDateTime;

 enum tipoMarcaje {
    INGRESO,
    EGRESO
}

/**
 * @author Sirias
 */
public class Marcaje {
    private String tipo;
    private String tipoVehiculo;
    private String placa;
    private LocalDateTime fecha;

    /**
     * @param tipo
     * @param placa
     * @param tipoVehiculo
     * @param fecha
     */
    public Marcaje(String tipo, String placa, String tipoVehiculo, LocalDateTime fecha) {
        this.tipo = tipo;
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
        this.fecha = fecha;
    }

    /**
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return string
     */
    public String getTipo() {
        return this.tipo;
    }

    /**
     * @param placa
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return string
     */
    public String getPlaca() {
        return this.placa;
    }

    /**
     * @param tipoVehiculo
     */
    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    /**
     * @return string
     */
    public String getTipoVehiculo() {
        return this.tipoVehiculo;
    }

    /**
     * @param fecha
     */
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    /**
     * @return LocalDateTime
     */
    public LocalDateTime getFecha() {
        return this.fecha;
    }
}
