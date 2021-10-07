package com.example.demo2;

enum vehiculo{
    CARRO, CAMION, MOTO;
}
public class Vehiculos {
    private String tipo;
    private String placa;

    public Vehiculos(String tipo, String placa) {
        this.tipo = tipo;
        this.placa = placa;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return this.tipo;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getPlaca() {
        return this.placa;
    }

}
