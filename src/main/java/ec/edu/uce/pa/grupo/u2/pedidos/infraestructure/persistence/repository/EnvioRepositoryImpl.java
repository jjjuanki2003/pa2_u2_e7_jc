package ec.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Envio;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.EnvioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@ApplicationScoped 
public class EnvioRepositoryImpl implements EnvioRepository{

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Envio envio) {
        this.entityManager.persist(envio);    
    }

    @Override
    public Optional<Envio> read(Long id) {

        Envio envio = this.entityManager.find(Envio.class, id); 
        return Optional.ofNullable(envio);
    }

    @Override
    public void update(Envio envio) {
        this.entityManager.merge(envio);
    }

    @Override
    public void delete(Long id) {
        read(id).ifPresent(entityManager::remove);
    }

    @Override
    public Optional<Envio> readByTransportista(String transportista) {
        TypedQuery<Envio> query = this.entityManager.createQuery("SELECT e FROM Envio e WHERE e.transportista = :transportista", Envio.class);
        query.setParameter("transportista", transportista);

        return Optional.ofNullable(query.getSingleResult());
    }

    @Override
    public List<Envio> readAll() {
        List<Envio> envios = this.entityManager.createQuery("SELECT e FROM Envio e", Envio.class).getResultList();
        return envios;
        
    }

    

}
