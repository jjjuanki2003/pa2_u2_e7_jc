package ec.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Producto;

public interface ProductoRepository {

    public void create(Producto producto);
    public Producto read(Long id);
    public void update(Producto producto);
    public void delete(Long id);

}
