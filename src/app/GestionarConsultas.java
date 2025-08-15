package app;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GestionarConsultas {

    public void mostrar() {
        Stage stage = new Stage();
        stage.setTitle("Gestionar Consulta");

        // Campo para buscar por fecha
        Label lblBuscar = new Label("Buscar por fecha:");
        DatePicker datePicker = new DatePicker();
        Button btnBuscar = new Button("Buscar");

        // Barra de búsqueda pa darle flow
        HBox barraBusqueda = new HBox(10, lblBuscar, datePicker, btnBuscar);
        barraBusqueda.setPadding(new Insets(10));

        // Tabla de consultas
        TableView<String[]> table = new TableView<>();
        //columnas de tablas para la gestion
        TableColumn<String[], String> colPropietario = new TableColumn<>("Propietario");
        TableColumn<String[], String> colMascota = new TableColumn<>("Mascota");
        TableColumn<String[], String> colHora = new TableColumn<>("Hora");
        TableColumn<String[], String> colVeterinario = new TableColumn<>("Veterinario");
        TableColumn<String[], String> colMotivo = new TableColumn<>("Motivo");
        TableColumn<String[], String> colPeso = new TableColumn<>("Peso");

        colPropietario.setPrefWidth(120);
        colMascota.setPrefWidth(100);
        colHora.setPrefWidth(80);
        colVeterinario.setPrefWidth(120);
        colMotivo.setPrefWidth(150);
        colPeso.setPrefWidth(80);

        table.getColumns().addAll(colPropietario, colMascota, colHora, colVeterinario, colMotivo, colPeso);
        //es solo una advertencia, no afecta el codigo
        VBox layout = new VBox(10, barraBusqueda, table);
        layout.setPadding(new Insets(10));

        Scene scene = new Scene(layout, 750, 350);
        stage.setScene(scene);
        stage.show();
    }
}

//esto lo trabajo yo cuando terminen