package app;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RegistrarMascota {

    public void mostrar() {
        Stage stage = new Stage();
        stage.setTitle("Registrar Mascota");

        // Usamos un GridPane pa que quede todo ordenadito en filas y columnas
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(20));
        grid.setHgap(10); // Espacio horizontal entre columnas
        grid.setVgap(10); // Espacio vertical entre filas

        // Nombre de la mascota
        Label lblNombre = new Label("Nombre:");
        TextField txtNombre = new TextField();
        txtNombre.setPromptText("Ingrese el nombre de la mascota");

        // Especie de la mascota
        Label lblEspecie = new Label("Especie:");
        TextField txtEspecie = new TextField();
        txtEspecie.setPromptText("Ingrese la especie");

        // Raza
        Label lblRaza = new Label("Raza:");
        TextField txtRaza = new TextField();
        txtRaza.setPromptText("Ingrese la raza");

        // Edad
        Label lblEdad = new Label("Edad:");
        TextField txtEdad = new TextField();
        txtEdad.setPromptText("Ingrese la edad");

        // Identificación de la mascota
        Label lblIdentificacion = new Label("Identificación:");
        TextField txtIdentificacion = new TextField();
        txtIdentificacion.setPromptText("Ingrese el número de identificación");

        // Lista pa escoger el dueño (ComboBox)
        Label lblPropietario = new Label("Propietario:");
        ComboBox<String> comboPropietario = new ComboBox<>();
        comboPropietario.setPromptText("Seleccione un propietario");
        // aquí se hace la lógica donde se mete los propietarios registrados
        // Ejemplo sacado de chat gpt: comboPropietario.getItems().addAll("Juan Pérez",
        // "María Gómez");

        // Botón pa guardar la info de la mascota
        Button btnGuardar = new Button("Guardar Mascota");
        // Aquí va la validación: si no selecciona dueño, mostrar mensaje
        // if (comboPropietario.getValue() == null) { mostrar mensaje "La mascota
        // necesita un propietario"; }

        // Vamos metiendo todo al Grid pa que se vea lindo
        grid.add(lblNombre, 0, 0);
        grid.add(txtNombre, 1, 0);
        grid.add(lblEspecie, 0, 1);
        grid.add(txtEspecie, 1, 1);
        grid.add(lblRaza, 0, 2);
        grid.add(txtRaza, 1, 2);
        grid.add(lblEdad, 0, 3);
        grid.add(txtEdad, 1, 3);
        grid.add(lblIdentificacion, 0, 4);
        grid.add(txtIdentificacion, 1, 4);
        grid.add(lblPropietario, 0, 5);
        grid.add(comboPropietario, 1, 5);
        grid.add(btnGuardar, 1, 6);

        // Creamos la ventana y la mostramos
        Scene scene = new Scene(grid, 450, 350);
        stage.setScene(scene);
        stage.show();
    }
}
