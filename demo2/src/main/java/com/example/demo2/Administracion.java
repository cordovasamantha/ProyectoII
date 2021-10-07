package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Administracion implements Initializable {
    public double tCarro, tCamion, tMoto;
    public int[][] eCarros, eCamiones, eMotos;
    @FXML TextField estCarros;
    @FXML TextField estMotos;
    @FXML TextField estCamiones;
    @FXML TextField tCarros;
    @FXML TextField tMotos;
    @FXML TextField tCamiones;

    @Override

    public void initialize(URL url, ResourceBundle resourceBundle) {}

    public void tarifas(){
        double tCarro = Double.parseDouble(tCarros.getText());
        double tCamion = Double.parseDouble(tCamiones.getText());
        double tMoto = Double.parseDouble(tMotos.getText());
    }
    public void espacios(){
        int eCarros = Integer.parseInt(estCarros.getText());
        int eCamiones = Integer.parseInt(estCamiones.getText());
        int eMotos = Integer.parseInt(estMotos.getText());
    }

    @FXML
   public void aceptar(ActionEvent event) throws IOException {
       FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SeleccionModulo.fxml"));
       Parent root = fxmlLoader.load();
       SeleccionModulo sM = fxmlLoader.getController();

       Scene scene = new Scene(root);
       Stage stage = new Stage();

       stage.initModality(Modality.APPLICATION_MODAL);

       stage.setScene(scene);
       stage.showAndWait();
    }

}
