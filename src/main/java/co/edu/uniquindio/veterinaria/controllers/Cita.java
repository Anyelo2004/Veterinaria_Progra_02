package co.edu.uniquindio.veterinaria.controllers;

import java.time.LocalDate;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class Cita {
    private final StringProperty mascota;
    private final StringProperty propietario;
    private final ObjectProperty<LocalDate> fecha;
    private final StringProperty hora;
    private final StringProperty veterinario;
    private final StringProperty idVeterinario;
    private final StringProperty motivo;

    public Cita(String mascota, String propietario, LocalDate fecha, String hora, String veterinario, String idVeterinario, String motivo) {
        this.mascota = new SimpleStringProperty(mascota);
        this.propietario = new SimpleStringProperty(propietario);
        this.fecha = new SimpleObjectProperty<>(fecha);
        this.hora = new SimpleStringProperty(hora);
        this.veterinario = new SimpleStringProperty(veterinario);
        this.idVeterinario = new SimpleStringProperty(idVeterinario);
        this.motivo = new SimpleStringProperty(motivo);
    }

    public StringProperty mascotaProperty() { return mascota; }
    public StringProperty propietarioProperty() { return propietario; }
    public ObjectProperty<LocalDate> fechaProperty() { return fecha; }
    public StringProperty horaProperty() { return hora; }
    public StringProperty veterinarioProperty() { return veterinario; }
    public StringProperty idVeterinarioProperty() { return idVeterinario; }
    public StringProperty motivoProperty() { return motivo; }

    public LocalDate getFecha() { return fecha.get(); }
}
