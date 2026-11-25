package ec.edu.uce.pa.grupo.u2.pedidos.domain.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity 
@Table (name = "envios")
public class Envio {

    @Id 
    @SequenceGenerator (name = "seq_envio", sequenceName = "seq_envio_db", allocationSize = 1)
    @GeneratedValue (strategy = jakarta.persistence.GenerationType.SEQUENCE, generator = "seq_envio")
    private Long id;
    @Column (name = "env_direccion_destino")
    private String direccionDestino;
    @Column (name = "env_fecha_envio")
    private LocalDateTime fechaEnvio;
    @Column (name = "env_fecha_entrega")
    private LocalDateTime fechaEntrega;
    @Column (name = "env_transportista")
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
    @Override
    public String toString() {
        return "Envio [id=" + id + ", direccionDestino=" + direccionDestino + ", fechaEnvio=" + fechaEnvio
                + ", fechaEntrega=" + fechaEntrega + ", transportista=" + transportista + "]";
    }

    
}
