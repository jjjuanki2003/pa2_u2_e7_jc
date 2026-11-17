package ec.edu.uce.pa.grupo.u2.pedidos.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Envio {

    private Long id;
    private String direccionDestino;
    private LocalDateTime fechaEnvio;
    private LocalDateTime fechaEntrega;
    private String transportista;
    private String numeroSeguimiento;
    private BigDecimal costoEnvio;
    private String estado;
    private Venta venta;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDireccionDestino() {
        return direccionDestino;
    }
    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }
    public LocalDateTime getFechaEnvio() {
        return fechaEnvio;
    }
    public void setFechaEnvio(LocalDateTime fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }
    public LocalDateTime getFechaEntrega() {
        return fechaEntrega;
    }
    public void setFechaEntrega(LocalDateTime fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    public String getTransportista() {
        return transportista;
    }
    public void setTransportista(String transportista) {
        this.transportista = transportista;
    }
    public String getNumeroSeguimiento() {
        return numeroSeguimiento;
    }
    public void setNumeroSeguimiento(String numeroSeguimiento) {
        this.numeroSeguimiento = numeroSeguimiento;
    }
    public BigDecimal getCostoEnvio() {
        return costoEnvio;
    }
    public void setCostoEnvio(BigDecimal costoEnvio) {
        this.costoEnvio = costoEnvio;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Venta getVenta() {
        return venta;
    }
    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    

}
