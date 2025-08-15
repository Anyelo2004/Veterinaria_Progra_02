package co.edu.uniquindio.veterinaria.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MenuPrincipalController {

    private void abrirVentana(String fxml, String titulo) throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/co/edu/uniquindio/veterinaria/" + fxml));
        Stage stage = new Stage();
        stage.setScene(new Scene(loader.load()));
        stage.setTitle(titulo);
        stage.setResizable(false);
        stage.show();
    }

    @FXML
    private void abrirRegistrarCliente() throws Exception {
        abrirVentana("RegistrarCliente.fxml", "Registrar Cliente");
    }

    @FXML
    private void abrirRegistrarMascota() throws Exception {
        abrirVentana("RegistrarMascota.fxml", "Registrar Mascota");
    }

    @FXML
    private void abrirRegistrarCita() throws Exception {
        abrirVentana("RegistrarCita.fxml", "Registrar Cita");
    }

    @FXML
    private void abrirRegistrarEmpleado() throws Exception {
        abrirVentana("RegistrarEmpleado.fxml", "Registrar Empleado");
    }

    @FXML
    private void abrirGestionCitas() throws Exception {
        abrirVentana("GestionCitas.fxml", "Gestión de Citas");
    }

    @FXML
    private void salir() {
        System.exit(0);
    }
}
