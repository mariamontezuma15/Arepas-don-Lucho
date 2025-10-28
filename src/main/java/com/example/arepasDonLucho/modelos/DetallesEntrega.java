package com.example.arepasDonLucho.modelos;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "detalles_entrega")
public class DetallesEntrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hora_salida_cocina")
    private LocalDateTime horaSalidaCocina;

    @Column(name = "hora_entrega_cliente")
    private LocalDateTime horaEntregaCliente;

    @Column(nullable = false, length = 50)
    private String estado;

    @Column(name = "foto_prueba")
    private String fotoPrueba;

    @Column(name = "intento_fallido")
    private Boolean intentoFallido;

    @OneToOne
    @JoinColumn(name = "pedido_id", nullable = false, unique = true)
    private Pedido pedido;

    public DetallesEntrega() {
    }

    public DetallesEntrega(Long id, LocalDateTime horaSalidaCocina, LocalDateTime horaEntregaCliente, String estado, String fotoPrueba, Boolean intentoFallido, Pedido pedido) {
        this.id = id;
        this.horaSalidaCocina = horaSalidaCocina;
        this.horaEntregaCliente = horaEntregaCliente;
        this.estado = estado;
        this.fotoPrueba = fotoPrueba;
        this.intentoFallido = intentoFallido;
        this.pedido = pedido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getHoraSalidaCocina() {
        return horaSalidaCocina;
    }

    public void setHoraSalidaCocina(LocalDateTime horaSalidaCocina) {
        this.horaSalidaCocina = horaSalidaCocina;
    }

    public LocalDateTime getHoraEntregaCliente() {
        return horaEntregaCliente;
    }

    public void setHoraEntregaCliente(LocalDateTime horaEntregaCliente) {
        this.horaEntregaCliente = horaEntregaCliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFotoPrueba() {
        return fotoPrueba;
    }

    public void setFotoPrueba(String fotoPrueba) {
        this.fotoPrueba = fotoPrueba;
    }

    public Boolean getIntentoFallido() {
        return intentoFallido;
    }

    public void setIntentoFallido(Boolean intentoFallido) {
        this.intentoFallido = intentoFallido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}