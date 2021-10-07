package com.example.demo2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SeleccionModulo implements Initializable {
    @FXML ComboBox<String> comboBox;
    @FXML private Button seleccionar;
    ObservableList<String> items = FXCollections.observableArrayList("Administracion", "Ingreso", "Egreso");
    private ItemEvent event;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBox.setItems(items);
    }

    @FXML
    private void seleccion(ActionEvent event) throws IOException {
        comboBox.getValue();
        if (comboBox.getValue().equals( "Administracion" )){

            JOptionPane.showMessageDialog(null, "Bienvenido al modulo de administracion","Bienvenido", JOptionPane.INFORMATION_MESSAGE);
            try {
            FXMLLoader fxmlLoader = new FXMLLoader( getClass().getResource( "Administracion.fxml")); //cargamos nuestra vista

            Parent root = fxmlLoader.load();
            Administracion admin = fxmlLoader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.initModality(Modality.APPLICATION_MODAL);

            stage.setScene(scene);
            stage.showAndWait();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if (comboBox.getValue().equals( "Ingreso" )){
            JOptionPane.showMessageDialog(null, "Bienvenido al modulo de ingreso","Bienvenido", JOptionPane.INFORMATION_MESSAGE);
            try {
                FXMLLoader fxmlLoader = new FXMLLoader( getClass().getResource( "Ingreso.fxml")); //cargamos nuestra vista

                Parent root = fxmlLoader.load();
                Ingreso ingreso = fxmlLoader.getController();

                Scene scene = new Scene(root);
                Stage stage = new Stage();

                stage.initModality(Modality.APPLICATION_MODAL);

                stage.setScene(scene);
                stage.showAndWait();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if (comboBox.getValue().equals( "Egreso" )){

            JOptionPane.showMessageDialog(null, "Bienvenido al modulo de Egreso","Bienvenido", JOptionPane.INFORMATION_MESSAGE);
            try {
                FXMLLoader fxmlLoader = new FXMLLoader( getClass().getResource( "Egreso.fxml")); //cargamos nuestra vista

                Parent root = fxmlLoader.load();
                Egreso egreso = fxmlLoader.getController();

                Scene scene = new Scene(root);
                Stage stage = new Stage();

                stage.initModality(Modality.APPLICATION_MODAL);

                stage.setScene(scene);
                stage.showAndWait();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
