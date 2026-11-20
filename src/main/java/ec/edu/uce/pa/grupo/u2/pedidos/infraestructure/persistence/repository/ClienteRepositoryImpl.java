package ec.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Cliente;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.ClienteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 

public class ClienteRepositoryImpl implements ClienteRepository{

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Cliente cliente) {
        entityManager.persist(cliente);
    }

    @Override
    public Cliente read(Long id) {
        return entityManager.find(Cliente.class, id);
    }

    @Override
    public void update(Cliente cliente) {
        entityManager.merge(cliente);
    }

    @Override
    public void delete(Long id) {
        entityManager.remove(this.read(id));
    }

}
