package ec.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import java.util.Optional;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Cliente;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.ClienteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@ApplicationScoped 

public class ClienteRepositoryImpl implements ClienteRepository{

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Cliente cliente) {
        entityManager.persist(cliente);
    }

    @Override
    public Optional<Cliente> read(Long id) {
        Cliente cliente = entityManager.find(Cliente.class, id);
        return Optional.ofNullable(cliente);
    }

    @Override
    public Optional<Cliente> readByName(String nombre) {
        TypedQuery<Cliente> query = this.entityManager.createQuery("SELECT c FROM Cliente c WHERE c.nombre = :nombre", Cliente.class);
        query.setParameter("nombre", nombre);
        return Optional.ofNullable(query.getSingleResult());
    }

    @Override
    public Optional<Cliente> readAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readAll'");
    }

    @Override
    public void update(Cliente cliente) {
        entityManager.merge(cliente);
    }

    @Override
    public void delete(Long id) {
        read(id).ifPresent(entityManager::remove);
    }

    

}
