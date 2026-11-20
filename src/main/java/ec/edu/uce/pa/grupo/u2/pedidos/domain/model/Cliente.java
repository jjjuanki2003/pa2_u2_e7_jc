package ec.edu.uce.pa.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table (name = "clientes") //nombre de la tabla en la base de datos
public class Cliente {

    @Id 
    @SequenceGenerator (name = "seq_cliente", sequenceName = "seq_cliente_db", allocationSize = 1) //nombre de la secuencia en la base de datos
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "seq_cliente") //
    private Long id;
    @Column(name = "cli_nombre") //nombre de la columna en la tabla
    private String nombre;
    @Column(name = "cli_apellido") //nombre de la columna en la tabla
    private String apellido;
    @Column(name = "cli_cedula") //nombre de la columna en la tabla
    private String cedula;
    @Column(name = "cli_telefono") //nombre de la columna en la tabla
    private String telefono;
    
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
