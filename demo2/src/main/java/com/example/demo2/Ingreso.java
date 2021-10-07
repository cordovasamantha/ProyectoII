package com.example.demo2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.LinkedList;
import java.util.Random;
import java.util.ResourceBundle;

public class Ingreso implements Initializable {
    @FXML ComboBox<String> tipoVehiculo;
    @FXML Label label;
    @FXML int espacio;
    @FXML TextField placas, Modelo;
    ObservableList<String> items = FXCollections.observableArrayList("Carro", "Camión", "Moto");
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tipoVehiculo.setItems(items);
    }
    private static LinkedList<Camion> camiones = new LinkedList<Camion>();
    private static LinkedList<Carros> carros = new LinkedList<Carros>();
    private static LinkedList<Motos> motos = new LinkedList<Motos>();
    private static LinkedList<Marcaje> recientes = new LinkedList<Marcaje>();

    @FXML
    Administracion  admin = new Administracion();
    @FXML
    private void seleccion(ActionEvent event) throws Exception {
        double tarifa;
        int espacios[][] = new int[1][2];

        tipoVehiculo.getValue();

        if (tipoVehiculo.getValue().equals( "Carro" )) {
           tarifa = admin.tCarro;
           espacios = admin.eCarros;

           Carros carro = new Carros(vehiculo.CARRO.name(), placas.getText());
           carros.add(carro);

        } else if (tipoVehiculo.getValue().equals( "Camiones" )) {
            tarifa = admin.tCamion;
            espacios = admin.eCamiones;

            Camion camion = new Camion(vehiculo.CAMION.name(), placas.getText());
            camiones.add(camion);

        } else if (tipoVehiculo.getValue().equals( "Motos" )) {
            tarifa = admin.tMoto;
            espacios = admin.eMotos;

            Motos moto = new Motos(vehiculo.MOTO.name(), placas.getText());
            motos.add(moto);

        }
        if (espacios[0][1] > 0) {
            Random random = new Random();
            espacio = random.ints(1, espacios[0][0]).findFirst().getAsInt();
            label.setText("El número de estacionamiento asignado para el vehiculo es: "+espacio);

        } else {
            JOptionPane.showMessageDialog(null, "No hay estacionamientos disponibles","Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
