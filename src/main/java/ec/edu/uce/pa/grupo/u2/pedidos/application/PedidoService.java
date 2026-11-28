package ec.edu.uce.pa.grupo.u2.pedidos.application;

import java.util.Optional;
import java.util.List;

import ec.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import ec.edu.uce.pa.grupo.u2.pedidos.domain.repository.PedidoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped 
@Transactional
public class PedidoService {

    @Inject 
    private PedidoRepository pedidoRepository;

    public void guardar(Pedido pedido) {
        this.pedidoRepository.create(pedido);
    }

    public Optional<Pedido> buscarPorId(Integer id) {
        return this.pedidoRepository.read(id);
    }

    public Optional<Pedido> buscarPorNumero(String numero) {
        return this.pedidoRepository.readByNumber(numero);
    }

    public Optional<Pedido> buscarPorNumeroNative(String numero) {
        return this.pedidoRepository.readByNumberNative(numero);
    }
    
    public List<Pedido> buscarTodos() {
        return this.pedidoRepository.readAll();
    }

    public List<Pedido> buscarTodosNative() {
        return this.pedidoRepository.readAllNative();
    }

    public void actualizar(Pedido pedido) {
        this.pedidoRepository.update(pedido);
    }

    public void eliminar(Integer id) {
        this.pedidoRepository.delete(id);
    }

    
}
