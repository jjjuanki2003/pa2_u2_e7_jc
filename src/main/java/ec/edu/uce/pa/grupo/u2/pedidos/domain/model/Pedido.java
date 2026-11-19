package ec.edu.uce.pa.grupo.u2.pedidos.domain.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity //esta clase/entidad es administrada por Jakarta Persistence API (JPA)
@Table (name = "pedidos") //nombre de la tabla en la base de datos
public class Pedido {

    @Id
    @SequenceGenerator (name = "seq_pedido", sequenceName = "seq_pedido_db", allocationSize = 1) //nombre de la secuencia en la base de datos
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "seq_pedido") //nombre de la secuencia en la base de datos
    @Column(name = "pdd_id") //nombre de la columna en la tabla
    private Integer id;
    @Column(name = "pdd_producto") //nombre de la columna en la tabla
    private String producto;
    @Column(name = "pdd_precio") //nombre de la columna en la tabla
    private Double precio;

    @Column (name = "pdd_fecha") //nombre de la columna en la tabla
    private LocalDateTime fecha;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
