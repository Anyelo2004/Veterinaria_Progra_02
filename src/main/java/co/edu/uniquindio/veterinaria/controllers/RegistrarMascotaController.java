package co.edu.uniquindio.veterinaria.controllers;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Control;
import javafx.stage.Stage;

public class RegistrarMascotaController {

    @FXML private TextField txtNombre;
    @FXML private TextField txtEspecie;
    @FXML private TextField txtRaza;
    @FXML private TextField txtEdad;
    @FXML private TextField txtIdentificacion;
    @FXML private ComboBox<String> cmbPropietario;

    @FXML
    private void initialize() {
        // Simulación de propietarios ya registrados
        cmbPropietario.setItems(FXCollections.observableArrayList(
                "Juan Pérez", "Ana Gómez", "Carlos Ramírez"
        ));
    }

    @FXML
    private void guardarMascota() {
        if (cmbPropietario.getValue() == null) {
            new Alert(AlertType.WARNING, "La mascota necesita un propietario.").showAndWait();
            return;
        }
        System.out.println("Mascota -> " + txtNombre.getText() + " / Propietario: " + cmbPropietario.getValue());
        //lógica para guardar
    }

    @FXML
    private void cancelar(ActionEvent e) {
        ((Stage)((Control)e.getSource()).getScene().getWindow()).close();
    }
}

