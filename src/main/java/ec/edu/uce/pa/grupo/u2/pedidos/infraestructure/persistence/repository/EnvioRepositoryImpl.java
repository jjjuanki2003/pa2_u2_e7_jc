package ec.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Envio;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.EnvioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class EnvioRepositoryImpl implements EnvioRepository{

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Envio envio) {
        this.entityManager.persist(envio);    
    }

    @Override
    public Envio read(Long id) {
        return this.entityManager.find(Envio.class, id);
    }

    @Override
    public void update(Envio envio) {
        this.entityManager.merge(envio);
    }

    @Override
    public void delete(Long id) {
        this.entityManager.remove(read(id));
    }

    

}
