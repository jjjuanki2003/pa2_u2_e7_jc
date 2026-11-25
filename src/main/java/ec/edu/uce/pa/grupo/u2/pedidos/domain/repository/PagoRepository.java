package ec.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import java.util.List;
import java.util.Optional;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Pago;

public interface PagoRepository {

    public void create(Pago pago);

    public Optional<Pago> read(Long id);

    public Optional<Pago> readByNumber(String numero);

    public List<Pago> readAll();
    public void update(Pago pago);
    public void delete(Long id);
}
