package com.example.arepasDonLucho.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50, nullable = false)
    private String nombre;
    @Column(length = 50, nullable = false)
    private String tipoDocumento;
    @Column(length = 50, nullable = false)
    private Integer numeroDocumento;
    @Column(length = 50, nullable = false)
    private Integer telefono;
    @Column(length = 50, nullable = false)
    private String email;

    @OneToOne(mappedBy = "Cliente")
    private DireccionEntrega direccionEntrega;

    public Cliente() {
    }

    public Cliente(Integer id, String nombre, String tipoDocumento, Integer numeroDocumento, Integer telefono, String email, Cliente cliente) {
        this.id = id;
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.telefono = telefono;
        this.email = email;
        this.direccionEntrega = direccionEntrega;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Integer getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(Integer numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DireccionEntrega getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(DireccionEntrega direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }
}
