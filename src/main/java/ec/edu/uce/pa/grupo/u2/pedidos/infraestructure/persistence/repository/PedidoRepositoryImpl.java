package ec.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import java.lang.classfile.ClassFile.Option;
import java.util.List;
import java.util.Optional;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.PedidoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

@ApplicationScoped 
public class PedidoRepositoryImpl implements PedidoRepository {

    @Inject 
    private EntityManager entityManager;

    @Override
    public void create(Pedido pedido) {

        this.entityManager.persist(pedido);
    }

    @Override
    public Optional<Pedido> read(Integer id) {
        Pedido pedido = this.entityManager.find(Pedido.class, id);

        return Optional.ofNullable(pedido);
    }

    @Override
    public void update(Pedido pedido) {
        this.entityManager.merge(pedido);
    }

    @Override
    public void delete(Integer id) {

        Optional<Pedido> pedido = this.read(id);
        this.entityManager.remove(pedido.get());
        pedido.ifPresent(this.entityManager::remove);
 
    }

    @Override
    public Optional<Pedido> readByNumber(String numero) {

        TypedQuery<Pedido> query = this.entityManager.createQuery("SELECT p FROM Pedido p WHERE p.numero = :numeroVariable", Pedido.class);
        query.setParameter("numeroVariable", numero);
        return Optional.ofNullable(query.getSingleResult());
        
     }

    @Override
    public List<Pedido> readAll() {
        TypedQuery<Pedido> query = this.entityManager.createQuery("SELECT p FROM Pedido p", Pedido.class);

        return query.getResultList();
    }
    @Override
    public Optional<Pedido> readByNumberNative(String numero) {
        Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM pedidos p WHERE p.pdd_numero = :numero", Pedido.class);
        myQuery.setParameter("numero", numero);

        return Optional.ofNullable((Pedido) myQuery.getSingleResult());
    }
    @Override
    public List<Pedido> readAllNative() {
        List<Pedido> myQuery = this.entityManager.createNativeQuery("SELECT * FROM pedidos p", Pedido.class).getResultList();

        return myQuery;
    }
    

 
}
