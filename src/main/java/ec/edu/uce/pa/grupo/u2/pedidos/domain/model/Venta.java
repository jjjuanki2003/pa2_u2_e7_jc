    package ec.edu.uce.pa.grupo.u2.pedidos.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity 
@Table (name = "ventas")
public class Venta {

    @Id 
    @SequenceGenerator (name = "seq_venta", sequenceName = "seq_venta_db", allocationSize = 1)
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "seq_venta")
    private Long id; 
    @Column (name = "ven_numero_venta")
    private String numeroVenta;
    @Column (name = "ven_fecha")
    private LocalDateTime fecha;
    @Column (name = "ven_subtotal")
    private BigDecimal subtotal;
    @Column (name = "ven_descuento")
    private BigDecimal descuento;
    @Column (name = "ven_total")
    private BigDecimal total;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNumeroVenta() {
        return numeroVenta;
    }
    public void setNumeroVenta(String numeroVenta) {
        this.numeroVenta = numeroVenta;
    }
    public LocalDateTime getFecha() {
        return fecha;
    }
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
    public BigDecimal getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }
    public BigDecimal getDescuento() {
        return descuento;
    }
    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }
    public BigDecimal getTotal() {
        return total;
    }
    public void setTotal(BigDecimal total) {
        this.total = total;
    }
    @Override
    public String toString() {
        return "Venta [id=" + id + ", numeroVenta=" + numeroVenta + ", fecha=" + fecha + ", subtotal=" + subtotal
                + ", descuento=" + descuento + ", total=" + total + "]";
    }

    
}
