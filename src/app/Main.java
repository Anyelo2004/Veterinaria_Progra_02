package app;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Menú Principal - Veterinaria");

        // Para poner el titulo sobre los botones
        Label titulo = new Label("Mundo Huellitas :papu");
        titulo.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        // Botones del menu
        Button btnCliente = new Button("Registrar Cliente");
        Button btnMascota = new Button("Registrar Mascota");
        Button btnEmpleado = new Button("Registrar Empleado");
        Button btnConsulta = new Button("Registrar Consulta");
        Button btnGestionar = new Button("Gestionar Consulta");

        // Acciones que va a tener el programa en este caso abrir las ventanas correspondientes
        btnCliente.setOnAction(e -> new RegistrarCliente().mostrar());
        btnMascota.setOnAction(e -> new RegistrarMascota().mostrar());
        btnEmpleado.setOnAction(e -> new RegistrarEmpleado().mostrar());
        btnConsulta.setOnAction(e -> new RegistrarConsulta().mostrar());
        btnGestionar.setOnAction(e -> new GestionarConsultas().mostrar());

        // Diseño (odiamos a las de diseño >:( )
        VBox layout = new VBox(15, titulo, btnCliente, btnMascota, btnEmpleado, btnConsulta, btnGestionar);
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(20));

        Scene scene = new Scene(layout, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
