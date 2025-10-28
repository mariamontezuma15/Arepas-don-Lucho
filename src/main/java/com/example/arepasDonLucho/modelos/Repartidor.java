package com.example.arepasDonLucho.modelos;


import jakarta.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "repartidores")
public class Repartidor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nombres;

    @Column(nullable = false, unique = true, length = 20)
    private String documento;

    @Column(nullable = false, length = 15)
    private String telefono;

    @Column(name = "placa_vehiculo", nullable = false, length = 10)
    private String placaVehiculo;

    @Column(name = "zona_cobertura", length = 100)
    private String zonaCobertura;

    @Column(nullable = false)
    private Boolean activo = true;

    public Repartidor() {
    }

    public Repartidor(Long id, String nombres, String documento, String telefono, String placaVehiculo, String zonaCobertura, Boolean activo) {
        this.id = id;
        this.nombres = nombres;
        this.documento = documento;
        this.telefono = telefono;
        this.placaVehiculo = placaVehiculo;
        this.zonaCobertura = zonaCobertura;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getZonaCobertura() {
        return zonaCobertura;
    }

    public void setZonaCobertura(String zonaCobertura) {
        this.zonaCobertura = zonaCobertura;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}

