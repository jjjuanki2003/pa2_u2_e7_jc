package ec.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import java.util.Optional;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Cliente;

public interface ClienteRepository {

    public void create(Cliente cliente);
    public Optional<Cliente> read(Long id);
    public Optional<Cliente> readByName(String nombre);
    public Optional<Cliente> readAll();
    public void update(Cliente cliente);
    public void delete(Long id);

}
