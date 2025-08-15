package co.edu.uniquindio.veterinaria.controllers;

import co.edu.uniquindio.veterinaria.controllers.Cita;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class GestionCitasController {

    @FXML private TableView<Cita> tablaCitas;
    @FXML private TableColumn<Cita, String> colMascota;
    @FXML private TableColumn<Cita, String> colPropietario;
    @FXML private TableColumn<Cita, LocalDate> colFecha;
    @FXML private TableColumn<Cita, String> colHora;
    @FXML private TableColumn<Cita, String> colVeterinario;
    @FXML private TableColumn<Cita, String> colIdVeterinario;
    @FXML private TableColumn<Cita, String> colMotivo;

    @FXML private DatePicker datePickerBusqueda;

    private ObservableList<Cita> listaCitas = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Configurar columnas
        colMascota.setCellValueFactory(data -> data.getValue().mascotaProperty());
        colPropietario.setCellValueFactory(data -> data.getValue().propietarioProperty());
        colFecha.setCellValueFactory(data -> data.getValue().fechaProperty());
        colHora.setCellValueFactory(data -> data.getValue().horaProperty());
        colVeterinario.setCellValueFactory(data -> data.getValue().veterinarioProperty());
        colIdVeterinario.setCellValueFactory(data -> data.getValue().idVeterinarioProperty());
        colMotivo.setCellValueFactory(data -> data.getValue().motivoProperty());

        // Cargar datos de ejemplo
        cargarDatosPrueba();
    }

    private void cargarDatosPrueba() {
        listaCitas.addAll(
                new Cita("Firulais", "Juan Pérez", LocalDate.now(), "10:00 AM", "Dr. López", "V001", "Vacunación"),
                new Cita("Michi", "Ana Gómez", LocalDate.now().plusDays(1), "2:00 PM", "Dra. Ramírez", "V002", "Chequeo general")
        );
        tablaCitas.setItems(listaCitas);
    }

    @FXML
    private void buscarPorFecha() {
        LocalDate fechaSeleccionada = datePickerBusqueda.getValue();
        if (fechaSeleccionada != null) {
            List<Cita> filtradas = listaCitas.stream()
                    .filter(c -> c.getFecha().equals(fechaSeleccionada))
                    .collect(Collectors.toList());
            tablaCitas.setItems(FXCollections.observableArrayList(filtradas));
        } else {
            tablaCitas.setItems(listaCitas); // si no hay fecha, mostrar todas
        }
    }

    @FXML
    private void volverMenu() {
        Stage stage = (Stage) tablaCitas.getScene().getWindow();
        stage.close();
    }
}
