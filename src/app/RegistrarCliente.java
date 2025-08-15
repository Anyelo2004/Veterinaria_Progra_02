package app;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RegistrarCliente {

    public void mostrar() {
        Stage stage = new Stage();
        stage.setTitle("Registrar Cliente");

        // Armamos un GridPane, que es como una tabla pa poner todo ordenadito
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER); // Todo centrado, porque nos gusta bonito y las culonas 
        grid.setPadding(new Insets(20)); // Espacio interno pa que no quede pegado
        grid.setHgap(10); // Espacio horizontal entre columnas
        grid.setVgap(10); // Espacio vertical entre filas

        // Campo pa poner el nombre del cliente
        Label lblNombre = new Label("Nombre:");
        TextField txtNombre = new TextField();
        txtNombre.setPromptText("Ingrese el nombre del cliente");

        // Campo pa el teléfono (pa llamarlo si se nos pierde la mascota)
        Label lblTelefono = new Label("Teléfono:");
        TextField txtTelefono = new TextField();
        txtTelefono.setPromptText("Ingrese el teléfono");

        // Campo pa la dirección (por si toca ir a hacerle la vuelta)
        Label lblDireccion = new Label("Dirección:");
        TextField txtDireccion = new TextField();
        txtDireccion.setPromptText("Ingrese la dirección");

        // Botón para guardar (aquí es donde que mete la lógica hace la magia)
        Button btnGuardar = new Button("Guardar Cliente");
        // Ejemplo de lo que podría ir sacado por el buen chato:
        // btnGuardar.setOnAction(e -> { guardarCliente(txtNombre.getText(), txtTelefono.getText(), txtDireccion.getText()); });

        // Metemos cada cosa en su lugar en la tabla (GridPane)
        grid.add(lblNombre, 0, 0);
        grid.add(txtNombre, 1, 0);
        grid.add(lblTelefono, 0, 1);
        grid.add(txtTelefono, 1, 1);
        grid.add(lblDireccion, 0, 2);
        grid.add(txtDireccion, 1, 2);
        grid.add(btnGuardar, 1, 3);

        // Armamos la escena (pantalla) y la mostramos
        Scene scene = new Scene(grid, 400, 250);
        stage.setScene(scene);
        stage.show();
    }
}


