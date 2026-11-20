package ec.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Pago;

public interface PagoRepository {

    public void create(Pago pago);
    public Pago read(Long id);
    public void update(Pago pago);
    public void delete(Long id);
}
