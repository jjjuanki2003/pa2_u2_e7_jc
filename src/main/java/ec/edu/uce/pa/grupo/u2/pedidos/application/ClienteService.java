package ec.edu.uce.pa.grupo.u2.pedidos.application;

import java.util.Optional;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Cliente;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.ClienteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped 
@Transactional 
public class ClienteService {

    @Inject 
    private ClienteRepository clienteRepository;

    public void guardar(Cliente cliente) {
        this.clienteRepository.create(cliente);
    }

    public Optional<Cliente> buscarPorId(Long id) {
        return this.clienteRepository.read(id);
    }

    public Optional<Cliente> buscarPorNombre(String nombre) {
        return this.clienteRepository.readByName(nombre);
    }

    public void actualizar(Cliente cliente) {
        this.clienteRepository.update(cliente);
    }

    public void eliminar(Long id) {
        this.clienteRepository.delete(id);
    }

}
