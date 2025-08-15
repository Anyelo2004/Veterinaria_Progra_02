package app;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RegistrarEmpleado {

    public void mostrar() {
        Stage stage = new Stage();
        stage.setTitle("Registrar Empleado");

        // Cuadrícula para que todo quede derecho
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        // Campo pa nombre
        Label lblNombre = new Label("Nombre:");
        TextField txtNombre = new TextField();
        txtNombre.setPromptText("Ingrese el nombre");

        // Campo pa identificación
        Label lblId = new Label("Identificación:");
        TextField txtId = new TextField();
        txtId.setPromptText("Ingrese la identificación");

        // Campo pa dirección
        Label lblDireccion = new Label("Dirección:");
        TextField txtDireccion = new TextField();
        txtDireccion.setPromptText("Ingrese la dirección");

        // Campo pa teléfono
        Label lblTelefono = new Label("Teléfono:");
        TextField txtTelefono = new TextField();
        txtTelefono.setPromptText("Ingrese el teléfono");

        // Campo pa cargo
        Label lblCargo = new Label("Cargo:");
        TextField txtCargo = new TextField();
        txtCargo.setPromptText("Ingrese el cargo");

        // Campo pa especialidad (solo si es veterinario)
        Label lblEspecialidad = new Label("Especialidad:");
        ComboBox<String> cmbEspecialidad = new ComboBox<>();
        cmbEspecialidad.getItems().addAll("Doméstico", "Exótico");
        cmbEspecialidad.setPromptText("Seleccione la especialidad");

        // Botón pa guardar
        Button btnGuardar = new Button("Guardar Empleado");
        // Aquí mete la lógica de guardar
        //ejemplo del buen chato gpt
        // btnGuardar.setOnAction(e -> { ... });

        // Agregamos todo al grid
        grid.add(lblNombre, 0, 0);
        grid.add(txtNombre, 1, 0);
        grid.add(lblId, 0, 1);
        grid.add(txtId, 1, 1);
        grid.add(lblDireccion, 0, 2);
        grid.add(txtDireccion, 1, 2);
        grid.add(lblTelefono, 0, 3);
        grid.add(txtTelefono, 1, 3);
        grid.add(lblCargo, 0, 4);
        grid.add(txtCargo, 1, 4);
        grid.add(lblEspecialidad, 0, 5);
        grid.add(cmbEspecialidad, 1, 5);
        grid.add(btnGuardar, 1, 6);

        // Mostramos
        Scene scene = new Scene(grid, 500, 400);
        stage.setScene(scene);
        stage.show();
    }
}

