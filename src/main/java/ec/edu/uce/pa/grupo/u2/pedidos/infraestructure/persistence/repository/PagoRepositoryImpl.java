package ec.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Pago;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.PagoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@ApplicationScoped
public class PagoRepositoryImpl implements PagoRepository{

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Pago pago) {
        this.entityManager.persist(pago);
    }

    @Override
    public Optional<Pago> read(Long id) {
        
        Pago pago = this.entityManager.find(Pago.class, id);
        return Optional.ofNullable(pago);
    }

    @Override
    public void update(Pago pago) {
        this.entityManager.merge(pago);
    }

    @Override
    public void delete(Long id) {
        
        read(id).ifPresent(entityManager::remove);
    }

    @Override
    public Optional<Pago> readByNumber(String numero) {
        TypedQuery<Pago> query = this.entityManager.createQuery("Select p FROM Pago p WHERE p.numero = :numero", Pago.class);
        query.setParameter("numero", numero);
        return Optional.ofNullable(query.getSingleResult());
    }

    @Override
    public List<Pago> readAll() {
        List<Pago> pagos = this.entityManager.createQuery("SELECT p FROM Pago p", Pago.class).getResultList();
        return pagos;
    
    }

}
