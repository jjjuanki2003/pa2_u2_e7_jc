package ec.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Cliente;

public interface ClienteRepository {

    public void create(Cliente cliente);
    public Cliente read(Long id);
    public void update(Cliente cliente);
    public void delete(Long id);

}
