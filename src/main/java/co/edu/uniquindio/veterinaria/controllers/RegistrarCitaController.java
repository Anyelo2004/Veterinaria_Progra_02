package co.edu.uniquindio.veterinaria.controllers;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Control;
import javafx.stage.Stage;

public class RegistrarCitaController {

    @FXML
    private DatePicker dtpFecha;
    @FXML
    private TextField txtHora;
    @FXML
    private ComboBox<String> cmbMascota;
    @FXML
    private TextField txtPeso;
    @FXML
    private ComboBox<String> cmbVeterinario;
    @FXML
    private TextField txtIdentificacionVet;
    @FXML
    private TextArea txtMotivo;

    @FXML
    private void initialize() {
        // Datos simulados
        cmbMascota.setItems(FXCollections.observableArrayList("Firulais", "Michi", "Toby"));
        cmbVeterinario.setItems(FXCollections.observableArrayList("Dr. Pérez", "Dra. Gómez", "Dr. Ramírez"));
    }

    @FXML
    private void guardarCita() {
        System.out.println("Cita -> Mascota: " + cmbMascota.getValue() + " / Vet: " + cmbVeterinario.getValue());
        //lógica para guardar
    }

    @FXML
    private void cancelar(ActionEvent e) {
        ((Stage) ((Control) e.getSource()).getScene().getWindow()).close();
    }
}
