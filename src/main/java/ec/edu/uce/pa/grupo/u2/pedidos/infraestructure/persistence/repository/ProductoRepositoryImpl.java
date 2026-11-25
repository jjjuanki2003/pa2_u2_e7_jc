package ec.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Producto;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.ProductoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@ApplicationScoped 
public class ProductoRepositoryImpl implements ProductoRepository{

    @Inject
    EntityManager entityManager;

    @Override
    public void create(Producto producto) {
        this.entityManager.persist(producto);
    }

    @Override
    public Optional<Producto> read(Long id) {
        Producto producto = this.entityManager.find(Producto.class, id);
        return Optional.ofNullable(producto);
    }

    @Override
    public void update(Producto producto) {
        this.entityManager.merge(producto);
    }

    @Override
    public void delete(Long id) {
        
        read(id).ifPresent(entityManager::remove);
    }

    @Override
    public Optional<Producto> readByNombre(String nombre) {
        TypedQuery<Producto> query = this.entityManager.createQuery("SELECT p FROM Producto p WHERE p.nombre = :nombre", Producto.class);
        query.setParameter("nombre", nombre);
        return Optional.ofNullable(query.getSingleResult());
    }

    @Override
    public List<Producto> readAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readAll'");
    }

}
