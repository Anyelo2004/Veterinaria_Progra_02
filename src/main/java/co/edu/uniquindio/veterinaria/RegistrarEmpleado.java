package co.edu.uniquindio.veterinaria;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RegistrarEmpleado {

    public void mostrar() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/RegistrarEmpleado.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Registrar Empleado");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}