package ec.edu.uce.pa.grupo.u2.pedidos.application;

import java.util.Optional;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Producto;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.ProductoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped 
@Transactional 
public class ProductoService {

    @Inject
    private ProductoRepository pedidoRepository;

    public void guardar(Producto producto) {
        this.pedidoRepository.create(producto);
    }

    public Optional<Producto> findById(Long id) {
        return this.pedidoRepository.read(id);
    }

    public Optional<Producto> findByName(String nombre){ 
        return this.pedidoRepository.readByNombre(nombre);
    }

    public void actualizar(Producto producto) {
        this.pedidoRepository.update(producto);
    }

    public void eliminar(Long id) { 
        this.pedidoRepository.delete(id);
    }
}
