package ec.edu.uce.pa.grupo.u2.pedidos.domain.model;

import java.time.LocalDateTime;

public class Envio {

    private Long id;
    private String direccionDestino;
    private LocalDateTime fechaEnvio;
    private LocalDateTime fechaEntrega;
    private String transportista;

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
}
