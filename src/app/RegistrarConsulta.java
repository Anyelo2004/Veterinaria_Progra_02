package app;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RegistrarConsulta {

    public void mostrar() {
        Stage stage = new Stage();
        stage.setTitle("Registrar Consulta");

        // Cuadrícula pa poner todo ordenadito
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(20));
        grid.setHgap(10);
        grid.setVgap(10);

        // Campo pa la fecha
        Label lblFecha = new Label("Fecha:");
        DatePicker datePicker = new DatePicker();

        // Campo pa la hora
        Label lblHora = new Label("Hora:");
        TextField txtHora = new TextField();
        txtHora.setPromptText("Ej: 14:30");

        // Lista pa seleccionar la mascota atendida
        Label lblMascota = new Label("Mascota atendida:");
        ComboBox<String> cmbMascota = new ComboBox<>();
        cmbMascota.setPromptText("Seleccione la mascota");
        // Aquí mete las mascotas registradas
        //ejemplo del buen chato
        // cmbMascota.getItems().addAll(...);

        // Campo pa peso de la mascota
        Label lblPeso = new Label("Peso (kg):");
        TextField txtPeso = new TextField();
        txtPeso.setPromptText("Ej: 4.5");

        // Lista pa seleccionar veterinario asignado
        Label lblVeterinario = new Label("Veterinario asignado:");
        ComboBox<String> cmbVeterinario = new ComboBox<>();
        cmbVeterinario.setPromptText("Seleccione el veterinario");
        // Aquí mete los veterinarios registrados
        //ejemplo del buen chato
        // cmbVeterinario.getItems().addAll(...);

        // Campo pa la identificación del veterinario
        Label lblIdVet = new Label("Identificación veterinario:");
        TextField txtIdVet = new TextField();
        txtIdVet.setPromptText("Ingrese la identificación");

        // Campo pa motivo de la consulta
        Label lblMotivo = new Label("Motivo de la consulta:");
        TextArea txtMotivo = new TextArea();
        txtMotivo.setPromptText("Explique el motivo de la consulta");
        txtMotivo.setPrefRowCount(3);

        // Botón pa guardar
        Button btnGuardar = new Button("Guardar Consulta");
        // Aquí mete la lógica pa guardar
        // btnGuardar.setOnAction(e -> { ... });

        // Organizamos todo en la cuadrícula
        grid.add(lblFecha, 0, 0);
        grid.add(datePicker, 1, 0);
        grid.add(lblHora, 0, 1);
        grid.add(txtHora, 1, 1);
        grid.add(lblMascota, 0, 2);
        grid.add(cmbMascota, 1, 2);
        grid.add(lblPeso, 0, 3);
        grid.add(txtPeso, 1, 3);
        grid.add(lblVeterinario, 0, 4);
        grid.add(cmbVeterinario, 1, 4);
        grid.add(lblIdVet, 0, 5);
        grid.add(txtIdVet, 1, 5);
        grid.add(lblMotivo, 0, 6);
        grid.add(txtMotivo, 1, 6);
        grid.add(btnGuardar, 1, 7);

        // Armamos la escena y la mostramos
        Scene scene = new Scene(grid, 550, 450);
        stage.setScene(scene);
        stage.show();
    }
}

