package co.edu.uniquindio.veterinaria.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Control;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegistrarClienteController {

    @FXML private TextField txtNombre;
    @FXML private TextField txtTelefono;
    @FXML private TextField txtDireccion;

    @FXML
    private void guardarCliente() {
        // Aquí va la lógica luego. Por ahora sólo mostramos en consola.
        System.out.println("Cliente -> " + txtNombre.getText() + " / " + txtTelefono.getText() + " / " + txtDireccion.getText());
    }

    @FXML
    private void cancelar(ActionEvent e) {
        ((Stage)((Control)e.getSource()).getScene().getWindow()).close();
    }
}
