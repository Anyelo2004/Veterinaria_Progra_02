package co.edu.uniquindio.veterinaria.controllers;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegistrarEmpleadoController {

    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtIdentificacion;
    @FXML
    private TextField txtDireccion;
    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtCargo;
    @FXML
    private ComboBox<String> cmbEspecialidad;

    @FXML
    private void initialize() {
        // Opciones de especialidad para veterinarios
        cmbEspecialidad.setItems(FXCollections.observableArrayList("Doméstico", "Exótico"));
    }

    @FXML
    private void guardarEmpleado() {
        System.out.println(
                "Empleado -> " + txtNombre.getText() + " / " + txtCargo.getText() + " / " + cmbEspecialidad.getValue());
        // lógica para guardar
    }

    @FXML
    private void cancelar(ActionEvent e) {
        ((Stage) ((Control) e.getSource()).getScene().getWindow()).close();
    }
}
