module co.edu.uniquindio.veterinaria {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.veterinaria to javafx.fxml;
    exports co.edu.uniquindio.veterinaria;

    opens co.edu.uniquindio.veterinaria.controllers to javafx.fxml;
    exports co.edu.uniquindio.veterinaria.controllers;
}
