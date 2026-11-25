package ec.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Venta;

public interface VentaRepository {

      //Create
    public void create(Venta venta);
    //Read
    public Optional<Venta> read(Long id);
    public Optional<Venta> readByNumber(String numeroVenta);
    public List<Venta> readAll();
    //Update
    public void update(Venta venta);
    //Delete
    public void delete(Long id);
}
