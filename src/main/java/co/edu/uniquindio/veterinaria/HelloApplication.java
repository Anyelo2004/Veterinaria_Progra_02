package co.edu.uniquindio.veterinaria;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(
                HelloApplication.class.getResource("/co/edu/uniquindio/veterinaria/MenuPrincipal.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setTitle("Veterinaria - Menú principal");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
