package ec.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Producto;

public interface ProductoRepository {

    public void create(Producto producto);
    public Optional<Producto> read(Long id);
    public Optional<Producto> readByNombre(String nombre);
    public List<Producto> readAll();
    public void update(Producto producto);
    public void delete(Long id);

}
