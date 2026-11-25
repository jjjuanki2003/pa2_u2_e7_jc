package ec.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Venta;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.VentaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@ApplicationScoped 
public class VentaRepositoryImpl implements VentaRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Venta venta) {
        this.entityManager.persist(venta);
    }


    @Override
    public void update(Venta venta) {
        this.entityManager.merge(venta);
    }

    @Override
    public void delete(Long id) {
        read(id).ifPresent(entityManager::remove); 
    }


    @Override
    public Optional<Venta> read(Long id) {  
        Venta venta = this.entityManager.find(Venta.class, id);
        return Optional.ofNullable(venta);
    }


    @Override
    public Optional<Venta> readByNumber(String numeroVenta) {
        TypedQuery<Venta> query = this.entityManager.createQuery("SELECT v FROM Venta v WHERE v.numeroVenta = :numeroVenta", Venta.class);
        query.setParameter("numeroVenta", numeroVenta);
        return Optional.ofNullable(query.getSingleResult());
    }


    @Override
    public List<Venta> readAll() {
        List<Venta> ventas = this.entityManager.createQuery("SELECT * FROM Venta", Venta.class).getResultList();
        return ventas;
    }  

}
